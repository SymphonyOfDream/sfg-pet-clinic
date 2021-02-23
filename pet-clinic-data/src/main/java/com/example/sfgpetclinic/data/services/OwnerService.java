package com.example.sfgpetclinic.data.services;

import com.example.sfgpetclinic.data.models.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
