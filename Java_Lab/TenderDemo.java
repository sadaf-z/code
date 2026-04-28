import java.util.Scanner;

class Tender {
    String company;
    double cost;

    void input(Scanner sc) {
        System.out.print("Enter company name: ");
        company = sc.nextLine();
        System.out.print("Enter cost: ");
        cost = sc.nextDouble();
        sc.nextLine(); 
    }
}

public class TenderDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        Tender[] t = new Tender[5];

        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();
            System.out.println("Enter the details for tender " + (i + 1));
            t[i].input(sc); 
        }

        double min = t[0].cost;
        String minCompany = t[0].company;

        for (int i = 1; i < 5; i++) {
            if (t[i].cost < min) {
                min = t[i].cost;
                minCompany = t[i].company;
            }
        }

        System.out.println("\nCompany with minimum cost: " + minCompany);
        System.out.println("Minimum Cost: " + min);

        sc.close(); 
    }
}
