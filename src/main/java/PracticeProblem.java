public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void bubbleSortString(String[] strings) {
		int n = strings.length;
		boolean swapped;

		for (int i = 0; i < n - 1; i++) {
			swapped = false;

			for (int j = 0; j < n - 1 - i; j++) {
			
			if (strings[j].compareToIgnoreCase(strings[j+1]) > 0) {
				String temp = strings[j];
				strings[j] = strings[j+1];
				strings[j+1] = temp;
				swapped = true;

			}
			
			}

		if (!swapped) {
			break;
		}
	}
}
}