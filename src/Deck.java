public class Deck {

    Card [] cards = new Card[52];

    Deck(){
        int count = -1;
        for (int i = 0; i < 4; i++){
            cards[++count] = new Two(i);
            cards[++count] = new Three(i);
            cards[++count] = new Four(i);
            cards[++count] = new Five(i);
            cards[++count] = new Six(i);
            cards[++count] = new Seven(i);
            cards[++count] = new Eight(i);
            cards[++count] = new Nine(i);
            cards[++count] = new Ten(i);
            cards[++count] = new Jack(i);
            cards[++count] = new Queen(i);
            cards[++count] = new King(i);
            cards[++count] = new Ace(i);
        }
    }

}
