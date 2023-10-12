/*
 * ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain
 * anything but exactly 4 digits or exactly 6 digits.
 * 
 * If the function is passed a valid PIN string, return true, else return false.
 * 
 * Examples (Input --> Output)
 * "1234" --> true
 * "12345" --> false
 * "a234" --> false
 */

// My solution:

public class Solution {

    public static boolean validatePin(String pin) {
        int pinLength = pin.length();

        if (pinLength == 4 || pinLength == 6) {
            for (int i = 0; i < pinLength; i++) {
                char c = pin.charAt(i);
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}