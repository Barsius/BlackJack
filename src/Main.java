public class Main {

    public static void main(String[] args){

        Deck deck = new Deck();
        for (int i = 0; i < deck.cards.length; i++) {
            System.out.println("Card: " + deck.cards[i].Name + ", suit: " + deck.cards[i].getSuit() + ", cost: " + deck.cards[i].cost);
        }
    }
}
