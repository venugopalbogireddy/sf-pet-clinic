package com.vb.sfpetclinic.services;

import com.vb.sfpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by venugopal on 2019-03-06.
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
