import java.util.Scanner;

// Interface Department
interface Department {
    String deptName = "Computer Science";
    String deptHead = "Dr. Sharma";

    void printDepartmentDetails();
}

// Hostel class
class Hostel {
    String hostelName;
    String hostelLocation;
    int numberOfRooms;

    void getHostelData(Scanner sc) {
        sc.nextLine(); // clear buffer
        System.out.print("Enter Hostel Name: ");
        hostelName = sc.nextLine();

        System.out.print("Enter Hostel Location: ");
        hostelLocation = sc.nextLine();

        System.out.print("Enter Number of Rooms: ");
        numberOfRooms = sc.nextInt();
    }

    void printHostelData() {
        System.out.println("Hostel Name      : " + hostelName);
        System.out.println("Hostel Location  : " + hostelLocation);
        System.out.println("Number of Rooms  : " + numberOfRooms);
    }
}

// Student class
class Student extends Hostel implements Department {
    String studentName;
    int regdNo;
    String electiveSubject;
    double avgMarks;

    void getData(Scanner sc) {
        sc.nextLine(); // clear buffer
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Registration Number: ");
        regdNo = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Elective Subject: ");
        electiveSubject = sc.nextLine();

        System.out.print("Enter Average Marks: ");
        avgMarks = sc.nextDouble();

        getHostelData(sc);
    }

    void printData() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Student Name     : " + studentName);
        System.out.println("Registration No  : " + regdNo);
        System.out.println("Elective Subject : " + electiveSubject);
        System.out.println("Average Marks    : " + avgMarks);

        printHostelData();
        printDepartmentDetails();
    }

    // Implement interface method
    public void printDepartmentDetails() {
        System.out.println("Department Name  : " + deptName);
        System.out.println("Department Head  : " + deptHead);
    }
}

// Driver class
public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[10];
        int count = 0;

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Admit New Student");
            System.out.println("2. Migrate a Student");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count < students.length) {
                        students[count] = new Student();
                        students[count].getData(sc);
                        count++;
                        System.out.println("Student admitted successfully.");
                    } else {
                        System.out.println("No more space for students.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Registration Number to migrate: ");
                    int searchReg = sc.nextInt();

                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].regdNo == searchReg) {
                            found = true;
                            System.out.println("Student found. Updating hostel details...");
                            students[i].getHostelData(sc);
                            System.out.println("Migration completed.");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    for (int i = 0; i < count; i++) {
                        students[i].printData();
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}