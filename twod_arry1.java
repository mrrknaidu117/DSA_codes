public class twod_arry1 {
	public static void main(String[] args) {
		int rows = 4;
		int columns = 4;

		int[][] array = new int[rows][columns];

		int value = 1;
		System.out.println("The 2D array is: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = value;
				value++;
				System.out.println(array[i][j] + " ");
			}
		
	}

	}
}