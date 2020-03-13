import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Player {

    Deck deck;
    Random random;
    private int points = 0;

    Player(Deck deck, Random random){
        this.deck = deck;
        this.random = random;
    }

    void firstMove(){
        for (int i = 0; i < 2; i++){
            int r = random.nextInt(52);
            points += deck.cards[r].getCost();
            System.out.println("You draw: " + deck.cards[r].getName() + deck.cards[r].getSuit() + " (" + deck.cards[r].getCost() + ")");
        }
        System.out.println("Your points :" + points);
    }

    void play(){
        while (true) {
            System.out.print("Enter number 1 if you want to draw a card: ");
            Scanner scanner = new Scanner(System.in);
            try {
                if (scanner.nextInt() == 1) {
                    int r = random.nextInt(52);
                    System.out.println(deck.cards[r].getName() + deck.cards[r].getSuit() + " (" + deck.cards[r].getCost() + ")");
                    points += deck.cards[r].getCost();
                    if (points <= 21) {
                        System.out.println("Your points :" + points + ". Enter 1 if you want do draw another card:");
                    } else {
                        System.out.println("Your points :" + points);
                        System.out.println("Sorry, you are busted");
                        return;
                    }
                } else return;
            } catch (InputMismatchException e){
                System.out.println("You allowed to input only numbersss");
            }
        }
    }

    int getPoints(){
        return points;
    }

    void resetPoints(){
        points = 0;
    }

}
