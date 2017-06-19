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
        AsciiPrinter printer = new AsciiPrinter();
        
        while (true) {
            System.out.println("Sélectionnez un template ASCII : ");
            System.out.println("(1) - Small Template");
            System.out.println("(2) - Big Template");
            System.out.println("(3) - Exit");

            System.out.print("Entrez votre sélection : ");
            int selection = scanner.nextInt();
            scanner.nextLine();

            if (selection == 1) {
                System.out.print("Entrez votre texte : ");
                String sentenceB = scanner.nextLine();

                
                System.out.println("Phrase en ASCII :");
                
                printer.print(sentenceB, 1);
            }
            else if (selection == 2) {
                System.out.print("Entrez votre texte : ");
                String sentenceS = scanner.nextLine();

                System.out.println("Phrase en ASCII :");
                
                printer.print(sentenceS, 2);
            }
            else if (selection == 3) {
                break;
            }
        }
    }
    
}