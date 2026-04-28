public class ConstructorOverloading {

    String name;
    int age;

    ConstructorOverloading() {
        name = "Unknown";
        age = 0;
    }

    ConstructorOverloading(String n, int a) {
        name = n;
        age = a;
    }

    ConstructorOverloading(String n) {
        name = n;
        age = 18;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading("Zeba", 20);
        ConstructorOverloading obj3 = new ConstructorOverloading("Sara");

        obj1.display();
        obj2.display();
        obj3.display();
    }
}