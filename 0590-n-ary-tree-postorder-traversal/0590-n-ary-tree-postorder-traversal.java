class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer>list=new ArrayList<>();
        if(root==null) return list;
        Stack<Node> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node top=st.pop();
            list.add(top.val);
            for(Node child:top.children){
                st.push(child);
            }
        }
        Collections.reverse(list);
        return list;
    }
}