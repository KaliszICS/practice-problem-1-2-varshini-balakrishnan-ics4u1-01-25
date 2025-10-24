public class PracticeProblem {

	public static void main(String args[]) {
		int[] arr = {1,2,3};
		System.out.println(validIndex(arr, 2)); // true
		System.out.println(validIndex(arr, 5)); // false? (yeah false)
		System.out.println(divide(10,2)); //10 div 2 = five (5)
		System.out.println(divide(10,0)); //0
		System.out.println(convertString("123")); //123
		System.out.println(convertString("hi")); //0

	}

	public static boolean validIndex (int[] arr, int index) {
		try {
			if (arr[index] >= 0 || arr[index] < 0) {
				
			}
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
	public static int convertString(String str) {
		try {
			return Integer.parseInt(str);
		} catch (Exception e) {
			return 0;
		}
	}
}
