package exercise1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Rahul
 * @author Rahul Sharma may 30, 2023
 */
public class CardTrick1 {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random= new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            int classrandom ;
            classrandom = random.nextInt(14)+1;
            card.setValue(classrandom);
            int randomSuit = random.nextInt(4);
            card.setSuit(Card.SUITS[randomSuit]);
                    
            hand[i] = card;
            System.out.println(classrandom);
            System.out.println(randomSuit);
        }
          Scanner scanner = new Scanner(System.in);
        System.out.print("Enter card value (1-10, 11 for Jack, 12 for Queen, 13 for King, 14 for Ace): ");
        int value = scanner.nextInt();
        System.out.print("Enter card suit (0 for Hearts, 1 for Diamonds, 2 for Clubs, 3 for Spades): ");
        int suit = scanner.nextInt();
         Card a=new Card();
         a.setValue(value);
         a.setSuit(a.SUITS[suit]);
        
        

        boolean found = false;
        for (Card card : hand) {
            
            if( card.getValue() == a.getValue() && card.getSuit().equals(a.getSuit())) {
                found = true;
                printInfo();
                break;
            }
        }
          if (!found) {
            System.out.println("Card not found in the hand.");
        }
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(13) + 1;
    }


      

    

            //card.setValue(insert call to random number generator here)
       
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Rahul Sharma may 30
     * i am done **/ 
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Rahul Sharma and I'm from India.");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- To become a programmer");
        System.out.println("-- To have a job.");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Travelling");
        System.out.println("-- Cooking");
        System.out.println("-- Watching TV");
        System.out.println("-- Writing");

        System.out.println();
        
    
    }

}
