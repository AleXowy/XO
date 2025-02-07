package XO;

import XO.utils.consoleReader.ConsoleReader;

public class MainMenu {
    //todo replace all int variable by strings of numbers value,
    // to avoid scanner buffer errors, or getting into exceptions
    // or replace it by a constant


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
