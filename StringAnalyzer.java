public class StringAnalyzer {
    /** Returns a count of how many times smallStr occurs in largeStr, as
      * described in part (a)
      *
      * Precondition: largeStr is not null; smallStr is not null.
      *          The length of smallStr is less than the length of largeStr.
      */
     public static int countRepeat(String largeStr, String smallStr) {
                // type your method here
        int startIndex = 0;
        int count = 0;
        while (largeStr.indexOf(smallStr) != -1) {
            count++;
            startIndex += smallStr.length();
            largeStr = largeStr.substring(startIndex);
        }
        return count;
     }
  }
  