package org.lvh.tsbp.db.repository;

import org.lvh.tsbp.db.model.SystemUser;
import org.lvh.tsbp.db.repository.base.ReadOnlyJpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by lvercelli on 5/23/16.
 */
@RepositoryRestResource(path = "/users")
public interface SystemUserRepository extends ReadOnlyJpaRepository<SystemUser, Integer> {
}
