package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameLogic {
    private int matches = 20;
    private int playerNumberOfMatches = 0;
    private int computerNumberOfMatches = 0;

    public void takeMatches(int userMatches) {
        if(userMatches == 1) {
            this.matches -= 1;
        } else {
            if(userMatches == 2) {
                this.matches -= 2;
            } else {
                this.matches -= 3;
            }
        }
    }

    public void gameStart() {
        DisplayMessage.matchesOnTable(20);
        DisplayMessage.computerTurn(3);
        takeMatches(3);

        while(matches > 1) {
            DisplayMessage.matchesOnTable(matches);
            DisplayMessage.playerTurn();
            try {
                playerTurn();
            } catch (NumberFormatException e) {
                DisplayMessage.notNumber();
                continue;
            } catch (IOException e) {
                DisplayMessage.unknownError();
                continue;
            }

            if(!numberInspect(playerNumberOfMatches)) {
                continue;
            }

            takeMatches(playerNumberOfMatches);
            computerNumberOfMatches = new ComputerLogic().computerTurn(playerNumberOfMatches);
            takeMatches(computerNumberOfMatches);
            DisplayMessage.computerTurn(computerNumberOfMatches);
        }

        DisplayMessage.endGame();

    }

    private int playerTurn() throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        playerNumberOfMatches = Integer.parseInt(reader.readLine());
        return playerNumberOfMatches;
    }

    private boolean numberInspect(int numberOfMatches) {

        if(numberOfMatches < 1 || numberOfMatches > 3 || (matches - numberOfMatches) < 1) {
            DisplayMessage.incorrectNumberOfMatches();
            return false;
        }
        return true;
    }
}
