package com.pluralsight;

import java.util.Random;
import java.util.Scanner;

public class Main {

    /*
https://programmingbydoing.com/

Flip again? - Assignment #57
 */

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        Random rng = new Random();

        String again = "y";

        while ( again.equals("y") )
        {
            int flip = rng.nextInt(2);
            String coin;

            if ( flip == 1 )
                coin = "HEADS";
            else
                coin = "TAILS";

            System.out.println( "You flip a coin and it is... " + coin );

            System.out.print( "Would you like to flip again (y/n)? " );
            again = keyboard.next();
        }
    }
}
