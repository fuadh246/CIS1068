import java.util.Arrays;

public class MoreArrStuff {
    public static void anotherInc(int[] A) {
        int[] B = new int[A.length];

        System.out.println("location of A = " + A);
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] + 1;
        }

        A = B;
        System.out.println("A = " + Arrays.toString(A));
        System.out.println("B = " + Arrays.toString(B));

        System.out.println("location of A = " + A);
        System.out.println("location of B = " + B);
    }

    public static void main(String[] args) {
        int[] A = new int[3];

        A[0] = 10;
        A[1] = 20;
        A[2] = 30;

        System.out.println("location of A = " + A);
        System.out.println("A = " + Arrays.toString(A));

        anotherInc(A);

        // System.out.println("location of A = " + A);
        // System.out.println("A = " + Arrays.toString(A));
    }
}