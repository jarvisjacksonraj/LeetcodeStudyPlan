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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> paths = new ArrayList<>();
            List<Integer> path = new ArrayList<>();
            dfs(root, 0, targetSum, path, paths); 
            return paths;
                      
    }
    
    public void dfs(TreeNode node, int curr, int targetSum, List<Integer> path, List<List<Integer>> paths) {
        if(node == null) {
            return;
        }
        
        path.add(node.val);
        
        if(node.left == null && node.right == null && 
           (targetSum == (node.val + curr))) {
            paths.add(new ArrayList<>(path));
        }
        
        curr += node.val;
        
        dfs(node.left, curr, targetSum, path, paths);
        dfs(node.right, curr, targetSum, path, paths);
        
        path.remove(path.size() - 1);        
    }
}