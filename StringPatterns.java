public class StringPatterns {
    /** Returns the String that results when letter and pattern are
      * compared, as described in part (a)
      *
      * Precondition: letter consists of one uppercase letter.
      *     pattern has at least 2 letters and all letters are uppercase
      *     and unique.
      */
    public static String letterAndPattern(String letter, String pattern) {
        // type your method here
        if (pattern.indexOf(letter) != -1) {
            return letter;
        } else {
            String str = "";
            for (int i = pattern.length() - 1; i >= 0; i--) {
                str += pattern.substring(i, i+1);
            }
            return str;
        }
    }
}