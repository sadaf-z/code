import java.util.Scanner;

class TollBooth {
    private int totalCars;
    private int unpaidCars;
    private int cashCollected;

    TollBooth() {
        totalCars = 0;
        unpaidCars = 0;
        cashCollected = 0;
    }

    void payingCar() {
        totalCars++;
        cashCollected += 50;
    }

    void nonPayingCar() {
        totalCars++;
        unpaidCars++;
    }

    void display() {
        System.out.println("\n----- TollBooth Report -----");
        System.out.println("No. of cars passed by: " + totalCars);
        System.out.println("Total no. of cars who have not paid the tax: " + unpaidCars);
        System.out.println("Amount of cash collected: Rs. " + cashCollected);
    }
}

public class BridgeTollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TollBooth booth = new TollBooth();

        System.out.print("Enter number of cars: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Did car " + i + " pay tax? (1 = Yes, 0 = No): ");
            int choice = sc.nextInt();

            if (choice == 1) {
                booth.payingCar();
            } else {
                booth.nonPayingCar();
            }
        }

        booth.display();

        sc.close();
    }
}
