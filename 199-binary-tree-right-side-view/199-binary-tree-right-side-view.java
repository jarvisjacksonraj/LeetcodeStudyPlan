/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
   
        if(root == null) return new ArrayList<>();
        
        List<Integer> rightView = new ArrayList<>();
        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.add(root);
        while(!bfs.isEmpty()) {
            int size = bfs.size();
            int prev = 0;
            
            for(int i = 0; i < size; i++) {
                TreeNode temp = bfs.remove();
                prev = temp.val;
                if(temp.left != null) {
                    bfs.add(temp.left);
                }
                
                if(temp.right != null) {
                    bfs.add(temp.right);
                }
            }
            rightView.add(prev);           
        }
        return rightView;
    }
}