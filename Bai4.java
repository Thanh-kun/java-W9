import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
public class Bai4 {
    public static void main(String[] args) throws Exception {
        double average = 0;
        try(
            DataOutputStream output = new DataOutputStream(new FileOutputStream("Ex4.dat"));
        ) {
            for (int i = 0; i < 100; i++) {
                output.writeDouble(i);
            }
        }
        try(
            DataInputStream input = new DataInputStream(new FileInputStream("Ex4.dat"));
        )  {
            for (int i = 0; i < 100; i++) {
                average += input.readDouble();
        }
        System.out.println("Average: " + average / 100);
        }
    }
}