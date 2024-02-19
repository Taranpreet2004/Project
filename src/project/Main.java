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
import project.Game;
import project.GoFishPlayer;
import project.GoFishPlayer.GoFishGame;
import project.GroupOfCards;
import project.Player.Card;

public class Main {

    public static void main(String[] args) {
        // Create players
        GoFishPlayer player1 = new GoFishPlayerImpl("Player 1");
        GoFishPlayer player2 = new GoFishPlayerImpl("Player 2");

        // Create group of cards
        ArrayList<Card> cards = new ArrayList<>();
        GroupOfCards groupOfCards = new GroupOfCards(cards);

        // Create game
        Game game = new GoFishGame("Go Fish", player1, player2, groupOfCards);

        // Play game
        game.play();

        // Declare winner
        game.declareWinner();
    }

    static class GoFishPlayerImpl extends GoFishPlayer {
        public GoFishPlayerImpl(String name) {
            super(name);
        }

        @Override
        public void turn(Scanner scanner, Deck deck, ArrayList<GoFishPlayer> players) {
            // Implement the turn logic for the Go Fish game
        }

        @Override
        public boolean hasWon() {
            // Implement the winning condition for the Go Fish game
            return false;
        }

        @Override
        public int getScore() {
            // Implement the scoring mechanism for the Go Fish game
            return 0;
        }
    }
}


    