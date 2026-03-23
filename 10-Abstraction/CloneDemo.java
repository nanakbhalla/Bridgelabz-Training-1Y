class PrototypeModel implements Cloneable {
    int id;
    String name;

    PrototypeModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class CloneDemo {
    public static void main(String[] args) {
        try {
            PrototypeModel obj1 = new PrototypeModel(101, "Original Object");
            PrototypeModel obj2 = (PrototypeModel) obj1.clone();

            System.out.println("Original Object:");
            obj1.display();

            System.out.println("Cloned Object:");
            obj2.display();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
    }
}