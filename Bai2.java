import java.io.File;
import java.io.PrintWriter;
import java.util.Random;
public class Bai2 {
    public static void main(String[] args) throws Exception{
        File file = new File("Ex2.txt");
        if(file.exists()) {
            Random r = new Random();
            PrintWriter output = new PrintWriter(file);
            for (int i = 0; i < 150; i++) {
                output.print(r.nextInt(150));
                output.print(" ");
            }
            output.close();
        }
        else {
            PrintWriter out = new PrintWriter(file);
        }
    }
}