public class main {
	public static void main(String[] args) {

		int[] A = { 2, 3, 4, 5, 6, 7 };
		int[] B = { 2, 3, 4, 5, 6, 7 };
		// int[] C = A;
		System.out.println(A);
		System.out.println(B);
		// System.out.println(A == C);

		int[] C = scaler(A);
		System.out.println(C);

	}

	public static int[] scaler(int[] A) {
		for (int i = 0; i < A.length; i++) {
			A[i] *= 3;
		}
		return A;
	}
}
