/*
 * Clase de baraja
 */
package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author kdr
 */
public class Deck {
    
    private final List<Card> cards;
    private int index = 0;
    
    public Deck() {
        this.cards = getAllCards();
    }
    
    /**
     * 
     * @return la siguiente carta a devolver
     */
    public Card obtainCard() {
        Card result = null;
        if (index < cards.size()) {
            result = cards.get(index);
            index++;
        }
        return result;
    }
    
    
    /**
     * mezcla las cartas y vuelve a posicionar el indice de carta actual
     * en la primera posicion
     */
    public void shuffle() {
        index = 0;
        Collections.shuffle(cards);
    }
    
    private static List<Card> getAllCards() {
        int numCards = Card.Suit.values().length * Card.Rank.values().length;
        List<Card> result = new ArrayList<>(numCards);
        for(Card.Suit suit : Card.Suit.values()) {
            for(Card.Rank rank : Card.Rank.values()) {
                result.add(new Card(suit, rank));
            }
        }
        return result;
    }
    
    public interface IHandEvaluator {
        public int eval(Card[] cards);
    }
} 
