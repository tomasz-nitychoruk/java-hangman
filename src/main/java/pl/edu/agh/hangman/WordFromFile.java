package pl.edu.agh.hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class WordFromFile {

        public static void main(String[] args) {

            Random random = new Random();
            int number = random.nextInt(1600);
//String wordToSolve;

            try {
                String wordToSolve;
                File word = new File("slowa.txt");
                Scanner scanner = new Scanner(word);
                for (int i =0; i >= number; i++) {
                    wordToSolve = scanner.nextLine();
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
