package csc;
import java.util.Scanner;

public class ShortStory {
    public static void MakeShortStory(){
        int HSK;
        boolean piyin;
        boolean ET;
        System.out.println("Enter the HSK level of the story you want to read.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            HSK = Integer.parseInt(input); // convert String to int

            if (HSK >= 1 && HSK <= 6) {
                System.out.println("Loading short story...");
                GBT.input = "Please create a short story in Chinese with piyin and English Translation for HSK level " + HSK + "Please have the English translation right under the piyin. do not have anything after the story.";
                GBT.gbt();



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
