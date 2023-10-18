/*
 * Complete the method/function so that it converts dash/underscore delimited
 * words into camel casing. The first word within the output should be
 * capitalized only if the original word was capitalized (known as Upper Camel
 * Case, also often referred to as Pascal case). The next words should be always
 * capitalized.
 * 
 * Examples
 * "the-stealth-warrior" gets converted to "theStealthWarrior"
 * 
 * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 * 
 * "The_Stealth-Warrior" gets converted to "TheStealthWarrior"
 */

// My solution.

import java.lang.StringBuilder;

class Solution {

    static String toCamelCase(String s) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '-' || c == '_') {
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    result.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}