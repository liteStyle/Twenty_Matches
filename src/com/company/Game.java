package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    private String playerResponce = "";
    private boolean gameRunner = true;

    public Game() {
        gameMenu();
    }


    private void gameMenu() {
        DisplayMessage.mainMenu();
        while(gameRunner) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                playerResponce = reader.readLine();
            } catch (IOException e) {
                System.out.println("Ошибка игры. Повторите попытку.");
            }
            switch(playerResponce.toLowerCase()) {
                case("старт"):
                    new GameLogic().gameStart();
                    gameRunner = false;
                    break;
                case("правила"):
                    DisplayMessage.gameRules();
                    DisplayMessage.returnToMainManu();
                    break;
                case("автор"):
                    DisplayMessage.autors();
                    DisplayMessage.returnToMainManu();
                    break;
                case(""):
                    DisplayMessage.mainMenu();
                    break;
                case("выход"):
                    gameRunner = false;
                    break;
                default:
                    System.out.println("Не верная команда. Повторите попытку.");
                    break;
            }
        }
    }
}
