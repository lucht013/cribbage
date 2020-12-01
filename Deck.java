import java.util.Random;
import java.util.Stack;
public class Deck {
    private Random generator = new Random();
    private Stack<Card> deck;

    public Deck(int numOfJokers, Boolean startRandomized){
        if(numOfJokers < 0){
            System.out.println("How do you add " + numOfJokers + " to the deck?");
            System.out.println("I'm just gonna assume you meant 0. If that's not what you meant, that's on you.");
        }else{
            for(int i = 0; i < numOfJokers; i++){
                addCard(-1,"Joker");
            }
        }

        generateDeck();
        if(startRandomized){
            randomize();
        }
    }

    public void addCard(int rank, String suit){
        Card newCard = new Card(rank, suit);
        deck.add(newCard);
    }

    private void generateDeck(){
        String suits[] = {"Club","Spade","Diamond","Heart"};

        for(String suit: suits){
            for(int rank = 13; rank > 0; rank--){
                Card newCard = new Card(rank, suit);
                deck.add(newCard);
            }
        }
    }

    
    //TODO: make this randomization way better.
    public void randomize(){
        Random randomizer = new Random();
        int size = deck.capacity();
        Card[] table;
        table = new Card[size];
        for(int i = 0; i < size; i++){
            table[i] = deck.pop();
        }
        
        //Randomizing: looping through each index, swapping
        //with random other index
        for(int j = 0; j < table.length; j++){
            int swapIndex = randomizer.nextInt(table.length-1);
            Card cabinet = table[j];
            table[j] = table[swapIndex];
            table[swapIndex] = cabinet;
        }

        //putting it all back
        for(Card card: table){
            deck.add(card);
        }
    }
}
