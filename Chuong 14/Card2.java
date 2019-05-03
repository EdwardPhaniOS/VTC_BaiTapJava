/* 
 * Example code for Think Java (http://thinkapjava.com)
 *
 * Copyright(c) 2011 Allen B. Downey
 * GNU General Public License v3.0 (http://www.gnu.org/copyleft/gpl.html)
 *
 * @author Allen B. Downey
 */

public class Card2 {
    /*
     * Test code.
     */
    public static void main(String[] args) {
	Deck deck = new Deck();
    
    // check swapCard_Cau 1.3
    Deck.swapCards(deck, 0, 1);
    for (int i=0; i<52; i++) {
       Card.printCard(deck.cards[i]);
    }
    
    // check shuffleDeck_Cau 1.4
    Deck.shuffleDeck(deck);
    //checkSorted(deck);
    
    // check lowestIndex_Cau 1.5
    int lowestIndex = Deck.indexLowestCard(deck, 0, 51);
    Card.printCard(deck.cards[lowestIndex]);

    // check sortDeck_Cau 1.6
	Deck.shuffleDeck(deck);
    Deck.sortDeck(deck);
    checkSorted(deck);
    // for (int i=0; i<52; i++) {
    //     Card.printCard(deck.cards[i]);
    //  }
    
	// // check that findBisect finds each card
	// int index;
	// for (int i=0; i<52; i++) {
	//     index = Deck.findBisect(deck, deck.cards[i], 0, 
	// 			    deck.cards.length-1);
	//     if (index != i) {
	// 	System.out.println("Not found!");
	//     }
	// }
	
	// // make a subdeck
	// Deck hand = Deck.subdeck(deck, 8, 12);
	// Deck.printDeck(hand);

	// // check that findBisect doesn't find a card that's not there
	// Card badCard = new Card(1, 1);
	// index = Deck.findBisect(hand, badCard, 0, hand.cards.length-1);
	// if (index != -1) {
	//     System.out.println("Found?");
    // }
    
    // check mergeSortWithSortDeck_Cau 1.7, 1.8
	Deck.shuffleDeck(deck);
	deck = Deck.mergeSortWithSortDeck(deck);
	checkSorted(deck);

	//check mergeSort_Cau 1.7, 1.9
    Deck.shuffleDeck(deck);
	deck = Deck.mergeSort(deck);
	checkSorted(deck); 
}

    // /*
    //  * Checks that the deck is sorted.
    //  */
    public static void checkSorted(Deck deck) {
	for (int i=0; i<51; i++) {
	    int flag = Card.compareCards(deck.cards[i], deck.cards[i+1]);
	    if (flag != -1) {
		    System.out.println("Not sorted!");
	    } else {
            //System.out.println("Sorted!");
        }
    }
    }
}

/*
 * A Card represents a playing card with rank and suit.
 */
class Card {
    int suit, rank;

    static String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
    static String[] ranks = { "narf", "Ace", "2", "3", "4", "5", "6",
			   "7", "8", "9", "10", "Jack", "Queen", "King" };

    /*
     * No-argument constructor.
     */
    public Card() { 
	this.suit = 0;  this.rank = 0;
    }

    /*
     * Constructor with arguments.
     */
    public Card(int suit, int rank) { 
	this.suit = suit;  this.rank = rank;
    }

    /*
     * Prints a card in human-readable form.
     */
    public static void printCard(Card c) {
	System.out.println(ranks[c.rank] + " of " + suits[c.suit]);
    }

    /*
     * Return true if the cards are equivalent.
     */
    public static boolean sameCard(Card c1, Card c2) {
	return (c1.suit == c2.suit && c1.rank == c2.rank);
    }

    /*
     * Compares two cards: returns 1 if the first card is greater
     * -1 if the seconds card is greater, and 0 if they are the equivalent.
     */
    public static int compareCards(Card c1, Card c2) {

	// first compare the suits
	if (c1.suit > c2.suit) return 1;
	if (c1.suit < c2.suit) return -1;

	// if the suits are the same,
	// use modulus arithmetic to rotate the ranks
	// so that the Ace is greater than the King.
	// WARNING: This only works with valid ranks!
	int rank1 = (c1.rank + 11) % 13;
	int rank2 = (c2.rank + 11) % 13;
	
	// compare the rotated ranks

	if (rank1 > rank2) return 1;
	if (rank1 < rank2) return -1;
	return 0;
    }
}


