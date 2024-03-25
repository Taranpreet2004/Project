/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author Taranpreet Singh
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public abstract class Player {

    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method for player's turn
    public abstract void turn(Player[] players, Deck deck);

    // Abstract method to check if the player has won
    public abstract boolean hasWon();

    // Abstract method to get the player's current score
    public abstract int getScore();

    // Nested Deck class
    public static class Deck {

        private final ArrayList<Card> cards;

        public Deck() {
            this.cards = new ArrayList<>();
            // Initialize the deck with cards
            initializeDeck();
        }

        // Method to initialize the deck with cards
        private void initializeDeck() {
            // Loop through ranks and suits to create cards
            for (Card.Rank rank : Card.Rank.values()) {
                for (Card.Suit suit : Card.Suit.values()) {
                    cards.add(new Card(rank, suit));
                }
            }
        }

        // Method to shuffle the deck
        public void shuffle() {
            Collections.shuffle(cards);
        }

        // Method to deal a specific number of cards from the deck
        public ArrayList<Card> deal(int numCards) {
            ArrayList<Card> dealtCards = new ArrayList<>();
            for (int i = 0; i < numCards; i++) {
                if (!cards.isEmpty()) {
                    dealtCards.add(cards.remove(0));
                } else {
                    break; // Stop dealing if there are no more cards
                }
            }
            return dealtCards;
        }
    }

    // Define the Card class
    public static class Card {

        private final Rank rank;
        private final Suit suit;

        public Card(Rank rank, Suit suit) {
            this.rank = rank;
            this.suit = suit;
        }

        // Getter methods for rank and suit
        public Rank getRank() {
            return rank;
        }

        public Suit getSuit() {
            return suit;
        }

        @Override
        public String toString() {
            return rank + " of " + suit;
        }

        // Enum for card ranks
        public enum Rank {
            ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

            @Override
            public String toString() {
                return name().charAt(0) + name().substring(1).toLowerCase();
            }
        }

        // Enum for card suits
        public enum Suit {
            HEARTS, DIAMONDS, CLUBS, SPADES;

            @Override
            public String toString() {
                return name().toLowerCase();
            }
        }
    }
}
