package csc;

import java.util.*;


public class SentenceTranslation {

    public static void MakeSentenceTranslation(){
        int HSK;
        System.out.println("Enter the HSK level of the sentence you want to translate.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            HSK = Integer.parseInt(input); // convert String to int

            if (HSK >= 1 && HSK <= 6) {
                System.out.println("Loading sentence...");
                GBT.input = "Please give me a RANDOM sentence in Chinese for HSK level " + HSK + "Do not give me the translation yet.";
                GBT.gbt();
                System.out.println("Enter any letter to receive the translation of the sentence.");
                Scanner scanner2 = new Scanner(System.in);
                String temp = scanner.nextLine();
                GBT.input = "Translate" + GBT.t;
                GBT.gbt();
                System.out.println("\n\nEnter a character to return to the menu.");
                String t = scanner.nextLine();
                Main.menu();


            } else if( input == String.valueOf("e")){
                //back to main menu
            }
            else{
                System.out.println("Please enter a valid HSK level (1-6). Or Press E to quit.");

            }
        } catch (NumberFormatException e) {
            System.out.println("Please input a valid HSK level (1-6)");
        }



    }
}
