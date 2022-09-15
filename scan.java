import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        Scanner s_name = new Scanner(System.in); // Scanner declaration
        // Use Scanner object to take input
        System.out.println("enter int ");
        int val1 = s_name.nextInt(); // int

        System.out.println("enter float ");
        float val2 = s_name.nextFloat(); // float

        System.out.println("enter double ");
        double val3 = s_name.nextDouble(); // double
        System.out.println("enter string ");
        String name = s_name.nextLine(); // string

        System.out.println("enter char ");

        char ch = s_name.nextLine().charAt(0);
        s_name.close();
        System.out.println(val1 + val2 + val3 + name + ch);
    }
}
