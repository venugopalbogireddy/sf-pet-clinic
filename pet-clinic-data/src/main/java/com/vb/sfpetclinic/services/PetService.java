package com.vb.sfpetclinic.services;

import com.vb.sfpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by venugopal on 2019-03-06.
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
