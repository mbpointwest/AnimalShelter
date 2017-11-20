package com.pointwest.training.beans;

public abstract class Animal {

	// protected static int animalCounter = 1000;
	protected int animalUniqueID;
	protected String name;
	protected int age;
	protected String gender;
	protected String uniqueSound;
	protected String animalType;

	public int getAnimalUniqueID() {
		return animalUniqueID;
	}

	public void setAnimalUniqueID(int animalUniqueID) {
		this.animalUniqueID = animalUniqueID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public abstract String getUniqueSound();

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

}
