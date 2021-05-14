package ChapterSix;

import java.util.Scanner;

public class PerfectNumber {

        public static void main(String[] args) {

            checkPerfectNumber();
        }

        public static void checkPerfectNumber() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number to check it's state:");
            int userInput = input.nextInt();
            int sum = 0;
            for (int counter = 1; counter < userInput; counter++) {
                sum += counter;
                if (sum == userInput)
                break;
            }
            if (sum == userInput) {
                System.out.println(userInput + " is a perfect number");

            }else {
                System.out.println(userInput +"  not a perfect number");

        }
    }
}
