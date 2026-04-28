import java.util.Scanner;

public class ReplaceCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String result = text.replace('d', 'f');

        System.out.println("Modified string: " + result);

        sc.close();
    }
}
