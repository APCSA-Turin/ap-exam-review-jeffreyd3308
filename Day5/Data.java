public class Data {
    public static final int MAX = 500; // THIS VALUE ADDED TO ENABLE TESTING
    private int[][] grid;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public Data(int[][] g) {
        grid = g;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public int[][] getGrid() {
        return grid;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public void setGrid(int[][] newGrid) {
        grid = newGrid;
    }

    public void repopulate() {
        // TYPE UP YOUR PART A CODE HERE
        // then test with DataTester
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				int randomNum = (int) (Math.random() * MAX) + 1;
				while (randomNum % 10 != 0 || randomNum % 100 == 0) {
					randomNum = (int) (Math.random() * MAX) + 1;
				}
				grid[i][j] = randomNum;
			}
		}
    }

    public int countIncreasingCols() {
        // TYPE UP YOUR PART B CODE HERE
        // then test with DataTester
		int num = 0;
		for (int i = 0; i < grid[0].length; i++) {
			boolean increasing = true;
			for (int j = 1; j < grid.length; j++) {
				if (grid[j][i] < grid[j-1][i]) {
					increasing = false;
				}
			}
			if (increasing) {
				num++;
			}
		}
		return num;
    }
}
