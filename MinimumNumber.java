package ChapterSix;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        float number1 = input.nextFloat();
        System.out.println("Enter second number: ");
        float number2 = input.nextFloat();
        System.out.println("Enter third number: ");
        float number3 = input.nextFloat();
        System.out.println();
        System.out.println("The Minimum is   "  + min(number1, number2, number3));
    }

    private static float min(float firstNumber, float secondNumber, float thirdNumber){

        float minimum = Math.min(Math.min(firstNumber, secondNumber), thirdNumber);
        return minimum;
    }


}
