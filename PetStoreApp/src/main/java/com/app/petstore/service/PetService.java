package com.app.petstore.service;


import com.app.petstore.model.Pet;
public interface PetService {

	public String savePet(Pet pet) ;
	public Pet getPet(Integer id);
	public Pet updatePet(Integer id ,Pet pet);
	public String deletPet(Integer id);
}