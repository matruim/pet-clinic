package com.jaredgood.petclinic.repositories;

import com.jaredgood.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
