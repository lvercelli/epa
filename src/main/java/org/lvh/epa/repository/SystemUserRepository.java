package org.lvh.epa.repository;

import org.lvh.epa.model.SystemUser;
import org.lvh.epa.repository.base.ReadOnlyJpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by lvercelli on 5/23/16.
 */
@RepositoryRestResource(path = "/users")
public interface SystemUserRepository extends ReadOnlyJpaRepository<SystemUser, Integer> {
}
