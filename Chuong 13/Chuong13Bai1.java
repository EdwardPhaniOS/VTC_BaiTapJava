/**
 * Chuong13Bai1
 */
public class Chuong13Bai1 {

    public static void main(String[] args) {
        Card0 threeOfClubs = new Card0(0, 3);
        Card0.printCard(threeOfClubs);

        Card0 card2 = new Card0(0, 1);
        Card0.printCard(card2);

        Card0 card3 = new Card0(0, 13);
        Card0.printCard(card3);

        int result = Card0.compareCard(card2, card3);
        System.out.println("result: " + result);
    }
}
