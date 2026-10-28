package com.seduc2.pet.Repository;

import com.seduc2.pet.Entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
