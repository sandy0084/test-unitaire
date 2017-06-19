package main;

import java.util.Scanner;

/**
 * @author NOaN
 *
 */
public class Launcher {

    /**
     * Main entry point
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Game.menu(scanner);
        
        scanner.close();
    }
}