class Solution {
    public int lengthOfLastWord(String s) {
        String str[] = s.split(" ");
        String lastword = str[str.length - 1];
        int length = lastword.length();
        return length;
    }
}