package com.vb.sfpetclinic.services.map;

import com.vb.sfpetclinic.model.Pet;
import com.vb.sfpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by venugopal on 2019-03-06.
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }
}
