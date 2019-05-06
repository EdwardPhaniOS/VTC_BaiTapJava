//import sun.font.TrueTypeFont;

/**
 * Cardoln3
 */
public class Cardoln3 {

public static void main(String[] args) 
{
    System.out.println("This is a test");
    
    Deck5 deck = new Deck5();
    Deck5 hand = new Deck5(5);
    
    //Cau 5.3, 5.5:

    deck.shuffle();
    hand = deck.deal(0);
    hand.print();

    PokerHand hand1 = new PokerHand(hand.cards);
    hand1.hasFlush();
    hand1.hasThreeKind();
    hand1.fiveOfAKind();
    hand1.fourOfAKind();
    hand1.straightFlush();
    hand1.onePair();
    hand1.twoPair();
    hand1.highCard();

    //Cau 5.4
    PokerHand[] result = new PokerHand[4];
    deck.shuffle();
    for (int i = 0; i < 4; i++) {
        Deck5 handi = new Deck5(5);
        int j = 0;
        handi = deck.deal(j);
        j += 5;

        result[i] = new PokerHand(handi.cards);
    }

    //Cau 5.7: Xác suất để có Three of a Kind hoặc HasFlush trong lần phân bài là dưới 0.02%
    PokerHand[] result1000 = new PokerHand[1000];
    for (int i = 0; i < 1000; i++) {
        deck.shuffle();
        Deck5 handi = new Deck5(5);
        handi = deck.deal(0);

        result1000[i] = new PokerHand(handi.cards);
    }

    // for (int i = 0; i < 1000; i++) {
    //     if (result1000[i].hasFlush() == true) {
    //         System.out.println("result[" + i + "]" + "--has Flush");
    //     } else {
    //         if (result1000[i].hasThreeKind() == true) {
    //             System.out.println("result[" + i + "]" + "--hasThreeKind");
    //         }
    //     }
    // }

    //Câu 5.9:
    PokerHand hand2 = new PokerHand();

    hand2.fiveOfAKind();
    hand2.straightFlush();
    hand2.fourOfAKind();
    hand2.fullHouse();
    hand2.hasFlush();
    hand2.straight();
    hand2.hasThreeKind();
    hand2.twoPair();
    hand2.onePair();
    hand2.highCard();
}
}   

class Card4 {
    int suit, rank;

    static String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
    static String[] ranks = { "narf", "Ace", "2", "3", "4", "5", "6",
			      "7", "8", "9", "10", "Jack", "Queen", "King" };

    /*
     * No-argument constructor.
     */
    public Card4() { 
	this.suit = 0;  this.rank = 0;
    }

    /*
     * Constructor with arguments.
     */
    public Card4(int suit, int rank) { 
	this.suit = suit;  this.rank = rank;
    }

    /*
     * Prints a card in human-readable form.
     */
    public void print() {
	System.out.println(ranks[rank] + " of " + suits[suit]);
    }

    /*
     * Prints a card in human-readable form.
     */
    public String toString() {
	return ranks[rank] + " of " + suits[suit];
    }

    /*
     * Return true if the cards are equivalent.
     */
    public boolean equals(Card4 that) {
	return (this.suit == that.suit && this.rank == that.rank);
    }

    /*
     * Compares two cards: returns 1 if the first card is greater
     * -1 if the seconds card is greater, and 0 if they are the equivalent.
     */
    public int compareTo(Card4 that) {

	// first compare the suits
	if (this.suit > that.suit) return 1;
	if (this.suit < that.suit) return -1;

	// if the suits are the same,
	// use modulus arithmetic to rotate the ranks
	// so that the Ace is greater than the King.
	// WARNING: This only works with valid ranks!
	int rank1 = (this.rank + 11) % 13;
	int rank2 = (that.rank + 11) % 13;
	
	// compare the rotated ranks

	if (rank1 > rank2) return 1;
	if (rank1 < rank2) return -1;
	return 0;
    }
}


/*
 * A Deck contains an array of cards.
 */
class Deck5 {
    Card4[] cards;
    /*
     * Makes a Deck with room for n Cards (but no Cards yet).
     */
    public Deck5(int n) {
        this.cards = new Card4[n];
    }

