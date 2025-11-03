public class PracticeProblem {

	public static boolean validIndex (int[] arr, int index) {
		try {
			if (arr[index] >= 0 || arr[index] < 0) {
			return true;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
		return true;
	}

	public static int divide (int a, int b) {
		try {
			return a / b;
		} catch (Exception e) {
			return 0;
		}

		}
		public static int safeConvertStringtoInt (String s) {
			try {
				return Integer.parseInt(s);
			} catch (Exception e) { 
				return 0;
			}
			}
		}
	
