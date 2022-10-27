import java.util.Arrays;

public class druft {
    public static void main(String[] args) {
        // System.out.println(numPunct("", 1));
        // System.out.println((indexOfFirstPunct("Fuad's iphone.", 7)));
        // System.out.println((indexOfLastPunct("Fuad")));
        // System.out.println(substitute("apple", 'p', ' '));
        // System.out.println(substitutePunct(".!bj"));
        // System.out.println(containsNone("cheesy poofs", "ABCDE"));
        // System.out.println(withoutPunct("?."));
        int[] A = { 10, 20, 30, 40, 50 };
        // reverse(A);
        copy(A);
    }

    public static int[] copy(int A[]) {
        int[] B = new int[A.length];
        for (int i = A.length; i > 0; i--) {
            B[i] = A[i];
        }
        System.out.println(Arrays.toString(B));
        return B;
    }

    public static void reverse(int A[]) {
        int[] B = new int[A.length];
        int n = A.length;
        for (int i = A.length; i > 0; i--) {
            B[n - i] = A[i];
            n--;
        }
        System.out.println(Arrays.toString(B));
        return;
    }

    public static int[] copyAll(int A[], int B[]) {
        int[] C = new int[A.length + B.length];
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }
        for (int i = 0; i < B.length; i++) {
            C[A.length + i] = B[i];
        }
        System.out.println(Arrays.toString(C));
        return C;
    }

    public static int[] copyN(int A[], int n) {
        if (n > 0) {
            int[] B = new int[n];
            for (int i = 0; i < A.length && i < B.length; i++) {
                System.out.println(A[i] + " " + i);
                B[i] = A[i];
            }
            if (B.length > A.length) {
                for (int i = A.length; i < B.length; i++) {
                    B[i] = 0;
                }
            }
            return B;
        }

        return null;
    }

    public static String withoutPunct(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println("s = " + s.charAt(i));
            if (isPunct(s.charAt(i)) == true) {
                s = s.replace(Character.toString(s.charAt(i)), "");
            }
        }
        return s;
    }

    /*
     * public static String withoutPunct(String s) {
     * StringBuffer sb = new StringBuffer(s);
     * for (int i = 0; i < s.length(); i++) {
     * if (isPunct(s.charAt(i)) == true) {
     * sb.deleteCharAt(i);
     * }
     * }
     * s = sb.toString();
     * return s;
     * }
     */
    public static boolean containsNone(String s, String chars) {
        char[] ch = chars.toCharArray();
        char[] s_to_char = s.toCharArray();
        System.out.println(ch);
        System.out.println(Arrays.toString(s_to_char));

        for (int i = 0; i < ch.length; i++) {
            if (Arrays.toString(s_to_char).contains(String.valueOf(ch[i]))) {
                System.out.println(ch[i]);
                return false;
            }
        }
        return true;

    }

    public static String substitutePunct(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (isPunct(s.charAt(i)) == true) {
                s = s.replace(s.charAt(i), ' ');
            }
        }
        return s;
    }

    public static String substitute(String s, char oldChar, char newChar) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == oldChar) {
                s = s.replace(oldChar, newChar);
            }
        }
        return s;
    }

    public static boolean isPunct(char c) {
        char[] Punctuations = { '\'', ',', '.', ';', ':', '!', '?' };
        for (int i = 0; i < Punctuations.length; i++) {
            if (Punctuations[i] == c) {
                return true;
            }
        }
        return false;
    }

    public static int numPunct(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isPunct(s.charAt(i)) == true) {
                count++;
            }
        }
        return count;
    }

    public static int numPunct(String s, int startIndex) {
        int count = 0;
        if (s.length() < startIndex) {
            return -1;
        } else {
            for (int i = startIndex; i < s.length(); i++) {
                if (isPunct(s.charAt(i)) == true) {
                    count++;
                }
            }
            return count;
        }
    }

    public static int indexOfFirstPunct(String s, int startPosition) {
        for (int i = startPosition; i < s.length(); i++) {
            if (isPunct(s.charAt(i)) == true) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfLastPunct(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (isPunct(s.charAt(i)) == true) {
                return i;
            }
        }
        return -1;
    }

}