drop database if exists epa_db;
create database epa_db;
grant all on epa_db.* to epa_r with grant option;
set password for epa_r = password('12348765');

use epa_db;

create table system_user (
    id int unsigned primary key auto_increment,
    email varchar(255) unique,
    system_entity_id bigint unsigned
) engine=innodb;

create table system_operation (
    id int unsigned primary key,
    name varchar(255)
) engine=innodb;

create table system_operation_result (
    id int unsigned primary key,
    system_operation_id int unsigned,
    description varchar(255),
    code varchar(255),
    message varchar(255),
    foreign key (system_operation_id) references system_operation (id)
) engine=innodb;

create table system_process (
    id bigint unsigned primary key auto_increment,
    system_operation_id int unsigned,
    issued_by_id int unsigned,
    started_at datetime,
    finished_at datetime,
    system_operation_result_id int unsigned,
    remarks varchar(255),
    exception text,
    foreign key (system_operation_id) references system_operation (id),
    foreign key (issued_by_id) references system_user (id),
    foreign key (system_operation_result_id) references system_operation_result (id)
) engine=innodb;

create table system_class (
    id int unsigned primary key,
    name varchar(255)
) engine=innodb;

create table system_entity (
    id bigint unsigned primary key auto_increment,
    system_class_id int unsigned,
    creation_process_id bigint unsigned,
    last_system_log_id bigint unsigned,
    foreign key (system_class_id) references system_class (id),
    foreign key (creation_process_id) references system_process (id)
) engine=innodb;

create table system_status (
    id int unsigned primary key,
    system_entity_id bigint unsigned,
    name varchar(255),
    foreign key (system_entity_id) references system_entity (id)
) engine=innodb;

create table system_event (
    id int unsigned primary key,
    system_entity_id bigint unsigned,
    description varchar(255),
    foreign key (system_entity_id) references system_entity (id)
) engine=innodb;

create table system_transition (
    id int unsigned primary key auto_increment,
    system_event_id int unsigned,
    prev_system_status_id int unsigned,
    post_system_status_id int unsigned,
    foreign key (system_event_id) references system_event (id),
    foreign key (prev_system_status_id) references system_status (id),
    foreign key (post_system_status_id) references system_status (id)
) engine=innodb;

create table system_log (
    id bigint unsigned primary key auto_increment,
    system_entity_id bigint unsigned,
    system_transition_id int unsigned,
    system_status_id int unsigned,
    issued_at datetime,
    process_id bigint unsigned,
    foreign key (system_entity_id) references system_entity (id),
    foreign key (system_transition_id) references system_transition (id),
    foreign key (system_status_id) references system_status (id),
    foreign key (process_id) references system_process (id)
) engine=innodb;

alter table system_user add foreign key (system_entity_id) references system_entity (id);

alter table system_entity add foreign key (last_system_log_id) references system_log (id);