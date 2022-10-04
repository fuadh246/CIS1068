import java.io.*;
import java.util.Scanner;

public class Webify {
    public static void main(String[] args) throws FileNotFoundException {
        File in_file = new File("web.txt");
        Scanner in = new Scanner(in_file);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(h1(line));
        }

    }

    public static String h1(String line) {
        line = line.replace("_", "");
        return "<h1>" + line + "</h1>";
    }

}