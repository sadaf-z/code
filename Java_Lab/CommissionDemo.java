import java.util.Scanner;

class Commission {
    private final double sales;

    Commission(double sales) {
        this.sales = sales;
    }

    double commission() {
        if (sales >= 100000) {
            return sales * 0.10;
        } else if (sales >= 50000) {
            return sales * 0.05;
        } else if (sales >= 30000) {
            return sales * 0.03;
        } else {
            return 0;
        }
    }
}

public class CommissionDemo {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter sales amount: ");
            double sale = sc.nextDouble();

            if (sale < 0) {
                System.out.println("Invalid Input");
            } else {
                Commission c = new Commission(sale);
                System.out.println("Commission = " + c.commission());
            }
        }
    }
}
