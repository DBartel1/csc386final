package csc;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;


public class Storage {
    static String filePath = ("C:\\Users\\Dylan\\IdeaProjects\\cscfinal\\CardFiles.txt");
    public static void storagefile(){

        try {
            File myObj = new File("CardFiles.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("Loaded Previous Data!");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
