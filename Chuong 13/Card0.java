/**
 * Card0
 */
public class Card0 {
    int suit, rank;
    
    public Card0() {
        this.suit = 0;
        this.rank = 0;
    }

    public Card0(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public static void printCard(Card0 c) {
        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] ranks = { "narf", "Ace", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "Jack", "Queen", "King" }; 
        System.out.print(ranks[c.rank] + " of " + suits[c.suit] + "\n");
    }

    //Hàm nhận tham số c1, c2 cùng kiểu Card,
    //hàm trả về 1 nếu c1 > c2, trả về -1 nếu c1 < c2, trả về 0 nếu c1 == c2
    public static int compareCard(Card0 c1, Card0 c2) {
        if (c1.suit > c2.suit) {
            return 1;
        }

        if (c1.suit < c2.suit) {
            return -1;
        }

        //Chỉnh sửa để bậc của Ace cao hơn K:
        if (c1.rank == 1 && c2.rank != 1) {
            return 1;
        }

        if (c1.rank == 13 && c2.rank == 1) {
            return -1;
        }

        if (c1.rank > c2.rank) {
            return 1;
        }

        if (c1.rank < c2.rank){
            return -1;
        }

        return 0;
    }

    //Hàm không nhận tham số nào
    //Hàm trả về một bộ bài 52 lá, mô phỏng 52 lá bài thực tế trong bộ bài
    public static Card0[] makeDeck() {
        Card0[] cards = new Card0[52];

        int index = 0;
        for (int suit = 0; suit <= 3; suit++) 
        {
            for (int rank = 1; rank <= 13; rank++) 
            {
                cards[index] = new Card0(suit, rank);
                Card0.printCard(cards[index]);
                index++;
            }
        }

        return cards;
    }

    //Hàm nhận vào một mảng các lá bài
    //Hàm trả về tổng điểm các lá bài theo luật của trò Blackjack
    public static int handScore(Card0[] cards) {
        int totalScore = 0;
        int[] scores = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < cards.length; i++) {
            if (cards[i].rank >= 10) {
                totalScore += 10;
            } else {
                int cardRank = cards[i].rank;
                totalScore += scores[cardRank];
            }
        }

        return totalScore;
    }

    //Hàm có tham số là một mảng gồm những Card
    //Hàm trả lại một histogram các chất trong nhóm
    public static int[] suitHist(Card0[] cards) {
        int[] suitHist = new int[4];
        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        
        for (int i = 0; i < cards.length; i++) {
            int cardSuit = cards[i].suit;

            for (int j = 0; j < 4; j++) {
                if (cardSuit == j) {
                    suitHist[j]++;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(suitHist[i] + " of " + suits[i] + "\n");
        }

        return suitHist;
    }
    
    //Hàm có tham số là một mảng các Card
    //Hàm trả về true nếu trong mảng có >= 5 lá đồng chất
    public static boolean hasFlush(Card0[] cards) 
    {
        int[] suitHist = suitHist(cards);

        for (int i = 0; i < suitHist.length; i++) {
            if (suitHist[i] >= 5) {
                return true;
            }
        }

        return false;
    }
}