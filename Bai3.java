import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Random;
public class Bai3 {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        FileOutputStream output = new FileOutputStream("Ex3.dat");
        for (int i = 0; i < 150; i++) {
        output.write(rand.nextInt(150));
        }
        FileInputStream file = new FileInputStream("Ex3.dat");
        int value = 0;
        while((value = file.read()) != -1) {
            System.out.println(j + ": " + value +" ");
        }
    }
}