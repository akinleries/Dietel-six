package ChapterSix;

import java.util.Scanner;

public class NumberReverser {

        public static void main(String[] args) {
            reverseNumbers();
        }
       public static void reverseNumbers() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter numbers");
        int number = userInput.nextInt();
        String space = " ";
        while (number != 0) {
            int digit = number % 10;
            number /= 10;
            System.out.print(digit + space);
        }
    }

}
