/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        int L, W, A, Gallons;
        final float gal = 350.0F;

        System.out.print("What is the length of the ceiling? ");
        L = user_input.nextInt();
        System.out.print("What is the width of the ceiling? ");
        W = user_input.nextInt();

        A=(L*W);
        Gallons=(int) Math.ceil(A/gal);

        System.out.println(String.format("You will need to purchase %d gallons of paint to cover %d square feet.",Gallons, A));
    }
}