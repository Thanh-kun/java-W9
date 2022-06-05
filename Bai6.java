import java.io.File;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name file: ");
        String input = sc.nextLine();
        double score = 0;
        int i = 0;
        File file = new File(input);
        if (file.exists()) {
            Scanner output = new Scanner(file);
            while(output.hasNext()) {
                score += output.nextDouble();
                i +=1;
            }
        System.out.printf("Sum Score: %.2f\n", score);
        System.out.printf("Average Score: %.2f\n", score / i);
        }
        else {
            System.out.println("File does not exist");
        }
        
    }
}