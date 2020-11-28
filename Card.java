public class Card {
    private String suit;
    private String color;
    private int value;

    public Card(int value, String suit){
        this.value = value;
        if(this.suit == "Club" || this.suit == "Spade"){
            color = "Black";
        }else if(this.suit == "Heart" || this.suit == "Diamond"){
            color = "Red";
        }else if(this.suit == "Joker"){
            color = "Joker";
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

}
