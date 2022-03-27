// leetCode
// 236. Lowest Common Ancestor of a Binary Tree


// public class LowestCommonAncestor {
//     public static ArrayList<TreeNode> nodeToRootPath(TreeNode node, int data){
//         // write your code here
//         if(node==null){
//             return new ArrayList<>();
//         }
//         if(node.val==data){
//             ArrayList<TreeNode> base=new ArrayList<>();
//             base.add(node);
//             return base;
            
//         }
//         ArrayList<TreeNode> leftAns=nodeToRootPath(node.left,data);
//         if(leftAns.size()>0){
//             leftAns.add(node);
//             return leftAns;
//         }
        
//           ArrayList<TreeNode> rightAns=nodeToRootPath(node.right,data);
//          if(rightAns.size()>0){
//             rightAns.add(node);
//             return rightAns;
//         }
//         return new ArrayList<>();
//       }
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//           ArrayList<TreeNode> pN2R=nodeToRootPath(root ,p.val);
//           ArrayList<TreeNode> qN2R=nodeToRootPath(root ,q.val);
        
//         int i=pN2R.size()-1;
//         int j=qN2R.size()-1;
//         TreeNode lca=null;
        
//         while(i>=0&&j>=0){
//             if(pN2R.get(i) != qN2R.get(j)){
//                 break;
//             }
//             lca=pN2R.get(i);
//             i--;
//             j--;
            
//         }
//        return lca;
//     }
    
// }
