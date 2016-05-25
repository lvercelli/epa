package org.lvh.tsbp.core.db.repository;

import org.lvh.tsbp.core.db.model.SystemUser;
import org.lvh.tsbp.core.db.repository.base.ReadOnlyJpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by lvercelli on 5/23/16.
 */
@RepositoryRestResource(path = "core-users", collectionResourceRel = "core-users",
        collectionResourceDescription = @Description("Usuarios del sistema"))
public interface SystemUserRepository extends ReadOnlyJpaRepository<SystemUser, Integer> {
}
