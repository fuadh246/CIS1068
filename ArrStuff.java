import java.util.Arrays;

public class ArrStuff {
    public static String aToStr(int[] A) {
        String s = "{ ";
        for (int i = 0; i < A.length; i++) {
            s += A[i] + " ";
        }
        s += "}";
        return s;
    }

    public static void inc(int x) {
        x++;
    }

    public static void inc(int A[]) {
        for (int i = 0; i < A.length; i++) {
            A[i]++;
        }
    }

    public static int[] newInc(int[] A) {
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] + 1;
        }

        return B;
    }

    public static void anotherInc(int[] A) {
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] + 1;
        }

        A = B;
    }

    public static void main(String[] args) {
        int[] A = new int[3];
        int[] bigger;

        A[0] = 10;
        A[1] = 20;
        A[2] = 30;

        System.out.println("location of A = " + A);
        System.out.println("A = " + aToStr(A));
        System.out.println("A = " + Arrays.toString(A));

        int x = 5;
        inc(x);
        System.out.println(x);
        inc(A);
        System.out.println(A[0]);

        bigger = newInc(A);
        System.out.println("A = " + Arrays.toString(A));
        System.out.println("bigger = " + Arrays.toString(bigger));
        System.out.println("location of A = " + A);
        System.out.println("location of bigger = " + bigger);

    }
}
