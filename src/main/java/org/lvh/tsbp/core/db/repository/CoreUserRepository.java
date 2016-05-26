package org.lvh.tsbp.core.db.repository;

import org.lvh.tsbp.core.db.model.CoreUser;
import org.lvh.tsbp.core.db.repository.base.ReadOnlyJpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by lvercelli on 5/23/16.
 */
@RepositoryRestResource(path = "users", collectionResourceRel = "users",
        collectionResourceDescription = @Description("Usuarios del sistema"))
public interface CoreUserRepository extends ReadOnlyJpaRepository<CoreUser, Integer> {
}
