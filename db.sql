drop database if exists epa_db;
create database epa_db;
grant all on epa_db.* to epa_r with grant option;
set password for epa_r = password('12348765');

use epa_db;

