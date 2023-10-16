/*
 * Complete the solution so that the function will break up camel casing, using
 * a space between words.
 * 
 * Example
 * "camelCasing" => "camel Casing"
 * "identifier" => "identifier"
 * "" => ""
 */

// My solution.

class Solution {
    public static String camelCase(String input) {
        String strAux = "";
        int strLength = input.length();

        for (int i = 0; i < strLength; i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                strAux += " ";
            }
            strAux += c;
        }
        return strAux;
    }
}