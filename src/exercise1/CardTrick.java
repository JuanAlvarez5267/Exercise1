package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Juan Jose Alvarez Gil
 * @author Juan Jose Alvarez Gil 30/05/2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Random random = new Random();
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            int value = (int)(Math.random()* 13 + 1);
            card.setValue(value);
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            
            hand[i] = card;
            
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        Card userCard = new Card();
        Scanner input = new Scanner(System.in);
        System.out.println("Insert the Card Value");
        int userValue = input.nextInt();
        userCard.setValue(userValue);
        System.out.println("Insert the suit (From 0 to 3)");
        int userSuit = input.nextInt();
        userCard.setSuit(Card.SUITS[userSuit]);
        
        for(int i = 0; i < hand.length ; i++){
            
            if(userCard.getSuit().equals(hand[i].getSuit())&& userCard.getValue()== hand[i].getValue()){
                printInfo();
            }
            
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
