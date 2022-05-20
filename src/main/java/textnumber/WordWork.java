package textnumber;

public class WordWork {
    /**
     * Reverses the String str
     *
     * @param str is any string
     * @return the reversed word
     */
    public String flipWord(String str) {
        String word = "";
        for (int i = 0; i < str.length(); i++){
            word = str.substring(i, i+1) + word;
        }
        return word;
    }

    /**
     * Deletes the space (" ") and dashes (-)
     * if str is a multiple word and or separated with a dash
     *
     * @param str
     * @return a combined/single word without hyphen and or space in between
     */
    public String makeSingleWord(String str) {
        String newWord = "";
        for (int i= 0; i < str.length(); i++){
            String letter = str.substring(i, i + 1);
            if (!letter.equals(" ")  && !letter.equals("-")){
                newWord += letter;
            }
        }
        return newWord;
    }

    /**
     * Checks if a word is Palindrome
     * Converts the str into a single word
     * if str value has multiple words or has dashes
     * A palindrome is a word, number, phrase, or other sequence of characters
     * which reads the same backward as forward
     *
     * @param str a single or combined word
     * @return true if str is Palindrome, false otherwise
     */
    public boolean isPalindrome(String str) {
        String newStr = makeSingleWord(str);
        String newStrFlip = flipWord(newStr);

        if (newStr.equalsIgnoreCase(newStrFlip)) {
            return true;
        } else return false;
    }


/**
 * Creates and returns an alternate text formed
 * from every other letter of String str*/

    /**
     * Creates and returns an alternate text formed
     * from every other letter of String str
     * Converts str as a single word
     * If str is of even length, alternate text starts at end of str
     * If str is of odd length, alternate text starts at the first letter of str
     *
     * @param str is a string
     * @retirm
     */
    public String createAlternateText(String str) {
        String word = "";
        String newSrt = makeSingleWord(str);
        int length = newSrt.length();

        if (length % 2 != 0){
            for (int i= 0; i < length; i+= 2){
                String letter = newSrt.substring(i, i + 1);
                word += letter;
            }
        } else {
            for (int i = length; i > 0; i-= 2){
                String letter = newSrt.substring(i - 1, i);
                word += letter;
            }

        }

        return word;
    }

    /**
     * Prints a rectangle of random letters
     * generated from String word all in lowercase
     * @param row  number of rows to print
     * @param col  number of columns to print
     *             Example: if word = "Teacher", row = 4, col = 4
     *             Example output:
     *             e a t c
     *             t t e c
     *             a a e a
     *             e c t a
     * @param word
     */
    public String printRectLetters(String word, int row, int col) {
        String newWord = makeSingleWord(word);
        String box = "";
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                int ran = (int) (Math.random() * newWord.length());
                box += newWord.substring(ran, ran + 1).toLowerCase() + "\t";
            }
            box += "\n";
        }
        return box;
    }

 }

class TestClass{
    public static void main(String[] args) {

        WordWork ww = new WordWork();
        System.out.println("Flipping the word...");
        System.out.println(ww.flipWord("Java")); //avaJ

        System.out.println();
        System.out.println("Make single word...");
        System.out.println(ww.makeSingleWord("school-bus")); //schoolbus
        System.out.println(ww.makeSingleWord("hello world")); //helloworld
        System.out.println(ww.makeSingleWord("So What!")); //SoWhat!
        System.out.println(ww.makeSingleWord("What?")); //What?
        System.out.println(ww.makeSingleWord("   hello"));//hello


        System.out.println();
        System.out.println("Is palindrome...");
        System.out.println(ww.isPalindrome("Madam"));//true


        System.out.println();
        System.out.println("Creating alternate text...");
        System.out.println(ww.createAlternateText("Hello There")); //Hlohr
        System.out.println(ww.createAlternateText("Programming")); //gimroP

        System.out.println();
        System.out.println("Rectangle of random letters...");
        ww.printRectLetters("Teacher", 4, 4);
        /** example output
         * e e t a
         * c e e t
         * e t c a
         * t e r c
         */


    }
}

