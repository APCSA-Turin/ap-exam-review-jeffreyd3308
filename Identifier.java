public class Identifier {
    /** IMPLEMENTATION PROVIDED TO ENABLE TESTING */
    public static int encodeToNumber(String str) {
        if (str.equals("tree")) {
          return 80;
        } else if (str.equals("book")) {
          return 10;
        } else if (str.equals("door")) {
          return 40;
        } else if (str.equals("desk")) {
          return 50;
        } else if (str.equals("lion")) {
          return 20;
        } else {
          return 0;
        }
    }

    /** Returns an identifier string based on an input string, as described
      * in part (a)
      *
      * Precondition: input is not null.
      */
    public static String generateID(String input) {
       // type your method here 
        String returnStr = "";
        if (input.length() % 4 != 0) {
            return "error";
        }
        int amount = 0;
        for (int i = 0; i < input.length(); i+=4) {
            if (encodeToNumber(input.substring(i, i+4)) != 0) {
                amount += encodeToNumber(input.substring(i, i+4));
                returnStr += input.substring(i, i+4);
            }
        }
        if (amount >= 100) {
            returnStr += "3";
        } else {
            returnStr += "X";
        }
            return returnStr;
    }
}
