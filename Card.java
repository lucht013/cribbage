public class Card {
    private String suit;
    private String color;
    private int rank;
    private int value;

    public Card(int rank, String suit){
        this.rank = rank;
        if(this.suit == "Club" || this.suit == "Spade"){
            color = "Black";
        }else if(this.suit == "Heart" || this.suit == "Diamond"){
            color = "Red";
        }else if(this.suit == "Joker"){
            color = "Joker";
        }
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
