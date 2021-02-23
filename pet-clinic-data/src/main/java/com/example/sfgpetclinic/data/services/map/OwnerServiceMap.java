package com.example.sfgpetclinic.data.services.map;

import com.example.sfgpetclinic.data.models.Owner;
import com.example.sfgpetclinic.data.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
}
