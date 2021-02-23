package com.example.sfgpetclinic.data.services.map;


import com.example.sfgpetclinic.data.models.Pet;
import com.example.sfgpetclinic.data.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
