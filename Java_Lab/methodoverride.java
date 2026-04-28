class Animal {
     void makeSound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog barks");
    }
}

public class methodoverride{
    public static void main(String [] args) {
    Animal obj1= new Animal();
    Animal obj2= new Dog();
    obj1.makeSound();
    obj2.makeSound();
    }
}