    /*
     * Makes an array of 52 cards.
     */
    public Deck5() {
	this.cards = new Card4 [52];
	
	int index = 0;
	for (int suit = 0; suit <= 3; suit++) {
	    for (int rank = 1; rank <= 13; rank++) {
		this.cards[index] = new Card4(suit, rank);
		index++;
 	    }
	}
    }

    /*
     * Prints a deck of cards.
     */
    public void print() {
	for (int i=0; i<cards.length; i++) {
	    cards[i].print();
	}
    }

    /*
     * Returns index of the first location where card appears in deck.
     * Or -1 if it does not appear.  Uses a linear search.
     */
    public int findCard (Card4 card) {
	for (int i = 0; i< cards.length; i++) {
	    if (card.equals(cards[i])) {
		return i;
	    }
	}
	return -1;
    }

    /*
     * Returns index of a location where card appears in deck.
     * Or -1 if it does not appear.  Uses a bisection search.
     *
     * Searches from low to high, including both.
     *
     * Precondition: the cards must be sorted from lowest to highest.
     */
    public int findBisect(Card4 card, int low, int high) {
	if (high < low) return -1;

	int mid = (high + low) / 2;
	int comp = card.compareTo(cards[mid]);

	if (comp == 0) {
	    return mid;
	} else if (comp < 0) {
	    // card is less than cards[mid]; search the first half
	    return findBisect(card, low, mid-1);
	} else {
	    // card is greater; search the second half
	    return findBisect(card, mid+1, high);
	}
    }

    /*
     * Chooses a random integer between low and high, including low,
     * not including high. 
     */
    public int randInt(int low, int high) {
	// Because Math.random can't return 1.0, and (int)
	// always rounds down, this method can't return high.
	int x = (int)(Math.random() * (high-low) + low);
	return x;
    }

    /*
     * Swaps two cards in a deck of cards.
     */
    public void swapCards(int i, int j) {
	Card4 temp = cards[i];
	cards[i] = cards[j];
	cards[j] = temp;
    }

    /*
     * Shuffles the cards in a deck.
     */
    public void shuffle() {
	for (int i=0; i<cards.length; i++) {
	    int j = randInt(i, cards.length-1);
	    swapCards(i, j);
	}
    }

    /*
     * Sorts a deck from low to high.
     */
    public void sort() {
	for (int i=0; i<cards.length; i++) {
	    int j = indexLowestCard(i, cards.length-1);
	    swapCards(i, j);
	}
    }

    /*
     * Finds the index of the lowest card between low and high,
     * including both.
     */
    public int indexLowestCard(int low, int high) {
	int winner = low;
	for (int i=low+1; i<=high; i++) {
	    if (cards[i].compareTo(cards[winner]) < 0) {
		winner = i;
	    }
	}
	return winner;
    }

    /*
     * Makes a new deck of cards with a subset of cards from the original.
     * The old deck and new deck share references to the same card objects.
     */
    public Deck5 subdeck(int low, int high) {
	Deck5 sub = new Deck5(high-low+1);
	
	for (int i = 0; i<sub.cards.length; i++) {
	    sub.cards[i] = cards[low+i];
	}
	return sub;
    }

    public Deck5 deal(int startIndex) {
        this.shuffle();
        Deck5 sub = new Deck5(5);
        for (int i = 0; i<sub.cards.length; i++) {
            sub.cards[i] = cards[startIndex+i];
        }
        return sub;
    }

     public Deck5 dealSevenCards(int startIndex) {
        this.shuffle();
        Deck5 sub = new Deck5(7);
        for (int i = 0; i<sub.cards.length; i++) {
            sub.cards[i] = cards[startIndex+i];
        }
        return sub;
    }

