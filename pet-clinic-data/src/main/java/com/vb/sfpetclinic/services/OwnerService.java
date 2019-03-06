package com.vb.sfpetclinic.services;

import com.vb.sfpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by venugopal on 2019-03-06.
 */
public interface OwnerService {

    Owner findByLastname(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
