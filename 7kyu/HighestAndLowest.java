/*
 * In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
 * Examples
 * highAndLow("1 2 3 4 5")  // return "5 1"
 * highAndLow("1 2 -3 4 5") // return "5 -3"
 * highAndLow("1 9 3 4 -5") // return "9 -5"
 * Notes
 * All numbers are valid Int32, no need to validate them.
 * There will always be at least one number in the input string.
 * Output string must be two numbers separated by a single space, and highest number is first.
 */

// My solution
public class Kata {
    public static String highAndLow(String numbers) {
        String[] numberString = numbers.split(" ");
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        if (numberString.length == 0) {
            return "";
        }

        for (int i = 0; i < numberString.length; i++) {
            int number = Integer.parseInt(numberString[i]);
            if (number > maxNumber) {
                maxNumber = number;
            }
            if (number < minNumber) {
                minNumber = number;
            }
        }
        return maxNumber + " " + minNumber;
    }
}