/*
 *  UCF COP3330 Fall 2021 Assignment 1.3 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("What is the quote?"); //Asking for user input
        String quote = x.nextLine(); //Storing user input to string quote

        System.out.print("Who said it?");
        Scanner z = new Scanner(System.in); //User input
        String author = z.nextLine(); //Storing user input to "author"

        System.out.println(author+" says, \"" +quote+ "\""); //Printing

    }
}