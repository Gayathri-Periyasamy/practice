class Solution {
    public char findTheDifference(String s, String t) {
Map<Character,Integer>mp=new HashMap<>();
for(char c:s.toCharArray()){
    mp.put(c,mp.getOrDefault(c,0)+1);
}
for(char c:t.toCharArray()){
    mp.put(c,mp.getOrDefault(c,0)-1);
}
for(Map.Entry<Character,Integer>entry:mp.entrySet()){
    if(entry.getValue()!=0)
    return entry.getKey();
}
return ' ';
    }
}