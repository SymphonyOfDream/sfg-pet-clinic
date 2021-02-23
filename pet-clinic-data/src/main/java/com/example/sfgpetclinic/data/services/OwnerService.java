package com.example.sfgpetclinic.data.services;

import com.example.sfgpetclinic.data.models.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
