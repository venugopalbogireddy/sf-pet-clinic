package com.vb.sfpetclinic.services;

import com.vb.sfpetclinic.model.Owner;

/**
 * Created by venugopal on 2019-03-06.
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastname(String lastName);

//    Owner findByID(Long id);
//
//    These can be removed as they are implemented by the CrudService
//
//    Owner save(Owner owner);
//
//    Set<Owner> findAll();
}
