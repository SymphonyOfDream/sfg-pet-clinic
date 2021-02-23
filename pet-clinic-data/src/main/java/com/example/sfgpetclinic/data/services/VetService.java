package com.example.sfgpetclinic.data.services;

import com.example.sfgpetclinic.data.models.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet pet);
    Set<Vet> findAll();

}
