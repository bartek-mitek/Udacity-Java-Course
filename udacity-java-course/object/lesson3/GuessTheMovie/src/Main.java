import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        File file = new File("moviesList.txt");
        Scanner scanner = new Scanner(file);

        int titles = 0;
        String[] wholeMovies = new String[25];
        while (scanner.hasNextLine()) {
            String title = scanner.nextLine();
            wholeMovies[titles] = title;
            titles++;
        }
        int random = (int) (Math.random() * wholeMovies.length) + 1;

        String randomMovie = wholeMovies[random - 1];
        System.out.println(randomMovie);

        Game game = new Game();
        game.Start(randomMovie);


    }


}
