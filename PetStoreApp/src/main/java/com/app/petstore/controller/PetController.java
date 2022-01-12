package com.app.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.petstore.model.Pet;
import com.app.petstore.service.PetService;

@RestController
@RequestMapping("/v2")
public class PetController {
	@Autowired
	PetService petService;

	@PostMapping("/pet")
	public String savePet(Pet pet) {
		String message = null;
		if (pet != null) {
			petService.savePet(pet);
			return message = "Pet stored succesfully !!!";
		} else {
			return message = "Pet not stored succesfully !!!";
		}

	}
	
	@PutMapping("/pet/{addpet}")
	public String updatePet(@PathVariable(value = "addpet") Integer addpet,@RequestBody Pet pet) {
		String message = null;
		if (pet != null) {
			petService.updatePet(addpet, pet);
			return message = "Pet updated succesfully !!!";
		} else {
			return message = "Pet not updated succesfully !!!";
		}

	}
	
	
	@GetMapping("/get/{id}")
	public Pet getPet(@PathVariable(value = "id") Integer id) {
		Pet pet =null;
		if (id != null) {
			 pet = petService.getPet(id);
			return pet;
		} else {
			return pet;
		}
		
	}
	
}