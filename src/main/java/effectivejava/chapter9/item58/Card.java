package effectivejava.chapter9.item58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Card {
    private final Suit suit;
    private final Rank rank;

    enum Suit {
        CLUB, DIAMOND, HEART, SPADE;
    }
    enum Rank {
        ACE, DUECE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
        NINE, TEN, JACK, QUEEN, KING;
    }

    static Collection<Suit> suits = Arrays.asList(Suit.values());
    static Collection<Rank> ranks = Arrays.asList(Rank.values());

    Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(this.suit.name());
        sb.append(",");
        sb.append(this.rank.name());
        sb.append(")");
        return sb.toString();
    }

    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>();
        for (Suit suit : suits)
            for (Rank rank : ranks)
                deck.add(new Card(suit, rank));
        System.out.println(deck);
    }
}
