public class arrays {
    public static void main(String[] aStrings) {
        int A[] = { 1, 10, 20, 20, 30 };
        System.out.println(is_same_reverse(A));
        String names[] = { "Fuad", "Omar" };
        reverseAll(names);
    }

    public static String reverse(String s) {
        String r = "";

        for (int i = s.length(); i >= 0; i--) {
            r += s.charAt(i);
        }
        return r;
    }

    public static void reverseAll(String[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = reverse(A[i]);
        }
    }

    public static boolean is_same_reverse(int A[]) {
        int B[] = reverse(A);
        for (int i = 0; i < B.length; i++) {
            System.out.println(A[i] + " == " + B[i]);
            if (A[i] != B[i]) {
                return false;
            }
        }

        return true;
    }

    static int[] reverse(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[array.length - 1 - i] = array[i];
        }

        return newArray;
    }

}