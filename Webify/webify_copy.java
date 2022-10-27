import java.util.Scanner;
import java.io.*;

public class webify_copy {
    public static Scanner Console = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        // System.out.println("Please input file Name");
        // String fileName = Console.nextLine();
        String fileName = "web.txt";
        File inFile = new File(fileName);
        Scanner in = new Scanner(inFile);
        String fileNameWithoutSuffix = fileName.substring(0, fileName.length() - 4);
        String outputfilename = fileNameWithoutSuffix + ".html";
        PrintStream out_file = new PrintStream(new File(outputfilename));
        out_file.println("<html>");
        out_file.println("<body>");
        String Header = "_";
        String StartList = "-";
        boolean start_List = true;
        boolean last_List = false;
        while (in.hasNextLine()) {
            String line = in.nextLine();

            if (line.length() == 0) {
                out_file.println("<p>");
            } else {
                if (line.startsWith(Header)) {
                    out_file.println("<h1>" + line.substring(1, line.length() - 1) + "<h1>");
                } else if (line.startsWith(StartList)) {
                    if (start_List == true) {
                        out_file.println("<ul>");
                        start_List = false;
                    }

                    out_file.println("<li>" + line.substring(1, line.length() - 1) + "</li>");
                } else {
                    out_file.println(line + "<br>");
                }

            }

        }
        out_file.println("</body>");
        out_file.println("</html>");

    }
}
