package vttp2022.day06ws;

import java.util.*;

import vttp2022.day06ws.Card.Suit;

import java.io.*;
import java.security.SecureRandom;

public class Deck {


    private List<Card> cards = new LinkedList<>();

    public Deck () {
        //Call the other constructor with the number of decks to create
        this(1);
    }

    public Deck(int numDecks) {

        //create the number of dekcs
        for (int d = 0; d < numDecks; d++) {
            for (Suit s: Suit.values()) {
                for (int i = 0; i < Card.CARD_NAMES.length; i++) {
                    Card card = new Card(s,Card.CARD_NAMES[i], Card.CARD_VALUE[i]);
                    cards.add(card);
                }
            }
        }
        System.out.println(cards);
    }
    
    public void shuffle() {
        // Create a random number generator with a seed
        // Random rand = new Random(System.currentTimeMillis()); //create a seed
        
        //Better random generator
        Random rand = new SecureRandom();
        for (int p = 0 ; p < cards.size(); p++) {
            Card srcCard =  cards.get(p);
            int idx = rand.nextInt(0, cards.size());
            Card toSwap = cards.get(idx);
            cards.set(p, toSwap);
            cards.set(idx, srcCard);
        }

        
    }
    public Card take() {
        return cards.remove(0);
    }

    public int remaining () {
        return cards.size();
    }

    public List<Card> take(int num) {
        List<Card> cards = new LinkedList<>();
        for (int i = 0 ; i < num; i++) {
            if (remaining() > 0)
            cards.add(take());
            else
            break;
        }
        return cards;
    }
    
    @Override
    public String toString() {
        return cards.toString();
    }

//     //INSTANCE VARIABLES
//     //new array list to hold the cards
//     //52 instances?
//     ArrayList<Card> DeckofCards = new ArrayList<Card>(52);
//     Card newCard = Card()

       

    
    
    
    
//     //METHODS
//     //for loop to fill up with cards

//     public void getDeck() {
//         for (int i = 0; i < face.length; i++) {
//             for (int j = 0; j < suit.length; j++) {
//                 String cards = face[i] + " of " + suit[j];
//                 currentDeck.add(cards);
//             }
//         }
//         System.out.println(currentDeck);
//     }
// }



//     //function to shuffle the cards



//     //function to take n card(s)



//     //list remaining cards
    



    

     
//     // function shuffle (array) {
//     //     for(let i = array.length - 1; i > 0 ; i--) {
//     //         let j = Math.floor(Math.random() * (i+1))
//     //         [array[i], array[j]] = [array[j], array[i]]
//     //     }
//     //   }
}
