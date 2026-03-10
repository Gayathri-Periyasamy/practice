class Solution {
    public int countAsterisks(String s) {
        int barCount = 0, stars = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                if (barCount % 2 == 0) {
                    stars++;
                }
            } else if (ch == '|') {
                barCount++;
            }
        }

        return stars;
    }
}