/*
 * A Deck contains an array of cards.
 */
class Deck {
    Card[] cards;

    /*
     * Makes a Deck with room for n Cards (but no Cards yet).
     */
    public Deck(int n) {
        this.cards = new Card[n];
    }

    /*
     * Makes an array of 52 cards.
     */
    public Deck() {
	this.cards = new Card [52];
	
	int index = 0;
	for (int suit = 0; suit <= 3; suit++) {
	    for (int rank = 1; rank <= 13; rank++) {
		this.cards[index] = new Card(suit, rank);
		index++;
 	    }
	}
    }

    /*
     * Prints a deck of cards.
     */
    public static void printDeck(Deck deck) {
	for (int i=0; i<deck.cards.length; i++) {
	    Card.printCard(deck.cards[i]);
	}
    }

    /*
     * Returns index of the first location where card appears in deck.
     * Or -1 if it does not appear.  Uses a linear search.
     */
    public static int findCard (Deck deck, Card card) {
	for (int i = 0; i< deck.cards.length; i++) {
	    if (Card.sameCard(card, deck.cards[i])) {
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
    public static int findBisect(Deck deck, Card card, int low, int high) {
	if (high < low) return -1;

	int mid = (high + low) / 2;
	int comp = Card.compareCards(card, deck.cards[mid]);

	if (comp == 0) {
	    return mid;
	} else if (comp < 0) {
	    // card is less than deck.cards[mid]; search the first half
	    return findBisect(deck, card, low, mid-1);
	} else {
	    // card is greater; search the second half
	    return findBisect(deck, card, mid+1, high);
	}
    }

    /*
     * Chooses a random integer between low and high, including low,
     * not including high. 
     */
    public static int randInt(int low, int high) {
	return 0;
    }

    /*
     * Swaps two cards in a deck of cards.
     */
    public static void swapCards(Deck deck, int i, int j) {
        Card tempCard = deck.cards[i];
        deck.cards[i] = deck.cards[j];
        deck.cards[j] = tempCard;
    }

    /*
     * Shuffles the cards in a deck.
     */
    public static void shuffleDeck(Deck deck) {

        for (int i = 0; i < deck.cards.length; i++) {
            // chọn một số nằm giữa 1 và deck.cards.length-1 ==> randomIndex()
            int randomIndex = Chuong12Bai3.randomInt(1, deck.cards.length - 1);
            
            // // đổi chỗ lá bài thứ i và lá bài ngẫu nhiên được chọn
            swapCards(deck, i, randomIndex);
            }
    }

    /*
     * Sorts a deck from low to high.
     */
    public static void sortDeck(Deck deck) {
        for (int i = 0; i < deck.cards.length; i++) {

            for (int j = i + 1; j < deck.cards.length; j++) {
                int compareResult = Card.compareCards(deck.cards[i], deck.cards[j]);
                if (compareResult == 1) {
                    Deck.swapCards(deck, i, j);
                }
            }
        }
    }

    /*
     * Finds the index of the lowest card between low and high,
     * including both.
     */
    public static int indexLowestCard(Deck deck, int low, int high) {
        int lowestCardIndex = low;

        for (int i = low + 1; i <= high; i++) {
            if (Card.compareCards(deck.cards[lowestCardIndex], deck.cards[i]) == 1) {
                lowestCardIndex = i;
            }
        }
    
        return lowestCardIndex;
    }

    /*
     * Makes a new deck of cards with a subset of cards from the original.
     * The old deck and new deck share references to the same card objects.
     */
    public static Deck subdeck(Deck deck, int low, int high) {
	Deck sub = new Deck(high-low+1);
	
	for (int i = 0; i<sub.cards.length; i++) {
	    sub.cards[i] = deck.cards[low+i];
	}
	return sub;
    }

    /*
     * Merges two sorted decks into a new sorted deck.
     */
    public static Deck merge(Deck d1, Deck d2) {
        // tạo nên một cỗ bài đủ lớn chứa hết các quân bài
        Deck result = new Deck(d1.cards.length + d2.cards.length);

        // dùng chỉ số i để theo dõi vị trí hiện tại trên phần bài thứ nhất, 
        // và chỉ số j cho phần bài thứ hai 
        int i = 0;
        int j = 0;

        // chỉ số k duyệt theo phần bài được xếp đúng
        for (int k = 0; k < result.cards.length; k++) {
        // nếu d1 rỗng thì d2 thắng;
            if (d1.cards.length == 0) {
                result.cards[k] = d2.cards[j];
            }

        //nếu d2 rỗng, d1 thắng;
            if (d2.cards.length == 0) {
                result.cards[k] = d1.cards[i];
            }
        
        // nếu không, đi so sánh hai lá bài
        // thêm lá bài thắng vào phần bài được xếp đúng
            if (d1.cards.length != 0 && d2.cards.length != 0) {
                int compareResult = Card.compareCards(d1.cards[i], d2.cards[j]); 

                if (compareResult == -1) {
                    result.cards[k] = d1.cards[i];
                    j--;
                } else {
                    result.cards[k] = d2.cards[j];
                    i--;
                }

                //Nếu j + 1 > d2.cards.length thì các Card trong d2 đã được xếp hết vào result
                //nên ta chuyển d2.cards.length về 0
                if (j + 1 > d2.cards.length - 1) {
                    d2 = new Deck(0);
                }

                //Nếu i + 1 > d1.cards.length thì các Card trong d1 đã được xếp hết vào result
                //nên ta chuyển d1.cards.length về 0
                if (i + 1 > d1.cards.length - 1) {
                    d1 = new Deck(0);
                }   
            }

            if (i < d1.cards.length - 1) 
            {  i++;   }

            if (j < d2.cards.length - 1) 
            {  j++;   }

        }
        
        return result;
    }
	
    /*
     * Sort the Deck using merge sort.
     */
    public static Deck mergeSort(Deck deck) 
    {
        //0 < deck.cards.length - 1
        if (deck.cards.length - 1 > 0) {
            // tìm điểm giữa của cỗ bài
            int midIndex = (deck.cards.length - 1) / 2;

        // chia cỗ bài thành hai phần nhỏ
            Deck d1 = new Deck(midIndex + 1);
            int d2Length = deck.cards.length - (midIndex + 1);
            Deck d2 = new Deck(d2Length);
    
            for (int i = 0; i < midIndex + 1; i++) {
                d1.cards[i] = deck.cards[i];
                // System.out.print("d1: ");
                // Card.printCard(d1.cards[i]);
            }
            for (int j = 0; j < d2Length ; j++) {
                d2.cards[j] = deck.cards[j + midIndex + 1];
                // System.out.print("d2: ");
                // Card.printCard(d2.cards[j]);
            }        
            
        //Xếp 2 phần nhỏ bằng mergeSort??
            Deck recurse1 = mergeSort(d1);
            Deck recurse2 = mergeSort(d2);
    
        // trộn hai nửa rồi trả lại kết quả
           deck = Deck.merge(recurse1, recurse2);
        }

	return deck;
    }

    // /*
    //  * Sort the Deck using merge sort and sort deck.
    //  */
    public static Deck mergeSortWithSortDeck(Deck deck) {
        // tìm điểm giữa của cỗ bài
            int midIndex = (deck.cards.length - 1) / 2;
    
        // chia cỗ bài thành hai phần nhỏ
        Deck d1 = new Deck(midIndex + 1);
        int d2Length = deck.cards.length - (midIndex + 1);
        Deck d2 = new Deck(d2Length);

        for (int i = 0; i < midIndex + 1; i++) {
            d1.cards[i] = deck.cards[i];
            // System.out.print("d1: ");
            // Card.printCard(d1.cards[i]);
        }
        for (int j = 0; j < d2Length ; j++) {
            d2.cards[j] = deck.cards[j + midIndex + 1];
            // System.out.print("d2: ");
            // Card.printCard(d2.cards[j]);
        }        
        
        // xếp phần nhỏ bằng sortDeck
            Deck.sortDeck(d1);
            Deck.sortDeck(d2);
        // trộn hai nửa rồi trả lại kết quả
            deck = Deck.merge(d1, d2);
    
        return deck;
        }
}
