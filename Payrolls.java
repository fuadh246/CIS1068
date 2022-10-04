import java.util.Scanner;

public class Payrolls {
    public static String oneEmpleoyeeString(String s) {
        int numDays = 0;
        int sumHours = 0;
        Scanner in = new Scanner(s);

        int id = in.nextInt();
        String name = in.next();
        while (in.hasNextDouble()) {
            numDays++;
            sumHours += in.nextDouble();
        }
        return name + " ID# " + id + " ) worked " + sumHours + " ( " + sumHours / numDays + " hours/days)";
    }

    public static void main(String[] args) {
        String line = "123 Kim 12.5 8.1 7.6 3.2";
        String store = oneEmpleoyeeString(line);
        System.out.println(store);

    }
}