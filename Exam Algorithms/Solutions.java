import java.util.HashSet;
import java.util.Set;

public class Solutions {

    /***
     * Given a grid of integers of size N x M finds the minimal sum of the path from the upper left corner
     * (0,0) to the bottom right corner (N-1, M-1)
     * @param grid - assuming nut NULL.
     * @return minimal sum of said path
     */
    public static int CalculateMinSumPath(int[][] grid){
        // this solution uses the same grid as the DP array. You can also create a new grid and fill it.
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                // if i = j = 0 do nothing.
                if (i == 0 && j != 0)
                    grid[i][j] += grid[i][j - 1];
                else if (i != 0 && j == 0)
                    grid[i][j] += grid[i - 1][0];
                else if (i != 0 && j != 0)
                    grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        // return grid[n-1, m-1]
        return grid[grid.length - 1][grid[0].length - 1];
    }

    /**
     * method finds a duplicate number in an array of N+1 ints, where numbers are in range 1->N.
     * It is important that all numbers are positive.
     * @param numList a list of N+1 numbers in range 1->N.
     * @return the duplicate number.
     */
    public static int findDuplicate(int[] numList) {
        // create 2 pointers on the array
        int i = numList[0];
        int j = numList[0];
        // iterate over the array as a "hashcode", each value is the hashcode for the next index.
        // i jumps 1 time, j jumps twice. stop when they meet (a cycle has been closed).
        do {
            i = numList[i];
            j = numList[numList[j]];
        } while (i != j);
        // find the originator of the cycle. use two pointers, one of the start and one of the end of the cycle.
        // each time jump 1 index, and stop when we get to the duplicate.
        int numCandidate1 = numList[0];
        int numCandidate2 = i;
        while (numCandidate1 != numCandidate2) {
            numCandidate1 = numList[numCandidate1];
            numCandidate2 = numList[numCandidate2];
        }
        return numCandidate2;
    }

    // all characters' morse code representation, a to z.
    private static final String[] MORSE_CODES = {".-", "-...", "-.-.", "-..",".", "..-.","--.","....","..",".---",
            "-.-", ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    /**
     * find amount of unique morse code translations can be extracted from a list of words.
     * @param words array of strings
     * @return amount of unique morse codes.
     */
    public static int uniqueMorseRepresentations(String[] words) {
        // initialize hashSet for the morse translations.
        Set<String> uniqueMorse = new HashSet<>();
        for (String word : words) {
            // build string one char at a time.
            StringBuilder morse = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                // translate character to morse using the MORSE_CODE array.
                char c = word.charAt(i);
                morse.append(MORSE_CODES[c - 'a']);
            }
            // add the translation to hashSet.
            uniqueMorse.add(morse.toString());
        }
        // size of set is number of unique morse codes.
        return uniqueMorse.size();
    }
}
