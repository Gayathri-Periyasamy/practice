class Solution {
    TreeNode output=new TreeNode();
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        getNode(cloned,target);
        return output;
    }
    public void getNode(TreeNode head,TreeNode t){
        if(head !=null){
            getNode(head.left,t);
            if(head.val==t.val){
                output=head;
            }
            getNode(head.right,t);
        }
    }
}