import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int counter=0; boolean flag;

        List<String> words= new ArrayList<>(); // the word that will be selected
        List<Character> guess= new ArrayList<>(); // Player's guesses

        words.add("development"); words.add("registration"); words.add("pineapple");
        words.add("watermelon"); words.add("tumbling"); words.add("california");
        words.add("lebowski"); words.add("bombtrack"); words.add("scottpilgrim");

        String random_word=words.get((int) (Math.random()*4));// choosing a word randomly


        while(true){
            flag= true;
            System.out.print("guess a letter in the random word: ");
            char c= input.next().charAt(0);
            for(int j=0; j<random_word.length(); j++) {
                if(random_word.charAt(j) == c) { // checks if the letter in the random word
                    guess.add(c);
                    flag= false;
                    break;
                }
            }
            if(flag)
                counter++;

            display(counter); // displaying the hangman

            if(displayWord(guess, random_word)){ // if win
                System.out.println("you guessed it! （づ￣3￣）づ╭❤️～");
                break;
            }

            if(counter == 6){ // if lose
                System.out.println("you lost (╯‵□′)╯︵┻━┻ \nthe word was "+random_word);
                break;
            }
            }


        }

    public static void display(int counter){
        switch (counter) {
            case 1:
                System.out.println("\t\t\t\t\t\t O ");
                break;
            case 2:
                System.out.println("\t\t\t\t\t\t O ");
                System.out.println("\t\t\t\t\t\t | ");
                break;
            case 3:
                System.out.println("\t\t\t\t\t\t O ");
                System.out.println("\t\t\t\t\t\t\\| ");
                break;
            case 4:
                System.out.println("\t\t\t\t\t\t O ");
                System.out.println("\t\t\t\t\t\t\\|/");
                break;
            case 5:
                System.out.println("\t\t\t\t\t\t O ");
                System.out.println("\t\t\t\t\t\t\\|/");
                System.out.println("\t\t\t\t\t\t | ");
                break;
            case 6:
                System.out.println("\t\t\t\t\t\t O ");
                System.out.println("\t\t\t\t\t\t\\|/");
                System.out.println("\t\t\t\t\t\t | ");
                System.out.println("\t\t\t\t\t\t/ \\");
                break;
        }

    }

    public static boolean displayWord(List<Character> guess, String random_word){
        int numLetters =0;
        for(int j=0; j<random_word.length(); j++){
            if(guess.contains(random_word.charAt(j))) {
                System.out.print(random_word.charAt(j));
                numLetters++;
            }
            else
                System.out.print("_");
        }
        System.out.println();
        return (numLetters == random_word.length());
    }
}