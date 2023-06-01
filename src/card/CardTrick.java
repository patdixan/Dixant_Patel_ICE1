/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author srinivsi
 * @modifier Dixantkumar Patel 
 * Student ID - 991650706
 *
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        // Generate 7 random cards and store them in the magicHand array
        Card[] magicHand = new Card[7];
        Random input = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < magicHand.length; i++) {

            Card c1 = new Card();

            c1.setValue(input.nextInt(13) + 1); // Set a random value between 1 and 13
            c1.setSuit(Card.SUITS[input.nextInt(4)]); // Set a random suit

            magicHand[i] = c1;

        }

        Card luckyCard = new Card();
        luckyCard.setValue(7); // Set the value of the lucky card
        luckyCard.setSuit("Hearts"); // Set the suit of the lucky card

        System.out.print("Pick a card between 0-13: ");
        int value = scanner.nextInt();
        System.out.print("Pick a card suit from Hearts, Diamonds, Spades and Clubs: ");
        String suit = scanner.next();

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(suit);

        boolean found = false;
        for (int i = 0; i < magicHand.length; i++) {
            // Check if the current card in the magicHand array is equal to the user's card
            if (magicHand[i].equals(userCard)) {
                found = true;
                break;
            }
        }

        
        System.out.println(); //To add some blank space
        
        // Print the result based on whether the user's card was found in the magicHand array
        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }

        // Check if the user's card is the lucky card and print the appropriate message
        if (luckyCard.equals(userCard)) {
            System.out.println("Congratulations! You picked the lucky card!");
        } else {
            System.out.println("Sorry, your lucky card is not here! Better luck next time!");
        }
    }

}
