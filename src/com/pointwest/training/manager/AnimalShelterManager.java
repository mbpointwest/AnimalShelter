package com.pointwest.training.manager;

import java.util.List;

import com.pointwest.training.beans.Animal;
import com.pointwest.training.beans.Cat;
import com.pointwest.training.beans.Dog;
import com.pointwest.training.beans.Parrot;

public class AnimalShelterManager {

	static int animalCounter = 1000;
	int animalUniqueID;

	public void addAnimal(List<Animal> animalList, String animal, String name, int age, String gender) {

		if ("1".equalsIgnoreCase(animal)) {
			addDog(animalList, animal, name, age, gender);
		} else if ("2".equalsIgnoreCase(animal)) {
			addCat(animalList, animal, name, age, gender);
		} else {
			addParrot(animalList, animal, name, age, gender);
		}
	}

	public void addDog(List<Animal> animalList, String animal, String name, int age, String gender) {
		Animal newAnimal = new Dog();
		newAnimal.setName(name);
		newAnimal.setAge(age);
		newAnimal.setGender(gender);
		newAnimal.setAnimalUniqueID(this.animalCounter);
		newAnimal.setAnimalType("dog");
		animalList.add(newAnimal);
		animalCounter++;
		System.out.println("Dog " + name + " is now added");
	}

	public void addCat(List<Animal> animalList, String animal, String name, int age, String gender) {
		Animal newAnimal = new Cat();
		newAnimal.setName(name);
		newAnimal.setAge(age);
		newAnimal.setGender(gender);
		newAnimal.setAnimalUniqueID(this.animalCounter);
		newAnimal.setAnimalType("cat");
		animalList.add(newAnimal);
		animalCounter++;
		System.out.println("Cat " + name + " is now added");
	}

	public void addParrot(List<Animal> animalList, String animal, String name, int age, String gender) {
		Animal newAnimal = new Parrot();
		newAnimal.setName(name);
		newAnimal.setAge(age);
		newAnimal.setGender(gender);
		newAnimal.setAnimalUniqueID(this.animalCounter);
		newAnimal.setAnimalType("parrot");
		animalList.add(newAnimal);
		animalCounter++;
		System.out.println("Parrot " + name + " is now added");
	}

	public boolean deleteAnimal(List<Animal> animalList, int uniqueID) {
		boolean deleted = false;
		for (Animal animal : animalList) {
			if (uniqueID == animal.getAnimalUniqueID()) {
				animalList.remove(animal);
				deleted = true;
				break;
			}
		}
		return deleted;
	}

}
