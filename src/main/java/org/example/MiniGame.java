package org.example;

import java.util.Scanner;

public class MiniGame {
    public static String guestTheNumber(){
        double number = randomNumber();
        Scanner scanner = new Scanner(System.in);
        boolean isGameContinue = true;
        double numberGuess;
        String gameResult = new String();

        System.out.println("Guess the number between 1 - 99!");

        do {
            System.out.print("Guess the number : ");
            numberGuess = scanner.nextDouble();

            if (numberGuess < number){
                System.out.println("Too low!");;
            } else if(numberGuess > number){
                System.out.println("Too high!");;
            } else {
                scanner.close();
                isGameContinue = false;
                gameResult =  "Gotcha! The number is " + number;
            }
        } while (isGameContinue);
        return gameResult;
    }

    public static double randomNumber(){
        return Math.round(Math.random()*100);
    }

}
