package ChapterSix;

import java.util.Scanner;

public class GreatestCommonDivisor {

        public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("enter a number :");
            int n1 = userInput .nextInt();
            System.out.println("enter a number :");
            int n2 = userInput .nextInt();
            System.out.println("The Greatest Common Divisor of  "+ n1 + "  &  "+ n2  + "\n " + "is  : "+ checkGreatestCommonFactor(n1, n2));
        }
        public static int checkGreatestCommonFactor(int n1, int n2){
            int greatCommonDivisor = 1, k = 2;

            while (k <= n1 && k <= n2){
                if (n1 % k == 0 && n2 % k == 0)
                    greatCommonDivisor = k;
                    k++;

            }

            return greatCommonDivisor ;

        }

    }


