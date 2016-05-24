package org.lvh.epa.repository.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.rest.core.annotation.RestResource;

import java.io.Serializable;

/**
 * Created by lvercelli on 5/24/16.
 */
@NoRepositoryBean
public interface ReadOnlyJpaRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {

    @Override
    @RestResource(exported = false)
    <S extends T> S save(S s);

    @Override
    @RestResource(exported = false)
    void delete(ID id);
}
