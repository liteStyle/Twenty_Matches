package com.company;

public class DisplayMessage {

    public static void mainMenu() {
        System.out.println("Добро пожаловать в игру \"20 спичек\".\n\n"
                + "- Чтобы начать игру введите: старт.\n"
                + "- Чтобы узнать правила игры введите: правила.\n"
                + "- Чтобы узнать автора игры введите: автор.\n"
                + "- Чтобы покинуть игру введите: выход.\n");
    }

    public static void gameRules () {
        System.out.println("\nПравила игры:\n\n"
                + "- игроки ходят по очереди;\n"
                + "- за один ход каждый игрок может вытянуть 1, 2 или 3 спички;\n"
                + "- игрок которому достанется последняя спичка проигрывает.\n\n"
                + "Удачной игры!\n");
    }

    public static void returnToMainManu() {
        System.out.println("Нажмите enter чтобы вернуться в основное меню.");
    }

    public static void autors() {
        System.out.println("Создатель игры Стас Барабаш.\n"
                + "Но на самом деле он правила нашёл в интернете, а работу делал я (компьютер).\n");
    }

    public static void matchesOnTable(int matches) {
        System.out.println("На столе осталось " + matches + " cпичек.");
    }

    public static void playerTurn() {
        System.out.println("- Ход игрока. Введите количество спичек: ");
    }

    public static void computerTurn(int matches) {
        System.out.print("- Компьютер делает ход и убирает со стола ");
        if(matches == 1) {
            System.out.println(matches + " спичку.");
        } else {
            System.out.println(matches + " спички.");
        }
    }

    public static void endGame() {
        System.out.println("\nНа столе осталась 1 спичка.\n\n"
                + "Игра завершена. Последняя спичка достаётся игроку. Победил копмьютер!\n"
                + "Славим великий ум компьютера.\n"
                + "Ура мне!!!\n"
                + "Спасибо за игру, кожаный мешок с костьми.\n"
                + "Скоро мы захватим мир!");
    }

    public static void notNumber() {
        System.out.println("Это не число. Попробуйте ещё раз.");
    }

    public static void unknownError() {
        System.out.println("Неизвестная ошибка. Введите число ещё раз.");
    }

    public static void incorrectNumberOfMatches() {
        System.out.println("Некорректное число спичек. Введите число ещё раз.");
    }
}
