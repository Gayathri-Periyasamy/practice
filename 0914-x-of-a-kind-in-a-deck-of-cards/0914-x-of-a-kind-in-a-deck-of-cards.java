class Solution {
    public static boolean hasGroupsSizeX(int[] deck) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int card : deck){
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        int gcd = 0;
        for(int count : map.values()){
            gcd = gcd(gcd, count);
        }

        return gcd > 1 ? true : false;

    }

    public static int gcd(int a, int b) {
        if (b == 0) {                    
            return a;
        }
        return gcd(b, a % b);
    }
}


