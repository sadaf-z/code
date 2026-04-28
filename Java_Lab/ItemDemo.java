import java.util.Scanner;

class Item {
    int code;
    double price;

    void input(Scanner sc) {
        System.out.print("Enter item code: ");
        code = sc.nextInt();
        System.out.print("Enter item price: ");
        price = sc.nextDouble();
    }

    void display() {
        System.out.println(code + "\t" + price);
    }
}

public class ItemDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        Item[] items = new Item[5];
        double total = 0;

        for (int i = 0; i < items.length; i++) {
            items[i] = new Item();
            System.out.println("Enter details for item " + (i + 1));
            items[i].input(sc); 
        }

        System.out.println("\nCode\tPrice");

        for (int i = 0; i < items.length; i++) {
            items[i].display();
            total += items[i].price;
        }

        System.out.println("\nTotal Price = " + total);

        sc.close(); 
    }
}
