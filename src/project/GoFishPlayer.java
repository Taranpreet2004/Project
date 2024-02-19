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

public abstract class GoFishPlayer extends Player {

    private final ArrayList<Card> hand; // The player's hand of cards
    private final ArrayList<Card> book; // The player's collected books of cards
    private int score; // The player's score

    public GoFishPlayer(String name) {
        super(name); // Call the constructor of the superclass (Player) with the provided name
        this.hand = new ArrayList<>(); // Initialize the hand as an empty ArrayList
        this.book = new ArrayList<>(); // Initialize the book as an empty ArrayList
        this.score = 0; // Initialize the score to 0
    }

    // Method to add a card to the player's hand
    public void draw(Card card) {
        hand.add(card);
    }

    // Method to remove a card from the player's hand
    public void discard(Card card) {
        hand.remove(card);
    }

    // Method to add a card to the player's collected books
    public void addBook(Card card) {
        book.add(card);
        score++; // Increment the score when a book is added
    }

    // Method to check if the player has won the game (by collecting all 13 books)
    @Override
    public boolean hasWon() {
        return getScore() == 13;
    }

    // Method to get the player's current score
    @Override
    public int getScore() {
        return score;
    }

    // Method to get all cards of a specific rank from the player's hand
    public ArrayList<Card> getRank(int rank) {
        ArrayList<Card> cards = new ArrayList<>();
        for (Card card : hand) {
            if (card.getRank() != null && rank == card.getRank().getValue()) {
                cards.add(card);
            } else {
            }
        }
        return cards;
    }

    // Method to check if the player has any cards of a specific rank in their hand
    public boolean hasRank(int rank) {
        for (Card card : hand) {
            if (card.getRank() != null && card.getRank().getValue() == rank) {
                return true;
            }
        }
        return false;
    }

    // Method to get a copy of the player's current hand (to prevent direct manipulation)
    public ArrayList<Card> getHand() {
        return new ArrayList<>(hand);
    }
    
    public class GoFishGame extends Game {
    private final GoFishPlayer player1;
    private final GoFishPlayer player2;
    private final GroupOfCards groupOfCards;

    public GoFishGame(String name, GoFishPlayer player1, GoFishPlayer player2, GroupOfCards groupOfCards) {
        super(name);
        this.player1 = player1;
        this.player2 = player2;
        this.groupOfCards = groupOfCards;
    }

    @Override
    public void play() {
        // Implement the game logic for Go Fish
    }

    @Override
    public void declareWinner() {
        // Implement the method to declare the winner of the game
    }
}

    void declareWinner() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void play() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
