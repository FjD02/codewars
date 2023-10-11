/*
        Given a random non-negative number, you have to return 
        the digits of this number within an array in reverse order.

        Example(Input => Output):
        35231 => [1,3,2,5,3]
        0 => [0]
 * 
 */

// My Solution.

public class Kata {
    public static int[] digitize(long n) {
        String numberString = String.valueOf(n);
        String numberStringRvr = ""; // String reversed
        int strLength = numberString.length();
        int[] numberArray = new int[strLength];

        for (int i = strLength - 1; i >= 0; i--) {
            numberStringRvr += numberString.charAt(i);
        }

        for (int j = 0; j <= strLength - 1; j++) {
            numberArray[j] = Character.getNumericValue(numberStringRvr.charAt(j));
        }

        return numberArray;
    }
}