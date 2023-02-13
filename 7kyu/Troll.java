/*Disemvowel Trolls 

Trolls are attacking your comment section!

A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

Your task is to write a function that takes a string and return a new string with all vowels removed.

For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.*/

// My Solution:

public class Troll {
    public static String disemvowel(String str) {
        // Code away...
      String text = str;
      String text2 = "";
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (character != 'a' && character != 'A' && character != 'e' && character != 'E' 
                && character != 'i' && character != 'I' && character != 'o' 
                && character != 'O' && character != 'u' && character != 'U') {
            text2 += text.charAt(i);
            }
        }
    return text2;
    }
}