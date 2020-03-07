public class Deck {

    Card [] cards = new Card[8];

    Deck(){
        int count = -1;
        for (int i = 0; i < 4; i++){
            cards[++count] = new Jack(i);
            cards[++count] = new King(i);
        }
    }

}
