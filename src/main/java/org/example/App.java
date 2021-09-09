/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner str = new Scanner(System.in);
        System.out.println("What is the quote?");
        String quote = str.nextLine();

        Scanner str2 = new Scanner(System.in);
        System.out.println("Who said it?");
        String author = str2.nextLine();

        System.out.println(author + " says, " + '"' + quote + '"');

        str.close();
        str2.close();
    }
}
