package com.jaredgood.petclinic.repositories;

import com.jaredgood.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
