package com.vb.sfpetclinic.services;

import java.util.Set;

/**
 * Created by venugopal on 2019-03-06.
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findByID(ID id);

    T save(T object);

    void delete(T object);

    void deleteByID(ID id);
}
