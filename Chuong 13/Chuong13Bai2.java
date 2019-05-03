/**
 * Chuong13Bai2
 */
public class Chuong13Bai2 {

    public static void main(String[] args) {
      Card0[] cards = Card0.makeDeck();

        for (int i = 0; i < 52; i++) {
          Card0.printCard(cards[i]);
        }
    }
    
}
