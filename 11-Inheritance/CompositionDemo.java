class Engine {
    public void start() {
        System.out.println("Engine starts");
    }
}

class Car {
    private Engine engine;   

    public Car() {
        engine = new Engine();
    }

    public void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}