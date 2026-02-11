/*
    NOTE:

    Add to this type any variables and/or methods required
    to represent one playing card.

    You MAY change this to a record/enum as you see fit.
 */
package core;
public record Card(Rank rank, Suit suit) {

    static public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES }

    static public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
    }
}
