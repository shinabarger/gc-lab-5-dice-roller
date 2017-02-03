package com.jetbrains;

import java.util.Random;
import java.util.Scanner;

/**e
 * GOALS:
 * ASK USER TO ENTER # OF SIDES FOR 2 DICE
 * PROMPT USER TO ROLL DICE (YES/NO)
 * ROLL DICE
 * DISPLAY RESULTS
 * ASK USER IF THEY WANT TO GO AGAIN
 * DISPLAY COOL MESSAGES IF THEY ROLL SOMETHING COOL (matches)
 * Save high score for user
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello. This is a dice roller.");


        String userAnswer;
        do {
            System.out.println("There are two dice. How many sides would you like them to have?");
            Scanner scan = new Scanner(System.in);
            int userNumOfSides = scan.nextInt();


            //PRINT ROLL SLOWLY
            printRollSlowly();

            //roll dice1
            int die1 = dice1(userNumOfSides);

            //roll dice2
            int die2 = dice2(userNumOfSides);

            //award user if they got a matching pair or something. If not, ask user if they want to to continue.
            userAnswer = continueAndAwards(die1, die2);

        } while (userAnswer.equals("Y"));
    }

    public static String continueAndAwards(int die1, int die2) {
        String userAnswer;
        Scanner scan;
        if(die1 == die2 & die1 != 1) {
            System.out.println("WOW! You got doubles! Go straight to free parking! Would you like to continue? Enter Y or N.");
            userAnswer = "Y";

        } else if (die1 == 1 && die2 ==1) {
            System.out.println("SNAKE EYES. Nice. Good work out there. Want to continue? Enter Y or N.");
        }
        else {
            System.out.println("Would you like to continue? Enter Y or N.");
        }
        scan = new Scanner(System.in);
        userAnswer = scan.nextLine();
        return userAnswer;
    }

    public static void printRollSlowly() {
        try {
            Thread.sleep(200);                 //1000 milliseconds is one second.
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.print("R");
        try {
            Thread.sleep(300);                 //1000 milliseconds is one second.
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.print("O");
        try {
            Thread.sleep(300);                 //1000 milliseconds is one second.
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.print("L");
        try {
            Thread.sleep(300);                 //1000 milliseconds is one second.
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("L");
        try {
            Thread.sleep(300);                 //1000 milliseconds is one second.
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    //first die roll/randomizer
    public static int dice1(int userNumOfSides) {
        Random random1 = new Random();
        int die1 = random1.nextInt(userNumOfSides) + 1;
        System.out.println("Dice #1: " + die1);
        return die1;
    }

    //2nd die roll/randomizer
    public static int dice2(int userNumOfSides) {
        Random random2 = new Random();
        int die2 = random2.nextInt(userNumOfSides) + 1;
        System.out.println("Dice #2: " + die2);
        return die2;
    }
}
