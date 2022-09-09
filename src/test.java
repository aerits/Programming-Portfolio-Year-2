import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class test {
    public static void main (String...args ) {
        try{
         File files = new File("src/wlist_match1.txt");
        int c=0;
            Scanner scanner = new Scanner(files);
            while (scanner.hasNextLine()) {
                String l = scanner.nextLine();
                c++;
        Random random = new Random();
        int r = random.nextInt(c);
        System.out.println(l);
      }
       }catch (FileNotFoundException e) {
         System.out.println("error, please insert the valid files");
       }
    }
}