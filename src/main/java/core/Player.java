/*
    NOTE:

    Add to this type any variables and/or methods required
    to represent/manipulate one player in the game.

    You MAY change this to a record/enum as you see fit.
 */
package core;


import java.util.List;

public class Player {
    List<Card> hand;

    public Player(List<Card> hand) {
        this.hand = hand;
    }
    public void players() {
        CardStack.splitdeck();
        Player player1 = new Player(CardStack.deck1);
        Player player2 = new Player(CardStack.deck2);

    }
}


    // player must have deck of cards




