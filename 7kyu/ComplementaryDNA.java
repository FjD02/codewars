/*
 * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and
 * "G". Your function receives one side of the DNA (string, except for Haskell);
 * you need to return the other complementary side. DNA strand is never empty or
 * there is no DNA at all (again, except for Haskell).
 * 
 * More similar exercise are found here:
 * http://rosalind.info/problems/list-view/ (source)
 * 
 * Example: (input --> output)
 * 
 * "ATTGC" --> "TAACG"
 * "GTAT" --> "CATA"
 */

// My solution.

public class DnaStrand {
    public static String makeComplement(String dna) {
        char[] dnaArray = dna.toCharArray();

        for (int i = 0; i < dnaArray.length; i++) {
            char currentChar = dnaArray[i];
            switch (currentChar) {
                case 'A':
                    dnaArray[i] = 'T';
                    break;
                case 'T':
                    dnaArray[i] = 'A';
                    break;
                case 'C':
                    dnaArray[i] = 'G';
                    break;
                case 'G':
                    dnaArray[i] = 'C';
                    break;
            }
        }
        return new String(dnaArray);
    }
}