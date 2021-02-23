package com.example.sfgpetclinic.data.services.map;


import com.example.sfgpetclinic.data.models.Vet;
import com.example.sfgpetclinic.data.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}
