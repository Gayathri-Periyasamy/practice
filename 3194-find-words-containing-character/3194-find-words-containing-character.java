class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
    List<Integer> A=new ArrayList<>();
     for(int i=0;i<words.length;i++){
        int s=words[i].indexOf(x);
        if(s!=-1){
            A.add(i);
       }
     }
     return A;   
    }
}