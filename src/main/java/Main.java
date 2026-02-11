import core.CardStack;
import core.HighCardGame;
import core.Player;
import core.Card;
import java.util.List;

import static ui.Console.prompt;

public class Main {

    static void main() {
        String user1 = prompt("User 1 whats your name?: ");
        String user2 = prompt("User 2 whats your name?: ");
        List<Card> fullDeck = CardStack.makedeck();
        List<Card> splitDeck = CardStack.splitdeck();

        HighCardGame game = new HighCardGame();


        for (int i = 0; i < 26; i++) {
            Card c1 = user1.hand.remove(0);
            Card c2 = user2.hand.remove(0);
            game.playRound(c1, c2, player1, player2);


        }

        System.out.println(player1.name + " points: " + player1.points);
        System.out.println(player2.name + " points: " + player2.points);







        /*
             Place your main game logic here.
             This is the ONLY code file that should have any reference to the Console class.

             The basic flow of the game is as follows:

             1. Prompt for player names
             2. Deal a shuffled deck evenly to each of the players
             3. While the players have cards and wish to continue:
                 b. All players draw one card and reveal them
                 c. The player with the higher card wins the round (or it's a tie)
         */

    }
}
