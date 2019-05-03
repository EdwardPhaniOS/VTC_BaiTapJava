/**
 * Chuong13Bai4
 */
public class Chuong13Bai4 {

    public static void main(String[] args) {
        Card0 card1 = new Card0(2, 3);
        //Card.printCard(card1);

        Card0 card2 = new Card0(2, 1);
        //Card.printCard(card2);

        Card0 card3 = new Card0(2, 12);
        //Card.printCard(card3);

        Card0 card4 = new Card0(2, 10);
        //Card.printCard(card4);

        Card0 card5 = new Card0(2, 5);
        //Card.printCard(card5);

        Card0[] cards = {card1, card2, card3, card4, card5};

        boolean hasFlush = Card0.hasFlush(cards);

        System.out.print("hasFlush: " + hasFlush);
    }
    
}