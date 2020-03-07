import java.util.Random;

public class Game {
    Deck deck = new Deck();
    Random random = new Random();
    Dealer dealer = new Dealer(deck, random);
    Player player = new Player(deck, random);

    Game() {
        while (true) {
            dealer.firstMove();
            player.firstMove();
            player.play();
            if (player.getPoints() < 21) {
                dealer.play();
                if (dealer.getPoints() < 21) {
                    if (player.getPoints() > dealer.getPoints()) System.out.println("Player wins");
                    else if (player.getPoints() < dealer.getPoints()) System.out.println("Dealer wins");
                    else System.out.println("Draw");
                } else System.out.println("Player wins");
            } else if (player.getPoints() == 21) {
                if (dealer.getPoints() == 21) {
                    System.out.println("Draw");
                } else System.out.println("Player wins");
            } else System.out.println("Player busted");
            player.resetPoints();
            dealer.resetPoints();
        }
    }
}
