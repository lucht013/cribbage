package CribbageGame;
public class Card {
    /*
     * Notes on Cards:
     * Suits and colors are CAPITALIZED
     * Suits are not pluralized
     * cards are ranked 1 - 13
     * Ranks above 10 are valued as 10, else rank == value
     * Joker is colored 'Joker', suitted 'Joker', and rank/valued as -1
     * if a card is malformed (ie. rank = 5, suit = joker) joker will override
     */

    private String suit;
    private String color;
    private int rank;
    private int value;

    public Card(int rank, String suit){
        this.suit = suit;
        this.rank = rank;
        //joker handler
        if(rank == -1 || suit == "Joker"){
            this.suit = "Joker";
            this.rank = -1;
        }
        
        //Set color from suit
        if(this.suit == "Club" || this.suit == "Spade"){
            color = "Black";
        }else if(this.suit == "Heart" || this.suit == "Diamond"){
            color = "Red";
        }else if(this.suit == "Joker"){
            color = "Joker";
        }else{
            System.out.println("That's not a valid suit!");
        }

        //set value from rank
        if(rank > 10){
            value = 10;
        }else{
            value = rank;
        }
    }

    public String getSuit() {
        return suit;
    }

    public String getColor() {
        return color;
    }

    public int getValue() {
        return value;
    }

    public int getRank() {
        return rank;        
    }

}
