/**
 * Chuong10Bai1
 */
class Chuong11Bai1 {

    public static void main(String[] args) {
        Tile.testTile();
    }
}

 class Tile {
        char letter;
        int value;
    
        public Tile(char letter, int value) {
            this.letter = letter;
            this.value = value;
        }
    
        public void printTile(Tile tile) {
            System.out.println("letter: " + tile.letter + "\n" + "value: "+ tile.value);
        }

        public static void testTile() {
            Tile tile1 = new Tile('z', 10);
            tile1.printTile(tile1);
        }
    }
