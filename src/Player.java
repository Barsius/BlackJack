import java.util.Random;
import java.util.Scanner;

public class Player {

    Deck deck;
    Random random;
    Scanner scanner = new Scanner(System.in);
    private int points = 0;

    Player(Deck deck, Random random){
        this.deck = deck;
        this.random = random;
    }

    void firstMove(){
        for (int i = 0; i < 2; i++){
            int r = random.nextInt(52);
            points += deck.cards[r].getCost();
            System.out.println(deck.cards[r].getName() + " " + deck.cards[r].getSuit() + "(" + deck.cards[r].getCost() + ")");
            System.out.println("Your points :" + points);
        }
    }

    void play(){
        System.out.print("Enter number 1 if you want to draw a card: ");
        while (true) {
            if (scanner.nextInt() == 1) {
                int r = random.nextInt(52);
                System.out.println(deck.cards[r].getName() + " " + deck.cards[r].getSuit() + "(" + deck.cards[r].getCost() + ")");
                points += deck.cards[r].getCost();
                if(points < 21) {
                    System.out.println("Your points :" + points + ". Enter 1 if you want do draw another card:");
                }
                else if (points == 21){
                    System.out.println("Congratulations! You have BlackJack");
                }
                else {
                    System.out.println("Sorry, you are busted");
                    return;
                }
            } else return;
        }
    }

    int getPoints(){
        return points;
    }

    void resetPoints(){
        points = 0;
    }

}
