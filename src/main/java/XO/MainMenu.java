package XO;

import XO.utils.ConsoleReader.ConsoleReader;

import java.util.Scanner;

public class MainMenu {
    private final static ConsoleReader consoleReader = ConsoleReader.getInstance();
    public void mainMenu() {
        Game2 game2 = new Game2();

        while (true) {
            System.out.println("""
                    Welcome!
                    Main menu!
                     1.XO
                     9.Wyjście""");

            int userChoiceMainMenu = consoleReader.getScanner().nextInt();
            consoleReader.getScanner().nextLine();
            switch (userChoiceMainMenu) {
                  case 1 -> game2.gameStart2();
                  case 9 -> System.exit(1);
           }
        }
    }
}
