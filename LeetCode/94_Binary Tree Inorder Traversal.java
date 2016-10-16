/**
*Given a binary tree, return the inorder traversal of its nodes' values.
*
*For example:
*Given binary tree [1,null,2,3],
*   1
*    \
*     2
*    /
*   3
*return [1,3,2].
*
*Note: Recursive solution is trivial, could you do it iteratively?
*
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
    
    public List<Integer> inorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        if(root == null){
            return list;
        }
        inorder(root);
        return list;
    }
    
    public void inorder(TreeNode root){
        if(root.left!=null){
            inorder(root.left);
        }
        list.add(root.val);
        if(root.right!=null){
            inorder(root.right);
        }
    }
    
}

