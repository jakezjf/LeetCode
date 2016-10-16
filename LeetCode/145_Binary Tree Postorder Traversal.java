/**
*Given a binary tree, return the postorder traversal of its nodes' values.
*
*For example:
*Given binary tree {1,#,2,3},
*   1
*    \
*     2
*    /
*   3
*return [3,2,1].
*
*Note: Recursive solution is trivial, could you do it iteratively?
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public List<Integer> list;
    
    public List<Integer> postorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        if(root == null){
            return list;
        }
        postorder(root);
        return list;
    }
    
    public void postorder(TreeNode root){
        if(root.left != null){
            postorder(root.left);
        }
        if(root.right != null){
            postorder(root.right);
        }
        list.add(root.val);
    }
    
    
}

