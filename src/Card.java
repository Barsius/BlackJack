class Card {
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
            case DIAMONDS: Suit = "Diamonds"; break;
            case HEARTS: Suit = "Hearts"; break;
            case SPADES: Suit = "Spades"; break;
            case CLUBS: Suit = "Clubs"; break;
        }
        Name = name;
    }

    int getCost(){
        return cost;
    };

    String getSuit (){
        return Suit;
    }
}
