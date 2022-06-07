package com.jaredgood.petclinic.services;

import com.jaredgood.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
