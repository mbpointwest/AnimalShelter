package com.pointwest.training.main;

import java.util.ArrayList;
import java.util.List;

import com.pointwest.training.beans.Animal;
import com.pointwest.training.ui.AnimalShelterUI;

public class AnimalShelterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Animal> animalList = new ArrayList<Animal>();
		AnimalShelterUI animalShelterUI = new AnimalShelterUI();

		animalShelterUI.displayEmptyShelterMenu(animalList);	
	}
}
