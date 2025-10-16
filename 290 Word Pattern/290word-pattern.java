class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<String, String> lettersToWords = new HashMap<>();
        Map<String, String> wordsToLetters = new HashMap<>();
        String[] letters = pattern.split("");
        String[] words = s.split(" ");
        if (letters.length != words.length) {
            return false;
        }
        for (int i = 0; i < letters.length; i++) {
            String word = lettersToWords.put(letters[i], words[i]);
            String letter = wordsToLetters.put(words[i], letters[i]);

            if ((word != null
                    && !word.equals(words[i])) || (letter != null && !letter.equals(letters[i]))) {
                return false;
            }
        }
        return true;
    }
}