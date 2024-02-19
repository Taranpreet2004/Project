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

public abstract class Player {

    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void turn(Scanner scanner, Deck deck, ArrayList<GoFishPlayer> players);

    public abstract boolean hasWon();

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
            for (Rank rank : Rank.values()) {
                for (Suit suit : Suit.values()) {
                    cards.add(new Card(rank, suit));
                }
            }
        }

        // Add methods to manipulate the deck as needed
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
    }

    // Define the Rank and Suit enums
    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

        {
            // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        {
            // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        {
            // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        int getValue() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }
}

