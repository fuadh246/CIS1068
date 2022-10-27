import java.io.*;
import java.util.Scanner;

public class Webify {
    public static Scanner CONSOLE = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        // System.out.println("Please input the file name?");
        // String fileName = CONSOLE.nextLine();
        String fileName = "web.txt";
        File in_file = new File(fileName);
        Scanner in = new Scanner(in_file);

        String fileNameWithoutSuffix = fileName.substring(0, fileName.length() - 4);
        String Out_put_file_name = fileNameWithoutSuffix + ".html";
        PrintStream out_file = new PrintStream(new File(Out_put_file_name));

        out_file.println("</html>");
        out_file.println("</body>");
        boolean firstListLine = true;
        boolean lastIsList = false;

        while (in.hasNextLine()) {
            String line = in.nextLine();

            if (line.length() > 0) {
                char lineStartsWith = line.charAt(0);
                char lineEndstWith = line.charAt(line.length() - 1);

                if (lineStartsWith == '_' && lineEndstWith == '_') {
                    out_file.println(h1(line));
                } else if (lineStartsWith == '-') {
                    if (firstListLine == false) {
                        out_file.println("<ul>");
                    }
                    out_file.println(list(line, firstListLine));
                } else if ((lineStartsWith >= 'a' && lineStartsWith <= 'z')
                        || (lineStartsWith >= 'A' && lineStartsWith <= 'Z')) {
                    out_file.println(p(line));
                }
            }
        }
        out_file.println("</html>");
        out_file.println("</body>");

    }

    public static String h1(String line) {
        line = line.replace("_", "");
        return "<h1>" + line + "</h1>";
    }

    public static String p(String line) {
        return "<p>" + line + "</br>";
    }

    public static String list(String line, boolean startList) {
        startList = true;
        line = line.replace("-", "");
        return "<li>" + line + "</li>";
    }

}