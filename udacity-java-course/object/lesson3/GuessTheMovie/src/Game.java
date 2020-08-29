import java.util.Scanner;
import java.util.regex.Pattern;

public class Game {


    public void Start(String randomMovie) {

        String hidden = new String(new char[randomMovie.length()]).replace('\0', '_');
        System.out.println("Your movie to guess is below.");
        System.out.println(hidden);

        Scanner scanner = new Scanner(System.in);

//        char[] everyLetter = new char[randomMovie.length()];
//        char currentGuess = letter.charAt(0);


        String guess = scanner.nextLine();

        if (randomMovie.indexOf(guess) < randomMovie.length() && randomMovie.indexOf(guess) != -1) {
            char[] hiddenChars = hidden.toCharArray();
            char guessChar = guess.charAt(0);
            hiddenChars[randomMovie.indexOf(guess)] = guessChar;
            hidden = String.valueOf(hiddenChars);

            System.out.println(hidden);
            System.out.println("Guess another!");
        } else {
            System.out.println("There is no " + guess + " letter. Try again!");
            System.out.println(hidden);
            System.out.println("Guess another!");
        }


    }


}
