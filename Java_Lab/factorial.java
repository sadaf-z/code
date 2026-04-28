public class factorial {

    int number = 5;

    long factorial() {
        long fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {
        factorial obj = new factorial();

        System.out.println("Number = " + obj.number);
        System.out.println("Factorial = " + obj.factorial());
    }
}