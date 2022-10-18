import java.util.Stack;
public class Main {

    /**
     * Function to reverse a String except the last character of it
     * @param word The word that will be reverse
     * @return The new word reversed except the last character 
     */
    static String reverseStringExceptLastCharacter(String word) {
        // Declare a new character array that will hold all the characters of new word reversed
        char[] reverseWord = new char[word.length()];        
        // Declare a new character stack, this data structure will helps us use LIFO term
        // for reverse the word parameter
        Stack<Character> stackCharacters = new Stack<>();

        // Iterate over all characters of the word parameter except 
        // the last character and add them to the new character stack
        for (int i = 0; i < word.length() - 1; i++) {
            stackCharacters.add(word.charAt(i));
        }

        // Extract the last character from the word parameter
        char lastCharacter = word.charAt(word.length() - 1);

        // We need to iterate over character stack and use the LIFO term for save the new reversed word 
        // in the character array
        int i = 0;
        while (!stackCharacters.isEmpty()) {
            reverseWord[i++] = stackCharacters.pop();
        }        

        // Finally, we need to put the last character from the word parameter in the new reversed word
        reverseWord[i] = lastCharacter;

        return new String(reverseWord);
    }


    public static void main(String[] args) {
        String word = "Hello world!";
        System.out.println(word + " <reverse> " + reverseStringExceptLastCharacter(word));
    }
    
}