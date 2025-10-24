public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean validIndex (int[] arr, int index) {
		try {
			arr[index];
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static int divide (int a, int b) {
		try {
			return a / b;
		} catch (Exception e) {
			return 0;
		}
	}
	public static int safeconvertStringtoInt(String str) {
		try {
			return Integer.parseInt(str);
		} catch (Exception e) {
			return 0;
		}
	}
}
