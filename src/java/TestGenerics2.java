package java;

import java.util.*;

abstract class Animal {
    void eat() { System.out.println ("animal eating"); }    
}

class Dog extends Animal {  void bark () { }  }
class Cat extends Animal {  void meow() { }   }

public class TestGenerics2 {
    public static void main(String[] args) {
	new TestGenerics2().go();
    }

    public void go() {
	ArrayList<Animal> animals = new ArrayList<Animal> ();
	animals.add(new Dog());
	animals.add(new Cat());
	animals.add(new Dog());
	takeAnimals(animals);

	ArrayList<Dog> dogs = new ArrayList<Dog>();
	dogs.add(new Dog());  dogs.add(new Dog());
	// takeAnimals(dogs);   // Type Error in compile-time
	takeAnimals3(dogs);

    }

    public void takeAnimals (ArrayList<Animal> animals) {
	for(Animal a: animals)
	    a.eat();
    }

    // Using wildcard type
    public void takeAnimals3 (ArrayList<? extends Animal> animals) {
	for(Animal a: animals)
	    a.eat();
    }
}