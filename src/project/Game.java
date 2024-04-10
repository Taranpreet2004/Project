/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author Taranpreet Singh
 */

import java.util.Scanner;

public abstract class Game {

    private final String name;

    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void play();

    public abstract void declareWinner();

    // Method to prompt players for their turns
    protected void promptPlayerTurn(Player player) {
        System.out.println("It's " + player.getName() + "'s turn.");
        System.out.println("Press enter to continue...");
        new Scanner(System.in).nextLine();
    }

    // Method to prompt players to enter a rank they want to ask for
    protected int promptPlayerRank(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(player.getName() + ", enter the rank you want to ask for (1-13):");
        int rank = scanner.nextInt();
        while (rank < 1 || rank > 13) {
            System.out.println("Invalid rank! Please enter a rank between 1 and 13:");
            rank = scanner.nextInt();
        }
        return rank;
    }

    // Method to prompt players to select another player to ask for cards
    protected Player promptPlayerToAsk(Player currentPlayer, Player[] players) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(currentPlayer.getName() + ", select a player to ask:");
        for (Player player : players) {
            if (!player.equals(currentPlayer)) {
                System.out.println(player.getName());
            }
        }
        String playerName = scanner.nextLine().trim();
        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(playerName) && !player.equals(currentPlayer)) {
                return player;
            }
        }
        System.out.println("Invalid player! Please select a valid player to ask.");
        return promptPlayerToAsk(currentPlayer, players);
    }
}