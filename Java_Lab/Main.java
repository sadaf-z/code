// Class with static variable
class CounterDemo {
    static int cnt = 0;

    // Constructor
    CounterDemo() {
        cnt++;   // increment whenever object is created
    }

    // Method to display count
    void showCount() {
        System.out.println("Number of objects created: " + cnt);
    }
}

// Driver class
public class Main {
    public static void main(String[] args) {
        // Creating objects
        CounterDemo obj1 = new CounterDemo();
        CounterDemo obj2 = new CounterDemo();
        CounterDemo obj3 = new CounterDemo();

        // Display count
        obj1.showCount();
        obj2.showCount();
        obj3.showCount();
    }
}