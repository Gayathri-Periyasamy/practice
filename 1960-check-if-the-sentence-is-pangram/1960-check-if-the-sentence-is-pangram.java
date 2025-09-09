class Solution {
    public boolean checkIfPangram(String sentence) {
        String s = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0; i < s.length(); i++){ 
            char c = s.charAt(i);
            if(sentence.indexOf(c) == -1){ 
                return false;
            }
        }
        return true;
    }
}