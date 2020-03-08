package Cards;

public class Card {
    final private int DIAMONDS = 0;
    final private int HEARTS = 1;
    final private int SPADES = 2;
    final private int CLUBS = 3;
    private String Suit;
    int cost;
    String Name;

    Card(int cost, int suit, String name){
        this.cost = cost;
        switch (suit){
            case DIAMONDS: Suit = "♦"; break;
            case HEARTS: Suit = "♥"; break;
            case SPADES: Suit = "♠"; break;
            case CLUBS: Suit = "♣"; break;
        }
        Name = name;
    }

    public int getCost(){
        return cost;
    };

    public String getSuit (){
        return Suit;
    }

    public String getName(){return Name;};
}
