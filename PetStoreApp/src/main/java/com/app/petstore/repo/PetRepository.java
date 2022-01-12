package com.app.petstore.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.petstore.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {

}