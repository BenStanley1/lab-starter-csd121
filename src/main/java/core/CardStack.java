/*
    NOTE:

    Add to this type any variables and/or methods required
    to represent/manipulate a stack (deck/hand) of playing cards.

    You MAY change this to a record/enum as you see fit.
 */
package core;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class CardStack {
    static List<Card> deck1;
    static List<Card> deck2;

    public static List<Card> makedeck() {
        ArrayList<Card> deck = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                deck.add(new Card(rank, suit));
            }
        }
        return deck;
    }

    public static List<Card> splitdeck() {
        List<Card> deck = makedeck();
        Collections.shuffle(deck);
        deck1 = new ArrayList<>();
        deck2 = new ArrayList<>();

        for (int i = 0; i < deck.size(); i++) {
            Card card = deck.get(i);
            if (i % 2 == 0) {
                deck1.add(card);
            } else {
                deck2.add(card);
            }
        }

        return deck;
    }
}



