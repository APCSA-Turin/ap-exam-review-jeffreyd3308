public class ArrayTester {
    public static void main(String[] args) {
        System.out.println("------- Q4 Part A Testing --------");
        boolean testPass = true;
        int[][] arr = {{2, 1, 0}, {1, 3, 2}, {0, 0, 0}, {4, 5, 6}};
        boolean result = ArrayResizer.isNonZeroRow(arr, 0);
        System.out.println(result);
        if (result) {
            testPass = false;
        }
        result = ArrayResizer.isNonZeroRow(arr, 1);
        System.out.println(result);
        if (!result) {
            testPass = false;
        }
        result = ArrayResizer.isNonZeroRow(arr, 2);
        System.out.println(result);
        if (result) {
            testPass = false;
        }
        result = ArrayResizer.isNonZeroRow(arr, 3);
        System.out.println(result);
        if (!result) {
            testPass = false;
        }
        if (testPass) {
            System.out.println("--> TEST PASSED");
        } else {
            System.out.println("--> !!!!!TEST FAILED!!!!!");
        }
        System.out.println("\n------- Q4 Part B Testing --------");
        int[][] smaller = ArrayResizer.resize(arr);
        System.out.println("returned resized 2D array:");
        for (int[] row : smaller) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        if (smaller.length == 2 && smaller[0].length == 3) {
            if (smaller[0][0] == 1 && smaller[0][1] == 3 && smaller[0][2] == 2 &&
                    smaller[1][0] == 4 && smaller[1][1] == 5 && smaller[1][2] == 6) {
                System.out.println("--> TEST PASSED");
            } else {
                System.out.println("--> !!!!!TEST FAILED!!!!!");
            }
        } else {
            System.out.println("--> !!!!!TEST FAILED!!!!!");
        }
        System.out.println("\noriginal array should NOT be modified:");
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        if (arr.length == 4 && arr[0].length == 3) {
            if (arr[0][0] == 2 && arr[0][1] == 1 && arr[0][2] == 0 &&
                    arr[1][0] == 1 && arr[1][1] == 3 && arr[1][2] == 2 &&
                    arr[2][0] == 0 && arr[2][1] == 0 && arr[2][2] == 0 &&
                    arr[3][0] == 4 && arr[3][1] == 5 && arr[3][2] == 6) {
                System.out.println("--> TEST PASSED");
            } else {
                System.out.println("--> !!!!!TEST FAILED!!!!!");
            }
        } else {
            System.out.println("--> !!!!!TEST FAILED!!!!!");
        }
    }
}
