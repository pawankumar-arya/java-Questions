public class Vowel_Sentence {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence.";
        int vowelCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (isVowel(ch)) {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels in the sentence: " + vowelCount);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
  }