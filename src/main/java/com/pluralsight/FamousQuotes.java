package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {

        try {
                // Create an array of strings to store 10 quotes
                String[] quotes = new String[10];

                // Add 10 of your favorite quotes to the array
                quotes[0] = "\"There are no shortcuts to any place worth going.\"– Beverly Sills";
                quotes[1] = "\"If you can’t fly, then run; if you can’t run, then walk; if you can’t walk, then crawl, but whatever you do, you have to keep moving forward.\" – Martin Luther King Jr. ";
                quotes[2] = "\"Limitations live only in our minds. But if we use our imaginations, our possibilities become limitless.\" — Jamie Paolinetti";
                quotes[3] = "\"Perfection is not attainable, but if we chase perfection, we can catch excellence.\" — Vince Lombardi";
                quotes[4] = "\"Life is about making an impact, not making an income.\" – Kevin Kruse";
                quotes[5] = "\"Change is inevitable. Change will always happen, but you have to apply direction to change, and that's when it's progress.\" — Doug Baldwin ";
                quotes[6] = "\"Failure is an amazing data point that tells you which direction not to go.\" — Payal Kadakia ";
                quotes[7] = "\"Success is not the absence of failure; it's the persistence through failure.\" — Aisha Tyler ";
                quotes[8] = "\"You keep putting one foot in front of the other, and one day you look back and you've climbed a mountain.\" — Tom Hiddleston ";
                quotes[9] = "\"Start by doing what's necessary, then do what's possible, and suddenly, you're doing the impossible.\" — Francis of Assisi ";

                // Prompt the user to select a number between 1 and 10 and display that quote.
                Scanner scanner = new Scanner(System.in);
                System.out.print("Select a number between 1 and 10 to display a quote: ");
                int num = scanner.nextInt();

                // Display the quote chosen
                System.out.println(quotes[num - 1]);
            }
            catch(Exception e){
                System.out.println("Invalid number. Please select a number from 1 to 10: ");
            }
    }
}