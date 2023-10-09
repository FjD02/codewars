/*
Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).

Examples:

solution('abc', 'bc') // returns true
solution('abc', 'd') // returns false
*/

// My solution

public class Kata {
  public static boolean solution(String str, String ending) {
    int startString = str.length();
    int endingString = ending.length();
    
    if (endingString > startString) {
      return false;
    }
   
    for (int i = startString - 1, j = endingString - 1; j >= 0; i--, j--) {
      if (str.charAt(i) != ending.charAt(j)) {
        return false;
      }
    }
    return true;
  }
}