    /*
     * Merges two sorted decks into a new sorted deck.
     */
    public static Deck5 merge(Deck5 d1, Deck5 d2) {
	// create the new deck
	Deck5 result = new Deck5 (d1.cards.length + d2.cards.length);
		
	int choice;    // records the winner (1 means d1, 2 means d2)
	int i = 0;     // traverses the first input deck
	int j = 0;     // traverses the second input deck
		
	// k traverses the new (merged) deck
	for (int k = 0; k < result.cards.length; k++) {
	    choice = 1;

	    // if d1 is empty, d2 wins; if d2 is empty, d1 wins; otherwise,
	    // compare the two cards
	    if (i == d1.cards.length)
		choice = 2;
	    else if (j == d2.cards.length)
		choice = 1;
	    else if (d1.cards[i].compareTo(d2.cards[j]) > 0)
		choice = 2;
			
	    // make the new deck refer to the winner card
	    if (choice == 1) {
		result.cards[k] = d1.cards[i];  i++;
	    } else {
		result.cards[k] = d2.cards[j];  j++;
	    }			
	}
	return result;
    }
	
    /*
     * Sort the Deck using merge sort.
     */
    public Deck5 mergeSort() {
	if (cards.length < 2) {
	    return this;
	}
	int mid = (cards.length-1) / 2;
	
	// divide the deck roughly in half
	Deck5 d1 = subdeck(0, mid);
	Deck5 d2 = subdeck(mid+1, cards.length-1);
	
	// sort the halves
	d1 = d1.mergeSort();
	d2 = d2.mergeSort();
	
	// merge the two halves and return the result
	// (d1 and d2 get garbage collected)
	return merge(d1, d2);
    }
}

class PokerHand extends Deck5 {

    public PokerHand(Card4[] cards) {
       this.cards = cards;
    }

    public PokerHand() {
        Deck5 sevenCards = new Deck5(7);
        sevenCards = this.dealSevenCards(0);
        System.out.println("SevenCardPrint: ==============");
        sevenCards.print();
        this.cards = sevenCards.cards;
    }

    public boolean hasFlush() 
    {
        Card4 card = this.cards[0];
        for (int i = 1; i < this.cards.length; i++) 
        {
            if (card.suit != this.cards[i].suit)
                {
                    //System.out.println("hasFlush: false");
                    return false;  
                }
        }

        System.out.println("hasFlush: true");
        return true;
    }

    //Hàm trả về true nếu trong 5 lá bài có 3 lá bài cùng rank
    public boolean hasThreeKind() {
        this.sortRank();
        int cardsLength = this.cards.length;
        
        if (this.cards[0].rank == this.cards[1].rank 
        && this.cards[0].rank == this.cards[2].rank) 
        {
            System.out.println("hasThreeKind: true");
            return true;
        }

        if (this.cards[cardsLength - 1].rank == this.cards[cardsLength - 2].rank 
        && this.cards[cardsLength - 1].rank == this.cards[cardsLength - 3].rank) 
        {
            System.out.println("hasThreeKind: true");
            return true;
        }

        //System.out.println("hasThreeKind: false");
        return false;
    }

    //Hàm trả về true, nếu có 4 lá giống nhau về rank và 1 lá còn lại là Joker
    public boolean fiveOfAKind() 
    {
        this.sortRank();
        if (this.cards[0].rank == this.cards[1].rank && this.cards[0].rank == this.cards[2].rank
            && this.cards[0].rank == this.cards[3].rank && this.cards[4].rank == 0)
        {
            System.out.println("fiveOfAKind: true");
            return true;
        }

        if (this.cards[1].rank == this.cards[2].rank && this.cards[1].rank == this.cards[3].rank
        && this.cards[1].rank == this.cards[4].rank && this.cards[0].rank == 0)
        {
            System.out.println("fiveOfAKind: true");
            return true;
        }

        return false; 
    }

    //Hàm trả về true, nếu có 4 lá giống nhau về rank và 1 lá còn lại không phải là lá Joker
    public boolean fourOfAKind() 
    {
        this.sortRank();
        if (this.cards[0].rank == this.cards[1].rank && this.cards[0].rank == this.cards[2].rank
            && this.cards[0].rank == this.cards[3].rank && this.cards[4].rank != 0)
        {
            System.out.println("fourOfAKind: true");
            return true;
        }

        if (this.cards[1].rank == this.cards[2].rank && this.cards[1].rank == this.cards[3].rank
        && this.cards[1].rank == this.cards[4].rank && this.cards[0].rank != 0)
        {
            System.out.println("fourOfAKind: true");
            return true;
        }

        return false; 
    }

