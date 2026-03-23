import java.util.ArrayList;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();

    public void display() {
        System.out.println("Animal Name: " + name);
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(getName() + " says: Woof Woof");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(getName() + " says: Meow Meow");
    }
}

class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(getName() + " says: Moo Moo");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(new Dog("Tommy"));
        animals.add(new Cat("Kitty"));
        animals.add(new Cow("Gauri"));

        for (Animal a : animals) {
            a.display();
            a.makeSound();   
            System.out.println("-------------------");
        }
    }
}