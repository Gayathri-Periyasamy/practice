class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>anagrams=new HashMap<>();
        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String sa=new String(c);
            if(!anagrams.containsKey(sa)){
                anagrams.put(sa,new ArrayList<>());
            }
            anagrams.get(sa).add(s);
        }
        return new ArrayList<>(anagrams.values());
    }
}