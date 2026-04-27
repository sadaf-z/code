// Employee class
class Employee {
    // Private data members
    private String name;
    private String department;
    private double salary;

    // Static member for company name
    static String companyName = "Tech Solutions Pvt Ltd";

    // Constructor
    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Method to display employee details
    void display() {
        System.out.println("Company Name : " + companyName);
        System.out.println("Employee Name: " + name);
        System.out.println("Department   : " + department);
        System.out.println("Salary       : " + salary);
        System.out.println("-----------------------------");
    }
}

// Driver class
public class EmployeeDemo {
    public static void main(String[] args) {
        // Creating 5 employee objects
        Employee e1 = new Employee("Rahul", "HR", 35000);
        Employee e2 = new Employee("Sneha", "Finance", 42000);
        Employee e3 = new Employee("Aman", "IT", 50000);
        Employee e4 = new Employee("Priya", "Marketing", 38000);
        Employee e5 = new Employee("Arjun", "Sales", 40000);

        // Display details
        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
    }
}
