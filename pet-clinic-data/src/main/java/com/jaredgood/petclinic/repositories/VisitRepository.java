package com.jaredgood.petclinic.repositories;

import com.jaredgood.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
