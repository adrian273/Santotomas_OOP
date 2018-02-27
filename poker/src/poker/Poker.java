
package poker;

import java.util.HashSet;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *
 * @author kdr
 */
public class Poker {
    
    private static Logger LOGGER = LoggerFactory.getLogger(Poker.class); 
    
    private static void insert(Set<Card> cards, Card card) {
        if(!cards.contains(card)) {
            LOGGER.debug("Carta insertada: {}", card);
            cards.add(card);
        }
        else {
            LOGGER.debug("la carta ya esta en el conjunto {}", card);
        }
    }
    
    public static void main(String[] args) {        
        Set<Card> cards = new HashSet<>();
        Card[] carsInsert = {
            new Card(Card.Suit.CLUB, Card.Rank.ACE),
            new Card(Card.Suit.CLUB, Card.Rank.TWO),
            new Card(Card.Suit.CLUB, Card.Rank.TRHEE),
            new Card(Card.Suit.CLUB, Card.Rank.ACE),
            
        };
        
        for(Card card : carsInsert){
            insert(cards, card);
        }
       
    }
    
}
