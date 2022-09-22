
import java.util.Scanner;

public class Grades {
    public static Scanner CONSOLE = new Scanner(System.in);
    public static int Homework_weight = 0;
    public static int Exam1_weight = 0;
    public static int Final_weight = 0;
    public static double weightedHomeworkScore = 0;
    public static double Max_HW_Total = 0;
    public static double HW_Total = 0;

    public static void main(String[] arg) {
        getWeight();
        System.out.println("Using weights " + Homework_weight + " " + Exam1_weight + " " + Final_weight);
        System.out.println("Homework: ");
        double Homework_grade = Cal_weightedHomeworkScore();
        System.out.println("Total point: " + Homework_grade + "/" + Max_HW_Total);
    }

    public static void getWeight() {
        System.out.println("Homework weight?");
        Homework_weight = CONSOLE.nextInt();
        System.out.println("Exam 1 weight?");
        Exam1_weight = CONSOLE.nextInt();
        Final_weight = 100 - (Homework_weight + Exam1_weight);
    }

    public static double Cal_weightedHomeworkScore() {
        System.out.println("Number of assignments?");
        int Num_homework = CONSOLE.nextInt();

        System.out.println("Average Homework grade?");
        double Homework_ave = CONSOLE.nextDouble();

        System.out.println("Number of late days used?");
        int Num_late_homework = CONSOLE.nextInt();

        System.out.println("Labs attended?");
        int Num_lab_att = CONSOLE.nextInt();

        Max_HW_Total = 10 * Num_homework + 4 * Num_homework;

        HW_Total = Num_homework * Homework_ave + 4 * Num_lab_att;

        if (Homework_ave < 0) {
            Homework_ave = 0;
        } else if (Homework_ave > 10) {
            Homework_ave = 10;
        }

        if (Num_homework / 2 < Num_late_homework) {
            HW_Total -= (HW_Total * .10);
        } else if (Num_late_homework == 0) {
            HW_Total += 5;
        } else if (Num_late_homework <= 0) {
            Num_lab_att = 0;
        }
        if (HW_Total > Max_HW_Total) {
            HW_Total = Max_HW_Total;
        }

        return HW_Total;

    }
}