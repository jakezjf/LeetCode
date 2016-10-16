/**
*Given a binary tree, return the preorder traversal of its nodes' values.
*
*For example:
*Given binary tree {1,#,2,3},
*   1
*    \
*     2
*    /
*   3
*return [1,2,3].
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
    
    public List<Integer> preorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        if(root == null){
            return list;
        }
        preorder(root);
        return list;
    }
    
    public void preorder(TreeNode root){
        list.add(root.val);
        if(root.left != null){
            preorder(root.left);
        }
        if(root.right != null){
            preorder(root.right);
        }
    }
    
}

