class Animal {
    final void showType() {
        System.out.println("This is an animal");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Final {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.showType();
        d.bark();
    }
}