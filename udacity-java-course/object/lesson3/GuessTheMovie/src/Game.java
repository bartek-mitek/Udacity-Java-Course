import java.util.Scanner;
import java.util.regex.Pattern;

public class Game {


    public void Start(String randomMovie) {

        int guessesLeft = 10;

        String hidden = randomMovie.replaceAll("[a-z]", "_");
//        String hidden = new String(new char[randomMovie.length()]).replace('\0', '_');
        System.out.println("Your movie to guess is below.");
        System.out.println(hidden);

        System.out.println("Type your letter: ");

        Scanner scanner = new Scanner(System.in);

//        char[] everyLetter = new char[randomMovie.length()];
//        char currentGuess = letter.charAt(0);


        for (int j = 0; j < guessesLeft; ) {
            String guess = scanner.nextLine();
            if ((randomMovie.indexOf(guess) < randomMovie.length()) && randomMovie.indexOf(guess) != -1) {

                char[] hiddenChars = hidden.toCharArray();
                char guessChar = guess.charAt(0);
                for (int i = 0; i < randomMovie.length(); i++) {
                    int index = randomMovie.indexOf(guess, i);
                    if (index < 0) {
                        break;
                    }
                    hiddenChars[index] = guessChar;

                }
                hidden = String.valueOf(hiddenChars);
                if (!hidden.contains("_")) {
                    System.out.println("YOU WON!!!");
                    break;
                } else {
                    System.out.println(hidden);
                    System.out.println("Guess another!");
                }
            } else {
                guessesLeft--;
                System.out.println("There is no " + guess + " letter. Try again!");
                System.out.println("You have " + guessesLeft + " left.");
                System.out.println(hidden);
                if (guessesLeft == 0) {
                    System.out.println("You lose!!!");
                } else {
                    System.out.println("Try again!");
                }
            }

        }

    }


}
