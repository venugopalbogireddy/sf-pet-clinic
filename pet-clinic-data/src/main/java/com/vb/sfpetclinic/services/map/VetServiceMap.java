package com.vb.sfpetclinic.services.map;

import com.vb.sfpetclinic.model.Vet;
import com.vb.sfpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by venugopal on 2019-03-06.
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }
}
