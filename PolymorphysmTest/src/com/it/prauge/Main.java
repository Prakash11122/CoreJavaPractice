package com.it.prauge;

class Animal {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Pig extends Animal {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}

class Dog extends Animal {
	public void animalSound() {
		System.out.println("The dog says: bow wow");
	}
}

class Main{
	public static void main(String[] args){
		Animal animal = new Animal();
		//Animal myPig = new Pig();
		Pig p = new Pig();
		p.animalSound();
		Animal myDog = new Dog();
		
		//animal.animalSound();
		//myPig .animalSound();
		//myDog.animalSound();
	}
}