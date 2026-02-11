/*
    NOTE:

    Add to this type any variables and methods required
    to represent and manipulate the overall state of the high card game.

    You MAY change this to a record/enum as you see fit.
 */
package core;

// make dataset where each card has a value

// make code so the card with a (>) value wins

// give winner +1 point

public class HighCardGame {

    public int value(Card.Rank rank) {
        return switch (rank) {
            case TWO -> 2;
            case THREE -> 3;
            case FOUR -> 4;
            case FIVE -> 5;
            case SIX -> 6;
            case SEVEN -> 7;
            case EIGHT -> 8;
            case NINE -> 9;
            case TEN -> 10;
            case JACK -> 11;
            case QUEEN -> 12;
            case KING -> 13;
            case ACE -> 14;
        };
    }

    public void scoring(Card c1, Card c2, Player player1, Player player2) {
        int v1 = value(c1.rank());
        int v2 = value(c2.rank());

        if (v1 > v2) {
            player1.points += 1;
        } else if (v2 > v1) {
            player2.points += 1;
        }
    }
}
