public class PracticeProblem {

	public static boolean validIndex (int[] arr, int index) {
		try {
			if (arr[index] == arr[index])
			return true;
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
		return true;
	}

	public static int divide (int a, int b) {
		try {
			return a / b;
		} catch (ArithmeticException e) {
			return 0;
		}

		}
	
	}