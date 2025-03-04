//5.Create a simple Java game where the computer generates a random number,
// and the user has to guess it within a certain number of attempts.
// Provide hints like "higher" or "lower" for incorrect guesses.
package com.dsv.assignment5.app;

import com.dsv.assignment5.model.NumberParam;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    private static int numberGenerator(Random random){
        return random.nextInt(100);
    }
    public static void main(String[] args) {
        Random random = new Random();
        NumberParam numInfo = new NumberParam();
        Scanner read = new Scanner(System.in);

        //Generating the random number from the system
        numInfo.setSysNum(numberGenerator(random));

        //Getting number from the user
        System.out.print("Guess the number between 100: ");
        numInfo.setUserNum(read.nextInt());

        if(numInfo.getUserNum() > numInfo.getSysNum()){
            System.out.println("Guessed number is higher");
        } else if (numInfo.getUserNum() < numInfo.getSysNum()) {
            System.out.println("Guessed number is lower");
        }else {
            System.out.println("Hooray! you guessed the number");
        }

    }
}
