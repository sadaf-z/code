public class InnerClassDemo {

    private final String message = "Hello from Outer Class";

    class Inner {
        void display() {
            System.out.println(message);
            System.out.println("This is an Inner Class.");
        }
    }

    public static void main(String[] args) {
     
        InnerClassDemo outer = new InnerClassDemo();

        InnerClassDemo.Inner innerObj = outer.new Inner();

        innerObj.display();
    }
}
