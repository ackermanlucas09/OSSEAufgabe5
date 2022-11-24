package de.hfu;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println("Bitte geben Sie was ein: ");
        Scanner scan = new Scanner(System.in);
        String eingabe = scan.next();
        System.out.printf(eingabe.toUpperCase());
    }
}
