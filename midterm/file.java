import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text.txt");
        File Grade_file = new File("grades.txt");

        System.out.println("number_of_characters: " + number_of_characters(file));
        System.out.println("number_of_word: " + number_of_word(file));
        System.out.println("longest_word_found: " + longest_word_found(file));
        System.out.println(Grade(Grade_file));
        System.out.println(blank_lines_contained(file));

    }

    public static double Grade(File file) throws FileNotFoundException {
        Scanner in = new Scanner(file);
        while (in.hasNextLine()) {
            System.out.println(ave(in.nextLine()));
        }
        return 0;
    }

    public static String ave(String s) {
        double total = 0;
        int num_of_grade = 0;
        Scanner in = new Scanner(s);
        String name = in.next();
        while (in.hasNextInt()) {
            total += in.nextInt();
            num_of_grade++;
        }
        return name + "\'s average is " + total / num_of_grade;
    }

    public static int number_of_characters(File file) throws FileNotFoundException {
        Scanner in = new Scanner(file);
        int count = 0;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            count += line.length();
        }
        return count;
    }

    public static int number_of_word(File file) throws FileNotFoundException {
        Scanner in = new Scanner(file);
        int count = 0;
        while (in.hasNext()) {
            String line = in.next();
            count++;
        }
        return count;
    }

    public static int longest_word_found(File file) throws FileNotFoundException {
        Scanner in = new Scanner(file);
        int count = 0;
        while (in.hasNext()) {
            String word = in.next();
            if (word.length() >= count) {
                count = word.length();
            }

        }
        return count;
    }

    public static int blank_lines_contained(File file) throws FileNotFoundException {
        Scanner in = new Scanner(file);
        int count = 0;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            if (line == "") {
                count++;
            }

        }
        return count;
    }
}