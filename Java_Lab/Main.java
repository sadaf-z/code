class CounterDemo {
    static int cnt = 0;

    CounterDemo() {
        cnt++;   
    }

    void showCount() {
        System.out.println("Number of objects created: " + cnt);
    }
}

public class Main {
    public static void main(String[] args) {
       
        CounterDemo obj1 = new CounterDemo();
        CounterDemo obj2 = new CounterDemo();
        CounterDemo obj3 = new CounterDemo();

        obj1.showCount();
        obj2.showCount();
        obj3.showCount();
    }
}