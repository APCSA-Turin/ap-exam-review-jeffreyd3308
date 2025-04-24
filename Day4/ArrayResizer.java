public class ArrayResizer {

    public static boolean isNonZeroRow(int[][] array2D, int r) {
        // TYPE UP YOUR PART A CODE HERE
        // then test with ArrayTester
		for (int i = 0; i < array2D[r].length; i++ ) {
			if (array2D[r][i] == 0) {
				return false;
			}
		}
		return true;
    }

    public static int[][] resize(int[][] array2D) {
        // TYPE UP YOUR PART B CODE HERE
        // then test with ArrayTester
		int amount = numNonZeroRows(array2D);
		int[][] smaller = new int[amount][array2D[0].length];
		int index = 0;
		for (int i = 0; i < array2D.length; i++) {
			if (isNonZeroRow(array2D, i)) {
				smaller[index] = array2D[i];
				index++;
			}
		}
        return smaller;
    }

    // CODE BELOW ADDED TO ENABLE TESTING; NOT SHOWN IN ORIGINAL FRQ
    public static int numNonZeroRows(int[][] array2D) {
        int nonZeroRowCount = 0;
        for (int row = 0; row < array2D.length; row++) {
            boolean hasZeros = false;
            for (int col = 0; col < array2D[0].length; col++) {
                if (array2D[row][col] == 0) {
                    hasZeros = true;
                }
            }
            if (!hasZeros) {
                nonZeroRowCount++;
            }
        }
        return nonZeroRowCount;
    }
}

