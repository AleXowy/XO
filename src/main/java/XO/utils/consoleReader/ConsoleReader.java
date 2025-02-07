package XO.utils.consoleReader;

import java.util.Scanner;

public class ConsoleReader {

    private Scanner scanner = new Scanner(System.in);

   private static volatile ConsoleReader instance;

    private ConsoleReader() {
    }

    public static ConsoleReader getInstance() {
        if (instance == null) {
            synchronized (ConsoleReader.class) {
                if (instance == null) {
                    instance = new ConsoleReader();
                }
            }
        }
        return instance;
    }

    public Scanner getScanner() {
        return scanner;
    }
}