/*
    NOTE:

    Add to this type any variables and/or methods required
    to represent/manipulate one player in the game.

    You MAY change this to a record/enum as you see fit.
 */
package core;


import java.util.List;

public class Player {
    public int points;
    List<Card> hand;
    
    
    public Player(List<Card> hand) {
        this.hand = hand;
    }
    public void players() {
        CardStack.splitdeck();
        Player player1 = new Player(CardStack.deck1);
        Player player2 = new Player(CardStack.deck2);
        Card war1 =  CardStack.deck1.getFirst();
        CardStack.deck1.removeFirst();
        Card war2 =  CardStack.deck2.getFirst();
        CardStack.deck2.removeFirst();
    }


}






