
package poker;

import java.util.Objects;

/**
 *
 * @author kdr
 */
public final class Card {
    
    private static final String STRING_RANK_CARDS  = "23456789TJQKA";
    
    public static enum Suit {        
        SPADE('♠'), HEART('♥'), DIAMOND(('♦')), CLUB('♣');
        private Suit(char c) {
            this.c = c;
        }
        private final char c;
    }
    
    public static enum Rank {
        TWO, TRHEE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }
    
    private final Suit suit;
    private final Rank rank;
    
    public Card(Suit suit, Rank rank) {
        if(suit == null) {
            throw new IllegalArgumentException("suit no puede tener valor nulo");
        }
        if(rank == null) {
            throw new IllegalArgumentException("rank no puede tener el valor nuelo");
        }
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        int rankValue = rank.ordinal();
        return STRING_RANK_CARDS.substring(rankValue, rankValue + 1) + suit.c;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.suit);
        hash = 71 * hash + Objects.hashCode(this.rank);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Card other = (Card) obj;
        if (this.suit != other.suit) {
            return false;
        }
        if (this.rank != other.rank) {
            return false;
        }
        return true;
    }
    
}
