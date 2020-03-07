import java.util.Random;

public class Dealer {
    private int points = 0;
    Deck deck;
    Random random;

    Dealer(Deck deck, Random random){
        this.deck = deck;
        this.random = random;
    }

    void play(){
        do {
            int r = random.nextInt(52);
            points += deck.cards[r].getCost();
            System.out.println("Dealer draw " + deck.cards[r].getName() + " " + deck.cards[r].getSuit() + " (" + deck.cards[r].getCost() + ")");
            System.out.println("Dealer points: " + points);
        } while (points < 17);
        System.out.println("Dealer stops");
    }

    void firstMove(){
        int r = random.nextInt(52);
        points += deck.cards[r].getCost();
        System.out.println("Dealer draw " + deck.cards[r].getName() + " " + deck.cards[r].getSuit() + " (" + deck.cards[r].getCost() + ")");
    }

    int getPoints(){
        return points;
    }

    void resetPoints(){
        points = 0;
    }
}
