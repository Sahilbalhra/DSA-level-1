// 543. Diameter of Binary Tree
//leetCode
// class Solution {
//     public int height(TreeNode root){
//         return root == null ? -1: Math.max(height(root.left),height(root.right))+1;
//     }
//     public int diameterOfBinaryTree(TreeNode root) {
//       if(root==null)
//           return 0;
        
//        int ld=diameterOfBinaryTree(root.left);
//        int rd=diameterOfBinaryTree(root.right);
       
//         int lh=height(root.left);
//         int rh=height(root.right);
        
//         int myDia=lh+rh+2;
        
//         return Math.max(myDia,Math.max(ld,rd));
        
//     }
// }