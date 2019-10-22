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
      int firstinteger = 1;
      int secondInteger = 0;
      do {
        System.out.print("\nLower bound: ");
        firstinteger = in.nextInt();
        System.out.print("Upper bound: ");
        secondInteger = in.nextInt();
      } while (firstinteger > secondInteger);

      int integerSum = 0;
      int addableAmount = 0;


      for (int i = firstinteger; i <= secondInteger; i++) {
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
      int forwardPositiveIntegerInput;
      System.out.println("\n");
      do {
        System.out.print("Positive integer: ");
        forwardPositiveIntegerInput = in.nextInt();
      } while (forwardPositiveIntegerInput <= 0);

      String forwardPositiveInteger = String.valueOf(forwardPositiveIntegerInput);
      String reversePositiveInteger = "";
      String digitToAdd = "";

      for (int i = forwardPositiveInteger.length(); i > 0; i--) {
        if(i != forwardPositiveInteger.length()) {
          reversePositiveInteger = reversePositiveInteger + ", ";
        }
        digitToAdd = forwardPositiveInteger.substring(i - 1, i);
        reversePositiveInteger = reversePositiveInteger + digitToAdd;
      }
      reversePositiveInteger = reversePositiveInteger + ".";

      System.out.println("\n" + reversePositiveInteger);
    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter a positive integer. Compute the sum of all of the odd
     * digits in the integer.
     */

    public void digits() {
      boolean initialPrompt = true;
      int userInt;
      do {
          if (initialPrompt) {
              initialPrompt = false;
              System.out.print("\nPositive integer: ");
          } else {
              System.out.print("Positive integer: ");
          }
          userInt = in.nextInt();
      } while (userInt <= 0);

      int storageInt = userInt;
      long sum = 0;

      do {
          storageInt = userInt % 10;
          if (storageInt % 2 != 0) { //test for odd number
              sum += storageInt;
          }
          userInt /= 10;
      } while (userInt > 0);
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
      int integerListItem = 0;
      int integerListTotal = 0;
      int numNonNegativeIntegers = 0;

      System.out.println("");
      do {
        System.out.print("Non-negative integer: ");
        integerListItem = in.nextInt();
        if(integerListItem >= 0) {
          integerListTotal += integerListItem;
          numNonNegativeIntegers++;
        }
      } while (integerListItem >= 0);

      if (numNonNegativeIntegers > 0) {
        double nonNegativeIntegerAverage = (double) integerListTotal / (double) numNonNegativeIntegers;
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
      int maybePrimeInteger;
      boolean isPrime = true;

      System.out.println("");
      do {
        System.out.print("Non-negative integer: ");
        maybePrimeInteger = in.nextInt();
      } while (maybePrimeInteger < 0);

      String maybePrimeString = String.valueOf(maybePrimeInteger);
      for (int i = 2; i <= maybePrimeInteger / 2; i++) {

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
        boolean initialPrompt = true;
        int userInt;
        do {
            if (initialPrompt) {
                initialPrompt = false;
                System.out.print("\nPositive integer: ");
            } else {
                System.out.print("Positive integer: ");
            }
            userInt = in.nextInt();
        } while (userInt < 1 || userInt > 92);
        int sum = 0;
        int firstAdded = 0;
        int secondAdded = 1;
        for (int i = 2; i < userInt; i++) { //offset due to declaration of initial numbers
            sum = firstAdded + secondAdded;
            firstAdded = secondAdded;
            secondAdded = sum;
        }
        if (userInt == 1) {
            sum = firstAdded;
        } else if (userInt == 2) {
            sum = secondAdded;
        }
        System.out.println("\n" + sum + ".");
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

    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter an odd integer between 1 and 24 (inclusive). Print a
     * Super Mario-style full pyramid of the specified height.
     */

    public void luigi() {

    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a credit card number (not a real one!). According to
     * Luhn's algorithm, is the credit card number valid?
     */

    public void credit() {

    }
}
