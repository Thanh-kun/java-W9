import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
public class Bai1 {
    private File file = new File("bai1.txt");
     
    public void countCharacters() throws Exception {
        FileReader input = new FileReader(file);
        int i = 0;
        while (input.read() > -1) {
            i += 1;
        }
        input.close();
        System.out.println("The number of characters: " + i + ".");
    }
    public void countWords() throws Exception{
        Scanner input = new Scanner(file);
        int i = 0;
        while (input.hasNext()) {
            input.next();
            i += 1;
        }
        input.close();
        System.out.println("The number of words: " + i + ".");
    }
    public void countLine() throws Exception {
        Scanner input = new Scanner(file);
        int i = 0;
        while (input.hasNext()) {
            input.nextLine();
            i += 1;
        }
        input.close();
        System.out.println("The number of lines: " + i + ".");
    }
    public static void main(String[] args) throws Exception {
       Bai1 file1 = new Bai1();
       file1.countCharacters();
       file1.countWords();
       file1.countLine();
        
    }
}