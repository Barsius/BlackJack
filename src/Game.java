import java.util.Random;
import java.util.Scanner;

public class Game {
    Deck deck = new Deck();
    Random random = new Random();
    Dealer dealer = new Dealer(deck, random);
    Player player = new Player(deck, random);

    Game() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 if you want to continue");
            if (scanner.nextInt() == 1) {
                dealer.firstMove();
                player.firstMove();
                BlackJack();
                player.play();
                dealer.play();
                int pp = player.getPoints();
                int dp = dealer.getPoints();
                if(pp <= 21 & (pp > dp || dp > 21)) System.out.println("Player wins");
                else if(pp == dp && pp < 21) System.out.println("Draw");
                else System.out.println("Player lose");
                reset();
            }
            else return;
        }
    }

    void BlackJack(){
        if (player.getPoints() == 21){
            System.out.println("Player have a BlackJack");
            dealer.firstMove();
            if (dealer.getPoints() == 21) {
                System.out.println("Draw");
            }
            else {
                System.out.println("Player win with BlackJack");
            }
            reset();
            continue;
        }
    }

    void RegularGame(){

    }

    void reset(){
        player.resetPoints();
        dealer.resetPoints();
    }

}
