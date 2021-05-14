package ChapterSix;
import java.util.Scanner;
public class PrimeNumbers {

    public static void main(String[] args) {
        checkPrimeNumbers();
    }

    private static void checkPrimeNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = input.nextInt();

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number + "   is not a prime number");
                break;
            } else {
                System.out.println(number + "   is a prime number");
            }
        }
    }
}
