package csc;

import java.io.*;
import java.util.Scanner;


public final class Main {



    public static void main(String[] args) throws IOException {
        Storage.storagefile();
        menu();

    }
    public static void menu(){
    System.out.println("Welcome. Please select what you would like to study. \n 1. Flashcards \n 2. Short Stories. \n 3. Sentence Translation \n 4. Dictionary.");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        switch(number){
            case 1:
            FlashCards.runFlashCards();
            break;

            case 2:
            ShortStory.MakeShortStory();
            break;

            case 3:
            //sentence
            case 4:
                Dictionary.searchDictionary();
        }






    }
}

