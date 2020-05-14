package chapter8;

/*
We're going to create a method that counts the number of words in a String and prints them individually on a new line.
 */
public class TextProcessor {
    public static void main(String[] args) {
        countWords("i love test automation university");
        reverseString("hello mohammad!");
    }


    /**
     * split a string into an array by tokenizing it.
     * count words and print them.
     * @param text full string to be split
     */
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);
        for (String word : words ){
            System.out.println(word);
        }

    }

    /**
     * print string in reverse order
     * @param reverseText string to reverse
     */
    public static void reverseString(String reverseText){
        for (int i=reverseText.length()-1; i>=0; i--){
            System.out.print(reverseText.charAt(i));
        }
    }

}
