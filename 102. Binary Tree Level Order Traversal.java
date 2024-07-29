class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
        return ans;

        qu.add(root);

        while(! qu.isEmpty()){
           int n = qu.size();
            List<Integer> li = new ArrayList<>();
           while(n-- > 0){
            TreeNode N = qu.poll();
            if(N.left != null){
                qu.add(N.left);
            }
            if(N.right != null){
                qu.add(N.right);
            }
            li.add(N.val);
           }
           ans.add(li);
        }
        return ans;
    }
}
