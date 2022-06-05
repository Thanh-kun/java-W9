import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.io.IOException;
class Bai5 implements Serializable{
    int[] arr = {1,2,3,4,5};
    Date date = new Date();
    double a = 5.5;
    public static void main(String[] args) throws IOException {
        ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("Ex5.dat"));
        Bai5 bai5 = new Bai5();
        file.writeObject(bai5);
        file.close();
    }
}