/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.HashSet;
import java.util.Set;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.not;
import poker.Card;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kdr
 */
public class CardTest {
    
    @Test
    public void testContructor() {
        System.out.println("Card()");
        Card.Suit expSuit = Card.Suit.CLUB;
        Card.Rank expRank = Card.Rank.TWO;
        
        Card instance = new Card(expSuit, expRank);
        Card.Suit suitResult = instance.getSuit();
        assertEquals(expSuit, suitResult);
        
        Card.Rank rankResult = instance.getRank();
        assertEquals(expRank, rankResult);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testContructorSuit() {
        System.out.println("Card(SuitNull)");
        Card.Rank expRank = Card.Rank.EIGHT;
        Card.Suit expSuit = null;
        Card card = new Card(expSuit, expRank);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testContructorRank() {
        System.out.println("Card(RankNull)");
        Card.Rank expRank = null;
        Card.Suit expSuit = Card.Suit.CLUB;
        new Card(expSuit, expRank);
    }
    
    private static Card[] getAllCards() {
        Card[] result = new Card[Card.Suit.values().length * Card.Rank.values().length];
        int i = 0;
        for(Card.Suit suit : Card.Suit.values()) {
            for(Card.Rank rank : Card.Rank.values()) {
                Card c = new Card(suit, rank);
                result[i] = c;
                i++;
            }
        }
        return result;
    }
    
    /**
     * calcula los valores hashCode de todas las cartas y comprueba que ninguno se repite, utilizando
     * asserts mas expresivos.
     */
    @Test
    public void testHashCode() {
        System.out.println("HashCode");
        Card[] allCards = getAllCards();
        Set<Integer> hashCode = new HashSet<>(allCards.length);
        for(Card card : allCards) {
            assertThat(hashCode, not(hasItem(card.hashCode())));
        }
    }
    
    @Test
    public void testEqualsOtherObject() {
        System.out.println("EqualsOtherObjects");
        Card card = new Card(Card.Suit.CLUB, Card.Rank.ACE);
        assertNotEquals("Card: " + card + "! null", card, null);
        assertNotEquals("Card: " + card + "!= 0", card, 0);
        assertNotEquals("Card: " + card + "!= \"2C\"", card, "2C");
    }
    
    /**
     * Recorre un array con todas las cartas y para cada una de 
     * ellas vuelve a recorrer la lista completa para verificar que solo es igual 
     * a la carta que ocupa su misma posicion o sea a si misma.
     */
    @Test
    public void testEquals() {
        System.out.println("Equals");
        int i = 0;
        for(Card card0 : getAllCards()) {
            int j = 0;
            for(Card card1 : getAllCards()) {
                if(i == j) {
                    assertEquals(card0, card1);
                }
                j++;
            }
            i++;
        }
    }
    
    @Test
    public void testEqualsDistinct() {
        System.out.println("EqualsDistinct");
        int i = 0;
        for(Card card0 : getAllCards()) {
            int j = 0;
            for(Card card1 : getAllCards()) {
                if(i != j) {
                    assertNotEquals(card0, card1);
                }
                j++;
            }
            i++;
        }
    }
    
}
