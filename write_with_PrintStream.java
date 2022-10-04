import java.io.*;

public class write_with_PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream output = new PrintStream(new File("num.txt"));
        for (int i = 0; i < 11; i++) {
            output.print(i + " ");
        }
        output.println();
    }
}