package org.example;

import java.util.Scanner;

public class MiniGame {
    public static String guestTheNumber(){
        double number = randomNumber();
        double numberGuess;
        boolean isGameContinue = true;

        int userAttempt = 0;

        String gameResult = new String();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the number between 1 - 99!");

        do {
            System.out.print("Guess the number : ");
            numberGuess = scanner.nextDouble();

            if (numberGuess < number){
                System.out.println("Too low!");;
            } else if(numberGuess > number){
                System.out.println("Too high!");;
            } else {
                isGameContinue = false;
                gameResult =  "Gotcha! Your attempts to guess is " + userAttempt + " attempts";
                scanner.close();
            }

            userAttempt += 1;

        } while (isGameContinue);
        return gameResult;
    }

    public static double randomNumber(){
        return Math.round(Math.random()*100);
    }

}
