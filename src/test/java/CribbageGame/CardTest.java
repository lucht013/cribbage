package CribbageGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CardTest {
    @Test
    void suitTest() {
        Card spadeTest = new Card(10,"Spade");
        assertEquals("Spade", spadeTest.getSuit());

        Card clubTest = new Card(5, "Club");
        assertEquals("Club", clubTest.getSuit());

        Card heartTest = new Card(4,"Heart");
        assertEquals("Heart", heartTest.getSuit());

        Card diamondTest = new Card(8,"Diamond");
        assertEquals("Diamond", diamondTest.getSuit());

        Card jokerTest = new Card(-1,"Joker");
        assertEquals("Joker", jokerTest.getSuit());

    }
}
