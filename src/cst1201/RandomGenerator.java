package cst1201;

import java.util.Random;
import java.util.Scanner;

public class RandomGenerator {

    public static void main(String[] args) {
        int sum = 0;
        double avg = 0.0;
        int randomCounter;
        

        Scanner keyboard = new Scanner(System.in);

        //TODO: Ask the user a lower and upper bound.
        System.out.println("Enter your lower bound: ");
        int lower = keyboard.nextInt();
        System.out.println("Enter your upper bound: ");
        int upper = keyboard.nextInt();

        //TODO: Ask the user for the number of random integers to generate.
        System.out.println("How many random numbers would you like to generate? ");
        randomCounter = keyboard.nextInt();

        //TODO: Generate random integers of the desired length and bound.
        Random random = new Random();
        System.out.println();
        for (int i = 0; i < randomCounter; i++) {
            int randomNum = random.nextInt((upper - lower) + 1) + lower;
            System.out.println(randomNum);

            //TODO: Print the average, max, min, count, and sum of the integers.
            sum = sum + randomNum;
            avg = sum / randomCounter;

            System.out.println("The average is: " + avg);
            System.out.println("The max is: " + upper);
            System.out.println("The min is: " + lower);
            System.out.println("The count is: " + randomCounter);
            System.out.println("The sum is: " + sum);

        }
    }
}
