import java.util.Scanner;

class Employee {
    int emp_no;
    String name;
    String department;
    double basic_pay, DA, HRA, gross_salary;

    Employee(int emp_no, String name, String department, double basic_pay) {
        this.emp_no = emp_no;
        this.name = name;
        this.department = department;
        this.basic_pay = basic_pay;

        this.DA = 0.40 * basic_pay;  
        this.HRA = 0.20 * basic_pay;  
        this.gross_salary = basic_pay + DA + HRA;
    }

    void display() {
        System.out.println("Employee No   : " + emp_no);
        System.out.println("Name          : " + name);
        System.out.println("Department    : " + department);
        System.out.println("Basic Pay     : " + basic_pay);
        System.out.println("DA            : " + DA);
        System.out.println("HRA           : " + HRA);
        System.out.println("Gross Salary  : " + gross_salary);
    }
}

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Employee No: ");
            int emp_no = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();

            System.out.print("Basic Pay: ");
            double basic_pay = sc.nextDouble();
            sc.nextLine();

            employees[i] = new Employee(emp_no, name, department, basic_pay);
        }

        Employee highest = employees[0];

        for (int i = 1; i < n; i++) {
            if (employees[i].gross_salary > highest.gross_salary) {
                highest = employees[i];
            }
        }

        System.out.println("\nEmployee with Highest Gross Salary:");
        System.out.println("-----------------------------------");
        highest.display();

        sc.close();
    }
}
