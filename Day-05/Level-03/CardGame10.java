import java.util.Arrays;

public class CardGame10 {

    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numCards = suits.length * ranks.length; // Calculate the total number of cards
        int numPlayers = 4; // Number of players
        int cardsPerPlayer = 5; // Number of cards per player

        // Initialize the deck
        String[] deck = initializeDeck(suits, ranks, numCards);

        // Shuffle the deck
        shuffleDeck(deck);

        // Distribute the cards to players
        String[][] players = distributeCards(deck, cardsPerPlayer, numPlayers);

        // Print the cards for each player
        printPlayerCards(players);
    }

    // Method to initialize the deck
    public static String[] initializeDeck(String[] suits, String[] ranks, int numCards) {
        String[] deck = new String[numCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i)); // Generate a random index
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards
    public static String[][] distributeCards(String[] deck, int cardsPerPlayer, int numPlayers) {
        if (cardsPerPlayer * numPlayers > deck.length) {
            throw new IllegalArgumentException("Not enough cards to distribute to all players.");
        }

        String[][] players = new String[numPlayers][cardsPerPlayer];
        int cardIndex = 0;

        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Method to display player cards
    public static void displayPlayerCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            System.out.println(Arrays.toString(players[i]));
        }
    }
}
