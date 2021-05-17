package ChapterSix;

import java.util.Scanner;

public class TemperatureConversion {

  private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {

            System.out.println("Temperature Conversion");
            System.out.println("""
                Enter 1 to convert to celsius
                Enter 2 to convert to fahrenheit
                Enter -1 to stop
                """);
            int userInput = input.nextInt();
            do {
                switch (userInput) {
                    case 1 -> {
                        fahrenheitConversion();
                        break;
                    }
                    case 2 -> {
                        celsiusConversion();
                        break;
                    }default -> {
                        System.err.println("pls enter a valid number");
                    }
                                                                                                          //default -> throw new IllegalArgumentException("Pls Enter the correct input");
                }
                System.out.println();
                userInput = input.nextInt();
            }while (userInput != -1);

            System.out.println();
        }


        public static void fahrenheitConversion() {
            System.out.println("Enter the amount of fahrenheit to Convert:");
            double fahrenheit = input.nextDouble();
            double celsius = 5.0 / 9.0 * (fahrenheit - 32);
            System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius");
        }

        public static void celsiusConversion() {
            System.out.println("Enter the amount of celsius to Convert:");
            double celsius = input.nextDouble();
            double fahrenheit = 9.0 / 5.0 * celsius + 32;
            System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
        }

    }


