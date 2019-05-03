/**
 * Chuong13Bai3
 */
public class Chuong13Bai3 {
    public static void main(String[] args) {
        Card0 card1 = new Card0(0, 3);
        Card0.printCard(card1);

        Card0 card2 = new Card0(0, 1);
        Card0.printCard(card2);

        Card0 card3 = new Card0(0, 12);
        Card0.printCard(card3);

        Card0[] cards = {card1, card2, card3};

        int result = Card0.handScore(cards);
        System.out.print("result: " + result);
    }
    
}

