package com.example.sfgpetclinic.data.services;

import com.example.sfgpetclinic.data.models.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();

}
