/**
 * Problem Set 4.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * iterative control structures. The `main` method is done for you. Lines 30-39
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the *Deliverables* section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet4 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet4 ps = new ProblemSet4();

        // comment out or uncomment as needed

        ps.sum();
        ps.reverse();
        ps.digits();
        ps.average();
        ps.prime();
        ps.fibonacci();
        ps.factors();
        ps.mario();
        ps.luigi();
        ps.credit();

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter two integers. The first integer is a lower bound, and
     * the second integer is an upper bound.
     *
     * Compute the sum of all even integers between the lower and upper bounds,
     * including the bounds themselves.
     */

    public void sum() {
      int lowerbound = 1;
      int UpperBound = 0;
      do {
        System.out.print("\nLower bound: ");
        lowerbound = in.nextInt();
        System.out.print("Upper bound: ");
        UpperBound = in.nextInt();
      } while (lowerbound > UpperBound);

      int integerSum = 0;
      int addableAmount = 0;


      for (int i = lowerbound; i <= UpperBound; i++) {
        if (i % 2 == 0) {
          addableAmount = Math.abs(i);
          integerSum += addableAmount;
        }
      }

      System.out.printf("%,d.", integerSum);
    }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter a positive integer. Print the digits of this integer
     * in reverse order.
     */

    public void reverse() {
      int positiveInteger;
      System.out.println("\n");
      do {
        System.out.print("Positive integer: ");
        positiveInteger = in.nextInt();
      } while (positiveInteger <= 0);

      String normalPositive = String.valueOf(positiveInteger);
      String reversePositive = "";
      String finalInt = "";

      for (int i = normalPositive.length(); i > 0; i--) {
        if(i != normalPositive.length()) {
          reversePositive = reversePositive + ", ";
        }
        finalInt = normalPositive.substring(i - 1, i);
        reversePositive = reversePositive + finalInt;
      }
      reversePositive = reversePositive + ".";

      System.out.println("\n" + reversePositive);
    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter a positive integer. Compute the sum of all of the odd
     * digits in the integer.
     */

    public void digits() {
      boolean trueFalse = true;
      int promptInt;
      do {
          if (trueFalse) {
              trueFalse = false;
              System.out.print("\nPositive integer: ");
          } else {
              System.out.print("Positive integer: ");
          }
          promptInt = in.nextInt();
      } while (promptInt <= 0);

      int storageInt = promptInt;
      long sum = 0;

      do {
          storageInt = promptInt % 10;
          if (storageInt % 2 != 0) { //test for odd number
              sum += storageInt;
          }
          promptInt /= 10;
      } while (promptInt > 0);
      System.out.print("\n" + sum + ".\n");
    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a series of non-negative integers. When the user
     * enters a negative integer, you can assume he or she is done entering values.
     * What is the average of the values entered?
     */

    public void average() {
      int itemNumber = 0;
      int numInteger = 0;
      int numNonNegativeIntegers = 0;

      System.out.println("");
      do {
        System.out.print("Non-negative integer: ");
        itemNumber = in.nextInt();
        if(itemNumber >= 0) {
          numInteger += itemNumber;
          numNonNegativeIntegers++;
        }
      } while (itemNumber >= 0);

      if (numNonNegativeIntegers > 0) {
        double nonNegativeIntegerAverage = (double) numInteger / (double) numNonNegativeIntegers;
        System.out.printf("\n%.2f\n", nonNegativeIntegerAverage);
      } else {
        System.out.println("\nIn order for the program to work, you need to input at least one number to average before entering a negative to end the program.");
      }
    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a non-negative integer. Is this number prime?
     */

    public void prime() {
      int primePrompt;
      boolean isPrime = true;

      System.out.println("");
      do {
        System.out.print("Non-negative integer: ");
        primePrompt = in.nextInt();
      } while (primePrompt < 0);

      String maybePrimeString = String.valueOf(primePrompt);
      for (int i = 2; i <= primePrompt / 2; i++) {

      }
      if (isPrime == true) {
        System.out.println("\nPrime.");
      } else {
        System.out.println("\nNot prime.");
      }
    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a positive integer in the range [1, 92]. If the
     * integer the user enters is called n, what is the nth Fibonacci number?
     */

    public void fibonacci() {
      int n = 0;
      System.out.println("");
      while (n <= 0 || n > 92) {
          System.out.print("Positive integer: ");
          n = in.nextInt();
      }

      long firstBase = 0;
      long secondBase = 1;
      long fibonacci = 0;

      for (int i = 2; i <= n; i++) {
          fibonacci = firstBase + secondBase;
          firstBase = secondBase;
          secondBase = fibonacci;
      }

      System.out.println("\n" + secondBase + ".");
    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a positive integer. What are its factors?
     */

    public void factors() {

    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter an integer between 1 and 24 (inclusive). Print a Super
     * Mario-style half-pyramid of the specified height.
     */

    public void mario() {
      long height;
      long numSpace = 0;
      do
      {
          System.out.print("Height: ");
          height = in.nextLong();

      } while (height < 1 || height > 24);
      System.out.print("\n");
      for (long i = 1; i <= height; i++) {

          for (long j = height-i; j > 0; j--) {
              System.out.print(" ");
              numSpace++;
          }
          for (long h = height+1-numSpace; h > 0; h--) {
              System.out.print("#");
          }
          System.out.print("\n");
          numSpace = 0;
      }
      System.out.print("\n");
    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter an odd integer between 1 and 24 (inclusive). Print a
     * Super Mario-style full pyramid of the specified height.
     */

    public void luigi() {
      int pyramidHeight = 0;
      int sharpCount;
      int spaceCount;
      System.out.println("");
      while (pyramidHeight < 1 || pyramidHeight > 24) {
          System.out.print("Height: ");
          pyramidHeight = in.nextInt();
      }
      System.out.println("");
      for (int i = 1; i <= pyramidHeight; i++) {
        sharpCount = i;
        spaceCount = pyramidHeight - sharpCount - 1;
        for (int x = 0; x <= spaceCount; x++) {
          System.out.print(" ");
        }
        for (int y = 0; y <= sharpCount; y++) {
          System.out.print("#");
        }
        System.out.print(" ");
        for (int z = 0; z <= sharpCount; z++) {
          System.out.print("#");
        }
        System.out.print("\n");
      }
    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a credit card number (not a real one!). According to
     * Luhn's algorithm, is the credit card number valid?
     */

    public void credit() {
      System.out.println("");
      in.nextLine();
      System.out.print("Number: ");
      String cardNumber = in.nextLine();
      int sumEveryOtherDigit = 0;
      int digitToMultiply;
      int totalSum = 0;
      for (int i = cardNumber.length() - 2; i >= 0; i -= 2) {
        digitToMultiply = Character.getNumericValue(cardNumber.charAt(i));
        sumEveryOtherDigit = digitToMultiply * 2;
          if (sumEveryOtherDigit >= 10) {
            totalSum += (int)((sumEveryOtherDigit / Math.pow(10, 0)) % 10) + (int)((sumEveryOtherDigit / Math.pow(10, 1)) % 10);
          } else {
            totalSum += sumEveryOtherDigit;
          }
      }
      for (int i = cardNumber.length() - 1; i >= 0; i -= 2) {
        digitToMultiply = Character.getNumericValue(cardNumber.charAt(i));
        totalSum += digitToMultiply;
      }
      String everyOtherDigitString = Integer.toString(totalSum);
      if (everyOtherDigitString.charAt(everyOtherDigitString.length() - 1) == '0') {
        if (cardNumber.charAt(0) == '3' && (cardNumber.charAt(1) == '4' || cardNumber.charAt(1) == '7')) {
          System.out.println("\nAmex.");
        } else if (cardNumber.charAt(0) == '5' && (cardNumber.charAt(1) == '1' || cardNumber.charAt(1) == '2' || cardNumber.charAt(3) == '3' || cardNumber.charAt(4) == '4' || cardNumber.charAt(5) == '5')) {
          System.out.println("\nMastercard.");
        } else if (cardNumber.charAt(0) == '4') {
          System.out.println("\nVisa.");
        }
      } else {
        System.out.println("\nInvalid.");
      }
    }
}
