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

			menu(scanner);
			
            scanner.close();
    }

    
    private static void menu(Scanner scanner){
        while (true) {
            System.out.println("Sélectionnez un template ASCII : ");
            System.out.println("(1) - Big Template");
            System.out.println("(2) - Small Template");

            System.out.print("Entrez votre sélection : ");
            int selection = scanner.nextInt();

            if (selection == 1) {
                System.out.print("Entrez votre texte : ");
                String sentenceB = scanner.nextLine();

                scanner.next();
                System.out.println("Votre texte : " + sentenceB);
                
                scanner.next();
                String responseB = scanner.nextLine();
                System.out.println("Phrase en ASCII : " + responseB);
            }
            else if (selection == 2) {
                System.out.print("Entrez votre texte : ");
                String sentenceS = scanner.nextLine();

                scanner.next();
                System.out.println("Votre texte : " + sentenceS);
                
                scanner.next();
                String responseS = scanner.nextLine();
                System.out.println("Phrase en ASCII : " + responseS);
            }
        }
    }
    
}