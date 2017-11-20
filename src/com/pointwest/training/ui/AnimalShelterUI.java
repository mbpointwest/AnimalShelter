package com.pointwest.training.ui;

import java.util.List;
import java.util.Scanner;

import com.pointwest.training.beans.Animal;
import com.pointwest.training.manager.AnimalShelterManager;

public class AnimalShelterUI {

	AnimalShelterManager shelterManager = new AnimalShelterManager();
	Scanner intScanner = new Scanner(System.in);
	Scanner scanner = new Scanner(System.in);

	// menu stuff
	String input;
	boolean userExit = true;

	// animal attributes
	String name;
	int age;
	String gender;

	public void displayEmptyShelterMenu(List<Animal> animalList) {
		do {
			if (animalList.size() == 0) {
				System.out.println("The Shelter is Currently Empty");
				displayAddMenu(animalList);
			} else if (animalList.size() > 0 && animalList.size() < 10) {
				displayMainMenu(animalList);
			} else {
				displayFullShelterMenu(animalList);
			}

		} while (userExit);
		System.out.println("Program Ends. Goodbye!");
	}

	public void displayMainMenu(List<Animal> animalList) {
		// do {
		System.out.println("Home Page");
		System.out.println("Enter choice: ");
		System.out.println("[1] Add Animal");
		System.out.println("[2] Remove Animal");
		System.out.println("[3] View All Animals");
		System.out.println("Input choice: ");
		input = scanner.nextLine();
		switch (input) {
		// add animal
		case "1": {
			displayAddMenu(animalList);
			break;
		}
		// delete animal
		case "2": {
			displayDeleteMenu(animalList);
			break;
		}
		// display animals
		case "3": {
			viewAnimals(animalList);
			break;
		}
		}

		// } while (userExit);
	}

	public void displayAddMenu(List<Animal> animalList) {

		String addMenuInput;
		System.out.println("What animal do you want to add?");
		System.out.println("[1] A Dog");
		System.out.println("[2] A Cat");
		System.out.println("[3] A Parrot");
		System.out.println("Input choice: ");
		addMenuInput = scanner.nextLine();
		System.out.print("Input name: ");
		name = scanner.nextLine();
		System.out.print("Input age: ");
		age = intScanner.nextInt();
		System.out.print("Input gender: ");
		gender = scanner.nextLine();
		shelterManager.addAnimal(animalList, addMenuInput, name, age, gender);

		// return newAnimal;
	}

	public void displayDeleteMenu(List<Animal> animalList) {
		int deleteInput;
		System.out.println("Remove Animal Page!!");
		System.out.println("Please enter the reference ID of the animal to remove: ");
		deleteInput = intScanner.nextInt();

		if (shelterManager.deleteAnimal(animalList, deleteInput)) {
			System.out.println("The animal is now removed.");
		} else
			System.out.println("Animal ID not found.");
	}

	public void viewAnimals(List<Animal> animalList) {
		for (Animal animal : animalList) {
			System.out.print("Animal ID:" + animal.getAnimalUniqueID() + " ");
			System.out.print(animal.getUniqueSound() + " ");
			System.out.print("my name is ");
			System.out.print(animal.getName() + "!! ");
			System.out.print("I'm a ");
			System.out.print(animal.getAnimalType());
			System.out.print(" and I'm ");
			System.out.print(animal.getAge());
			System.out.print(" years old");
			System.out.println();
		}
	}

	public void displayFullShelterMenu(List<Animal> animalList) {

		System.out.println("The shelter is now full. We can no longer be able to accept a new animal.");
		System.out.println("Do you want to continue? [1] Yes [2] No?:");
		input = scanner.nextLine();
		switch (input) {
		// add animal
		case "1": {
			displaySubMenu(animalList);
			break;
		}
		// delete animal
		case "2": {
			userExit();
			break;
		}
		}
	}

	public void displaySubMenu(List<Animal> animalList) {

		System.out.println("Home Page");
		System.out.println("Enter choice: ");
		System.out.println("[1] Remove Animal");
		System.out.println("[2] View All Animals");
		System.out.println("Input choice: ");
		input = scanner.nextLine();
		switch (input) {
		// add animal
		// delete animal
		case "1": {
			displayDeleteMenu(animalList);
			break;
		}
		// display animals
		case "2": {
			viewAnimals(animalList);
			break;
		}
		}

	}

	public boolean userExit() {
		userExit = false;
		return userExit;
	}

}
