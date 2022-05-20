package textnumber;

public class textnumberClass {

    public int countVowels(String text){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            String letter = text.substring(i, i + 1);
            if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
                count++;
            }
        }
        return count;
    }

    public String textBackwards(String text){
        String newWord = "";
        for (int i = 0; i < text.length(); i++){
            newWord = text.charAt(i) + newWord;
        }
        return newWord;
    }

    public int digitSum(int number){
        int sum = 0;

        while (number != 0){
            int digit = number % 10;
            sum += digit;
            number = number /10;
        }
        return sum;
    }

    public boolean isNumber(String text){
        int count = 0;
        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if (Character.isDigit(c)){
                count++;
            }
        }
        return count == text.length();
    }
}
