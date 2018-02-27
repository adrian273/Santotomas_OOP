
package poker;

/**
 *
 * @author kdr
 */
public class Hands {
    
    public static final int CARDS = 5;
    
    public enum Type {
        HIGH_CARD,
        ONE_PAIR,
        TWO_PAIR,
        THREE_OF_A_KIND,
        STRAIGHT,
        FLUSH,
        FULL_HOUSE,
        FOUR_OF_A_KIND,
        STRAIGHT_FLUSH
    }
    
    public Hands() {
        
    }
}
