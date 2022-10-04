import java.io.*;
import java.util.Scanner;

public class q80 {
    public static void main(String[] args) throws FileNotFoundException {
        File fileadd = new File("q80.txt");
        Scanner file = new Scanner((fileadd));
        int total_test = 0;
        double ave = 0;
        System.out.println("File name: " + fileadd.getName());
        System.out.println("Absolute path: " + fileadd.getAbsolutePath());
        System.out.println("Writeable: " + fileadd.canWrite());
        System.out.println("Readable " + fileadd.canRead());
        System.out.println("File size in bytes " + fileadd.length());
        while (file.hasNextLine()) {
            String student = file.nextLine();
            Scanner student_in = new Scanner(student);

            while (student_in.hasNext()) {
                String name = student_in.next();
                // System.out.println(name);
                while (student_in.hasNextDouble()) {
                    total_test++;
                    ave += student_in.nextDouble();
                }
                System.out.println(name + "'s average: " + Math.round(ave / total_test));
            }
        }
    }
}