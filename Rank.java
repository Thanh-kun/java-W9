import java.io.Serializable;
import java.util.Random;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Rank implements Serializable {
    static int j = 0;
    static double sumSalaryOfAssistances = 0;
    static double sumSalaryOfTeachers = 0;
    static double sumSalaryOfAssociates = 0;
    private String firstName = "FirstName" + j;
    private String lastName = "LastName" + j;
    private String rank;
    private double salary;
    
    Random random = new Random();
    public Rank() {
        int i = random.nextInt(3);
        if (i == 0) {
            rank = "assitance";
            salary = random.nextDouble((80000 - 50000) + 1) + 50000;
            sumSalaryOfAssistances += salary;
        }
        if(i == 1) {
            rank = "teacher";
            salary = random.nextDouble((110000 - 60000) + 1) + 60000;
            sumSalaryOfTeachers += salary;
        }
        if (i == 2) {
            rank = "associate";
            salary = random.nextDouble((130000 - 75000) + 1) + 75000;
            sumSalaryOfAssociates += salary;
        }
        j += 1;
    }
    public void setSalary() {
        if(rank == "assitance") {
            salary = random.nextDouble((80000 - 50000) + 1) + 50000;
            sumSalaryOfAssistances += salary;
            }
        if(rank == "teacher") {
            salary = random.nextDouble((110000 - 60000) + 1) + 60000;
            sumSalaryOfTeachers += salary;
            }
        if(rank == "associate") {
            salary = random.nextDouble((130000 - 75000) + 1) + 75000;
            sumSalaryOfAssociates += salary;
        }
    }
    public String toString() {
        return "FirstName: " + firstName + " " + "LastName: " + lastName + " " + rank + " " + salary;
    }

//public class Bai7 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Rank[] people = new Rank[1001];
        for(int i = 0; i < 1001; i++) {
            people[i] = new Rank();
        }
        FileOutputStream fos = new FileOutputStream("Salary.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for(int i = 0; i < 1001; i++) {
            oos.writeObject(people[i]);
            oos.flush();
        }
        oos.close();
        fos.close();
        Rank[] PEOPLE = new Rank[1001];
        for(int i = 0; i < 1001; i++) {
            PEOPLE[i] = new Rank();
        }
        FileInputStream fis = new FileInputStream("Salary.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        for(int i = 0; i < 1001; i++) {
            PEOPLE[i] = (Rank)ois.readObject();
        }
        ois.close();
        fis.close();
        for(int i = 0; i < 1001; i++) {
            System.out.println(PEOPLE[i].toString());
        }
        System.out.printf("Total Salary Of Assistances: %.3f\n", sumSalaryOfAssistances);
        System.out.printf("Total Salary Of Teachers: %.3f\n", sumSalaryOfTeachers);
        System.out.printf("Total Salary Of Associates: %.3f", sumSalaryOfAssociates);
    }
}