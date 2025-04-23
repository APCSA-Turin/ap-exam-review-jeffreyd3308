public class TableTester {
    public static void main(String[] args) {
        System.out.println("------- Q2 Testing --------");
        boolean testPass = true;
        SingleTable t1 = new SingleTable(4, 74, 60.0);
        SingleTable t2 = new SingleTable(8, 74, 70.0);
        SingleTable t3 = new SingleTable(12, 76, 75.0);
        CombinedTable c1 = new CombinedTable(t1, t2);
        boolean canSeat = c1.canSeat(9);
        System.out.println(canSeat);
        if (!canSeat) {
            testPass = false;
        }
        canSeat = c1.canSeat(11);
        System.out.println(canSeat);
        if (canSeat) {
            testPass = false;
        }
        double des = c1.getDesirability();
        System.out.println(des);
        if (des != 65.0) {
            testPass = false;
        }
        CombinedTable c2 = new CombinedTable(t2, t3);
        canSeat = c2.canSeat(18);
        System.out.println(canSeat);
        if (!canSeat) {
            testPass = false;
        }
        des = c2.getDesirability();
        System.out.println(des);
        if (des != 62.5) {
            testPass = false;
        }
        t2.setViewQuality(80);
        des = c2.getDesirability();
        System.out.println(des);
        if (des != 67.5) {
            testPass = false;
        }
        if (testPass) {
            System.out.println("--> TEST PASSED");
        } else {
            System.out.println("--> !!!!!TEST FAILED!!!!!");
        }
    }
}

