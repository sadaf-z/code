import java.util.Scanner;

public class Grader {
    private int score;

    // Constructor
    public Grader(int score) {
        this.score = score;
    }

    // Method to return letter grade
    public String letterGrade() {
        if (score >= 90) {
            return "O";
        } else if (score >= 80) {
            return "E";
        } else if (score >= 70) {
            return "A";
        } else if (score >= 60) {
            return "B";
        } else if (score >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score (0-100): ");
        int score = sc.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score! Please enter between 0 and 100.");
        } else {
            Grader g = new Grader(score);
            System.out.println("Grade: " + g.letterGrade());
        }

        sc.close();
    }
}