    //Hàm trả về True nếu 5 lá bài đồng chất 
    //và mỗi lá bài có rank bé hơn lá kế bên phải nó 1 đơn vị
    public boolean straightFlush() {
        this.sortRank();
        if (this.hasFlush() == false) {
            return false;
        }

        for (int i = 0; i < this.cards.length - 1; i++) {
            if (this.cards[i].rank + 1 != this.cards[i+1].rank) {
                return false;
            }
        }
        System.out.println("straightFlush: true");
        return true;
    }

    //Hàm trả về True nếu 5 lá không đồng chất và mỗi lá có rank thấp hơn lá kế bên phải 1 đơn vị
    public boolean straight() {
        this.sortRank();
        if (this.hasFlush() == true) {
            return false;
        }

        for (int i = 0; i < this.cards.length - 1; i++) {
            if (this.cards[i].rank + 1 != this.cards[i+1].rank) {
                return false;
            }
        }
        System.out.println("straight: true");
        return true;
    }

    // Hàm trả về True nếu trong 5 lá, có 3 lá giống nhau về rank và 2 lá còn lại có rank giống nhau
    public boolean fullHouse() {
        this.sortRank();
        if (this.hasThreeKind() == false) {
            return false;
        }

        if (this.cards[3].rank == this.cards[4].rank || this.cards[0].rank == this.cards[1].rank) {
            System.out.println("fullHouse: true");
            return true;
        }
        
        return false;
    }

    //Hàm trả về True nếu như trong 5 lá bài không đồng chất
    //chỉ có duy nhất 1 cặp lá bài cùng rank
    public boolean onePair() {
        this.sortRank();
        

        if (this.hasFlush() == true) {
            return false;
        }

        int count = 0;
        for (int i = 0; i < this.cards.length - 1; i++) {
            if (this.cards[i].rank == this.cards[i+1].rank) {
                count++;
            }
        }

        if (count == 1) {
            System.out.println("onePair: true");
            return true;
        } else {
            return false;
        }  
    }

    //Hàm trả về True nếu như trong 5 lá bài không đồng chất
    // chỉ có duy nhất 2 cặp lá bài cùng rank
    //và 2 cặp này không phải là 3 lá cùng rank liền kề nhau
    public boolean twoPair() 
    {
        this.sortRank();
        
        if (this.hasFlush() == true || this.hasThreeKind() == true)
        {
            return false;
        }

        int count = 0;
        for (int i = 0; i < this.cards.length - 1; i++) {
            if (this.cards[i].rank == this.cards[i+1].rank) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("twoPair: true");
            return true;
        } else {
            return false;
        }  
    }

    //Hàm trả về True nếu như trong 5 lá bài không đồng chất
    // không hề có cặp lá bài cùng rank nào
    public boolean highCard() 
    {
        this.sortRank();

        if (this.hasFlush() == true)
        {
            return false;
        }

        int count = 0;
        for (int i = 0; i < this.cards.length - 1; i++) {
            if (this.cards[i].rank == this.cards[i+1].rank) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("highCard: true");
            return true;
        } else {
            return false;
        }  
    }

    //Hàm trả về những lá bài đã được sắp xếp theo rank từ thấp đến lớn, 
    //những lá có rank giống nhau sẽ đứng cạnh nhau
    public void sortRank() {
        for (int i=0; i<cards.length; i++) {
            int j = indexLowestRank(i, cards.length-1);
            swapCards(i, j);
        }
    }

    //Hàm có tham số là low(int) và high(int) rồi trả về index của lá bài có rank thấp nhất
    //trong đoạn low, high
    public int indexLowestRank(int low, int high) {
        int winner = low;
        for (int i=low+1; i<=high; i++) {
            if (cards[i].rank < cards[winner].rank) {
            winner = i;
            }
        }
        return winner;
        }
}