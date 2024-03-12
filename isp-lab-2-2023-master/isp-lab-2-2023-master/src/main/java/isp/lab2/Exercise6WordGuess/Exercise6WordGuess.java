package isp.lab2.Exercise6WordGuess;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise6WordGuess {
    /**
     * This method will return the number of occurrences of a character in a word
     *
     * @param c
     * @param word
     * @return
     */
    public static int[] getOccurrencePositions(char c, char[] word) {
        int[] results = new int[word.length];
        int k = 0;
        for(int i=0;i<word.length;i++){
            if(word[i]==c)
                results[k++] = i;
        }
        return Arrays.copyOfRange(results, 0, k);

    }
    public static void main(String[] args) {
        char[] word = {'a','l','f','a','b','e','t'}; // replace with a word from a dictionary
        boolean solved = false;
        Scanner scanner = new Scanner(System.in);
        char[] wordNew = {'','','','','','','_'};
        int tries = 0;
        while (tries < 10 && !solved) {
            tries++;
            System.out.println("Enter a letter: ");
            String letter = scanner.nextLine();
            int[] occurrences = getOccurrencePositions(letter.charAt(0), word);
            // todo: continue the implementation
            if(occurrences.length>0){

                for(int i = 0;i<occurrences.length;i++)
                    wordNew[occurrences[i]] = letter.charAt(0);
                System.out.println("Correct! "+new String(wordNew));
                //verific daca am ajuns la sfarsit
                if(Arrays.equals(word, wordNew)){
                    System.out.println("Success! You found the word!");
                    solved = true;
                }
            }else{
                System.out.println("Letter not found!");
            }

        }
    }
}