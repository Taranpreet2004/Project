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
import java.util.Collections;

public class GroupOfCards {

    private final ArrayList<Card> cards;

    public GroupOfCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getSize() {
        return cards.size();
    }

    // Method to shuffle the cards in the group
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Method to deal a specific number of cards from the group
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

    @Override
    public String toString() {
        return cards.toString();
    }
}