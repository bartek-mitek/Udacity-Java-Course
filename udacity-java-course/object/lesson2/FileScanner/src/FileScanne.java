import java.io.File;
import java.util.Scanner;

public class FileScanne {


    public static void main(String[] args) throws Exception {
        File file = new File("TheArtOfBuildingAHome.txt");
        Scanner scanner = new Scanner(file);

        int words = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            words += line.split(" ").length;
        }
        System.out.println("Number of words in this book is: " + words);
    }



}
