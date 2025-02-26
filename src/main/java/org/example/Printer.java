package org.example;

import java.util.Scanner;

public class Printer {

    public static String multiplicationTable(int number){

        if (number < 1){
            throw new ArithmeticException("Please input greater than 0!");
        }

        StringBuilder stringResult = new StringBuilder();

        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= number; ++j){
                if (j == number){
                    stringResult.append(j*i);
                } else {
                    stringResult.append(j*i + " ");
                }
            }
            stringResult.append("\n");
        }

        return stringResult.toString();
    }

    public static String printTriangle(int number){

        if (number < 1){
            throw new ArithmeticException("Please input greater than 0!");
        }

        StringBuilder stringResult = new StringBuilder();

        for (int i = 0; i < number; i++){
            for (int j = 0; j < i + 1; ++j){
                stringResult.append("*");
            }
            stringResult.append("\n");
        }

        return stringResult.toString();

    }

    public static String inputNumberIteration(Scanner scanner){
        StringBuilder inputNumberList = new StringBuilder();

        String isContinue;

        do {
            System.out.print("Input number : ");
            inputNumberList.append(scanner.nextInt()).append(",");

            scanner.nextLine();

            System.out.print("Do you want to continue? (y/n) : ");
            isContinue = scanner.next();
        } while (isContinue.equals("y"));

        scanner.close();

        return inputNumberList.toString();

    }

    public static String swapCharacterCase(String text){

        if (text.length() < 1){
            throw new IllegalArgumentException("Input cannot be blank!");
        }

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";

        String[] arrayUpper = upper.split("");
        String[] arrayLower = lower.split("");
        String[] arrayText = text.split("");
        String[] swappedText = arrayText;

        for (int i = 0; i < arrayText.length; i++){
            for (int j = 0; j < arrayUpper.length; j++){
                if (arrayText[i].equals(arrayUpper[j])){
                    swappedText[i] = arrayLower[j];
                    break;
                } else if (arrayText[i].equals(arrayLower[j])){
                    swappedText[i] = arrayUpper[j];
                    break;
                }
            }
        }

        return String.join("", swappedText);

    }

}
