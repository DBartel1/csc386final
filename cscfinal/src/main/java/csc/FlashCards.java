package csc;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class FlashCards{

    public static void runFlashCards(){
        List<Flashcard> flashcards = new ArrayList<>();


        try (BufferedReader br = Files.newBufferedReader(Paths.get(Storage.filePath))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 4) {
                    flashcards.add(new Flashcard(parts[0], parts[1], parts[2], parts[3]));
                }
            }
        } catch (IOException e) {
            System.out.println("Failed to read file: " + e.getMessage());
            return;
        }

        Random random = new Random();
        System.out.println("Press e to quit.");
        Flashcard selected = flashcards.get(random.nextInt(flashcards.size()));
        System.out.println("Chinese Character: " + selected.chinese + "\nPiyin:" + selected.pinyin);

        // Ask for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Translation: ");
        String userGuess = scanner.nextLine().trim().toLowerCase();

        // Check the answer
        if (userGuess.equals(selected.english.toLowerCase())) {
            System.out.println("Correct!");
            runFlashCards();
        } else if (userGuess.equals("e")){
        }
        else {
            System.out.println("Wrong. The correct answer is: " + selected.english);
            runFlashCards();
        }
    }

    }














    class Flashcard {
        String id;
        String chinese;
        String pinyin;
        String english;

        Flashcard(String id, String chinese, String pinyin, String english) {
            this.id = id;
            this.chinese = chinese;
            this.pinyin = pinyin;
            this.english = english;
        }
    }
























