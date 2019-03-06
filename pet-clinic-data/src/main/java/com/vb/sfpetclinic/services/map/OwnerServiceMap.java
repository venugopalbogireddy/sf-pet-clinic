package com.vb.sfpetclinic.services.map;

import com.vb.sfpetclinic.model.Owner;
import com.vb.sfpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by venugopal on 2019-03-06.
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }
}
