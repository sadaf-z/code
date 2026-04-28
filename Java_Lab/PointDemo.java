import java.util.Scanner;

class Point {
    int x, y;

    void input(Scanner sc) {
        System.out.print("Enter x coordinate: ");
        x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        y = sc.nextInt();
    }

    void display() {
        System.out.println("Center point: (" + x + "," + y + ")");
    }
}

class Circle {
    Point p;
    double radius;

    void input(Scanner sc) {
        p = new Point();
        p.input(sc);

        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
    }

    void display() {
        p.display();
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

public class PointDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();
        c.input(sc);
        c.display();

        sc.close(); 
    }
}