class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }
        for (String magazineLetter : magazine.split("")) {
            ransomNote = ransomNote.replaceFirst(magazineLetter, "");
        }
        return ransomNote.isEmpty();
    }
}