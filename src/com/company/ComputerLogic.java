package com.company;

public class ComputerLogic {
    private static final int numberOfMatchesPerTurn = 4;

    public int computerTurn(int playerMatches) {
        return numberOfMatchesPerTurn - playerMatches;
    }
}
