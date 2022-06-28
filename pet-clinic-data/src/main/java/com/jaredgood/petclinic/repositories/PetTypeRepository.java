package com.jaredgood.petclinic.repositories;

import com.jaredgood.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
