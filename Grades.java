import java.util.Scanner;

// Fuad Hassan 
// Lab 3
// The course grade is a weighted average of three components: a homework grade, an exam 1 grade, and an exam 2 grade.

public class Grades_ {
    public static Scanner CONSOLE = new Scanner(System.in);

    public static void main(String[] args) {

        // collect the weight for all catagory
        System.out.println("Homework weight? ");
        int Homework_weight = CONSOLE.nextInt();

        System.out.println("Exam 1 weight? ");
        int Exam1_weight = CONSOLE.nextInt();

        int Final_weight = 100 - (Homework_weight + Exam1_weight);
        System.out.println("Using weights " + Homework_weight + " " + Exam1_weight + " " + Final_weight);

        // Homework
        System.out.println("Homework: ");

        System.out.println("Number of assignments? ");
        int Num_homework = CONSOLE.nextInt();

        System.out.println("Average Homework grade? ");
        double Homework_ave = CONSOLE.nextDouble();

        System.out.println("Number of late days used? ");
        int Num_late_homework = CONSOLE.nextInt();

        System.out.println("Labs attended? ");
        int Num_lab_att = CONSOLE.nextInt();

        // Cal. the Max point student can recive
        double Max_HW_Total = 10 * Num_homework + 4 * Num_homework;

        /*
         * Call Cal_HomeworkGrade function to cal. the Homework grade as and return the
         * grade as a double
         * 
         * @param Num_homework
         * 
         * @param Homework_ave
         * 
         * @param Num_late_homework
         * 
         * @param Num_lab_att
         * 
         * @param Max_HW_Total
         * 
         * @return double Homework_grade
         */
        double Homework_grade = Cal_HomeworkGrade(Num_homework, Homework_ave, Num_late_homework,
                Num_lab_att, Max_HW_Total);

        System.out.println("Total point: " + Homework_grade + "/" + Max_HW_Total);
        System.out.println(Homework_grade);
        System.out.println(Homework_weight);
        System.out.println(Max_HW_Total);
        double weight_Homework_grade = Homework_grade * Homework_weight / Max_HW_Total;
        System.out.printf("Weighted score = %.2f %n", weight_Homework_grade);

        // Exam 1
        System.out.println("Exam 1: ");
        System.out.println("Exam 1 Score: ");
        double Exam_1_Score = CONSOLE.nextDouble();
        System.out.println("Exam 1 Curve: ");
        double Exam_1_Curve = CONSOLE.nextDouble();

        /*
         * Call Cal_Exam_1_Grade function to cal the Cal_Exam_1_Grade grade
         * 
         * @param Exam_1_Score
         * 
         * @param Homework_ave
         * 
         * @param Exam_1_Curve
         * 
         * @param Exam1_weight
         * 
         * @return double array Exam_1_Grade and Exam_1_Weighted score
         */
        double[] Exam_1_Grade = Cal_Exam_1_Grade(Exam_1_Score, Exam_1_Curve, Exam1_weight);
        System.out.println("Exam 1 Total Point: " + Exam_1_Grade[0] + " /100 ");
        System.out.println("Exam 1 Weighted score: " + Exam_1_Grade[1]);

        // Final
        System.out.println("Final : ");
        System.out.println("Final Score: ");
        double Final_Score = CONSOLE.nextDouble();
        System.out.println("Final Curve: ");
        double Final_Curve = CONSOLE.nextDouble();
        /*
         * Call cal the Homework grade as and return the grade as a double
         * 
         * @param Final_Score
         * 
         * @param Final_Curve
         * 
         * @param Final_weight
         * 
         * @return double array Exam_1_Grade and Exam_1_Weighted score
         */
        double[] Final_Grade = Cal_Exam_1_Grade(Final_Score, Final_Curve, Final_weight);
        System.out.println("Final Total Point: " + Final_Grade[0] + " /100 ");
        System.out.println("Final Weighted score: " + Final_Grade[1]);

        double Course_grade = weight_Homework_grade + Exam_1_Grade[1] + Final_Grade[1];
        System.out.printf("Course_grade: %.2f%n", Course_grade);

    }

    /*
     * @function: Cal_HomeworkGrade
     * Takes some values as a parameter and return the homework grade a student has
     * recived
     */
    public static double Cal_HomeworkGrade(int Num_homework, double Homework_ave,
            int Num_late_homework, int Num_lab_att, double Max_HW_Total) {
        double HW_Total = 0;

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

    /*
     * @function: Cal_Exam_1_Grade
     * Takes some values as a parameter and return an array that contains the
     * Exam1_weight and Curved_score
     */
    public static double[] Cal_Exam_1_Grade(double Exam_1_Score, double Exam_1_Curve, int Exam1_weight) {
        double Exam_1_Total = 0;

        if (Exam_1_Score <= 0) {
            Exam_1_Score = 0;
        } else if (Exam_1_Score > 100) {
            Exam_1_Score = 100;
        }
        double Curved_score = Exam_1_Curve + Exam_1_Score;

        if (Curved_score <= 0) {
            Curved_score = 0;
        } else if (Curved_score > 100) {
            Curved_score = 100;
        }

        Exam_1_Total = Exam1_weight * Curved_score / 100;
        double[] Exam_1_data = new double[] { Curved_score, Exam_1_Total };
        return Exam_1_data;
    }

    /*
     * @function: Cal_Final_Grade
     * Takes some values as a parameter and return an array that contains the
     * Final_weight and Curved_score
     */
    public static double[] Cal_Final_Grade(double Final_Score, double Final_Curve, int Final_weight) {
        double Final_Total = 0;

        if (Final_Score <= 0) {
            Final_Score = 0;
        } else if (Final_Score > 100) {
            Final_Score = 100;
        }

        double Curved_score = Final_Curve + Final_Score;

        if (Curved_score <= 0) {
            Curved_score = 0;
        } else if (Curved_score > 100) {
            Curved_score = 100;
        }

        Final_Total = Final_weight * Curved_score / 100;
        double[] Final_data = new double[] { Curved_score, Final_Total };
        return Final_data;
    }

}