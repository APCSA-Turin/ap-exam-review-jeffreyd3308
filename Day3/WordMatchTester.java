public class WordMatchTester {
    public static void main(String[] args) {
       System.out.println("------- Q1 Part A Testing --------");
        System.out.println("---- Test case 1: mississippi ----");
        boolean testPass = true;
        WordMatch game = new WordMatch("mississippi");
        String guess = "i";
        int returnVal = game.scoreGuess(guess);
        System.out.println(returnVal);
        if (returnVal != 4) {
            testPass = false;
        }
        guess = "iss";
        returnVal = game.scoreGuess(guess);
        System.out.println(returnVal);
        if (returnVal != 18) {
            testPass = false;
        }
        guess = "issipp";
        returnVal = game.scoreGuess(guess);
        System.out.println(returnVal);
        if (returnVal != 36) {
            testPass = false;
        }
        guess = "mississippi";
        returnVal = game.scoreGuess(guess);
        System.out.println(returnVal);
        if (returnVal != 121) {
            testPass = false;
        }
        if (testPass) {
            System.out.println("--> TEST PASSED");
        } else {
            System.out.println("--> !!!!!TEST FAILED!!!!!");
        }
        System.out.println("\n---- Test case 2: aaaabb ----");
        testPass = true;
        game = new WordMatch("aaaabb");
        guess = "a";
        returnVal = game.scoreGuess(guess);
        System.out.println(returnVal);
        if (returnVal != 4) {
            testPass = false;
        }
        guess = "aa";
        returnVal = game.scoreGuess(guess);
        System.out.println(returnVal);
        if (returnVal != 12) {
            testPass = false;
        }
        guess = "aaa";
        returnVal = game.scoreGuess(guess);
        System.out.println(returnVal);
        if (returnVal != 18) {
            testPass = false;
        }
        guess = "aabb";
        returnVal = game.scoreGuess(guess);
        System.out.println(returnVal);
        if (returnVal != 16) {
            testPass = false;
        }
        guess = "c";
        returnVal = game.scoreGuess(guess);
        System.out.println(returnVal);
        if (returnVal != 0) {
            testPass = false;
        }
        if (testPass) {
            System.out.println("--> TEST PASSED");
        } else {
            System.out.println("--> !!!!!TEST FAILED!!!!!");
        }
        System.out.println("\n------- Q1 Part B Testing --------");
        testPass = true;
        game = new WordMatch("concatenation");
        guess = "ten";
        returnVal = game.scoreGuess(guess);
        System.out.println(returnVal);
        if (returnVal != 9) {
            testPass = false;
        }
        guess = "nation";
        returnVal = game.scoreGuess(guess);
        System.out.println(returnVal);
        if (returnVal != 36) {
            testPass = false;
        }
        String better = game.findBetterGuess("ten" , "nation");
        System.out.println(better);
        if (!better.equals("nation")) {
            testPass = false;
        }
        guess = "con";
        returnVal = game.scoreGuess(guess);
        System.out.println(returnVal);
        if (returnVal != 9) {
            testPass = false;
        }
        guess = "cat";
        returnVal = game.scoreGuess(guess);
        System.out.println(returnVal);
        if (returnVal != 9) {
            testPass = false;
        }
        better = game.findBetterGuess("con" , "cat");
        System.out.println(better);
        if (!better.equals("con")) {
            testPass = false;
        }
        if (testPass) {
            System.out.println("--> TEST PASSED");
        } else {
            System.out.println("--> !!!!!TEST FAILED!!!!!");
        }
    }
}
 
