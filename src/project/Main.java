/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author Taranpreet Singh.
 */

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        // Create players
        GoFishPlayer player1 = new GoFishPlayerImpl("Player 1");
        GoFishPlayer player2 = new GoFishPlayerImpl("Player 2");

        // Create group of cards
        ArrayList<Card> cards = new ArrayList<>();
        GroupOfCards groupOfCards = new GroupOfCards(cards);

        // Create game
        Game game = new Game("Go Fish", player1, player2, groupOfCards);

        // Play game
        game.play();

        // Declare winner
        game.declareWinner();
    }

    static class GoFishPlayerImpl extends GoFishPlayer {
        public GoFishPlayerImpl(String name) {
            super(name);
        }

        // Implement overridden methods if needed
    }
}
