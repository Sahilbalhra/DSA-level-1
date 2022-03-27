// // 1. You are given a partially written BinaryTree class.
// // 2. You are given an element.
// // 3. You are required to complete the body of find and nodeToRoot function. The functions are expected to 
// //     3.1. find -> return true or false depending on if the data is found in binary tree.
// //     3.2. nodeToRoot -> returns the path from node (correspoding to data) to root in 
// //     form of an arraylist (root being the last element)
// // 4. Input iand Output is managed for you.

// // Sample Input
// // 19
// // 50 25 12 n n 37 30 n n n 75 62 n 70 n n 87 n n
// // 30
// // Sample Output
// // true
// // [30, 37, 25, 50]

// public class NodeToRootPath {
//     public static boolean find(Node node, int data){
//         // write your code here
//         if(node==null){
//             return false;
//         }
        
//         if(node.data==data){
//             return true;
//         }
        
//         boolean leftAns=find(node.left,data);
//         if(leftAns){
//             return true;
//         }
        
//         boolean rightAns=find(node.right,data);
//         if(rightAns){
//             return true;
//         }
//         return false;
//       }
    
//       public static ArrayList<Integer> nodeToRootPath(Node node, int data){
//         // write your code here
//         if(node==null){
//             return new ArrayList<>();
//         }
//         if(node.data==data){
//             ArrayList<Integer> base=new ArrayList<>();
//             base.add(node.data);
//             return base;
            
//         }
//         ArrayList<Integer> leftAns=nodeToRootPath(node.left,data);
//         if(leftAns.size()>0){
//             leftAns.add(node.data);
//             return leftAns;
//         }
        
//           ArrayList<Integer> rightAns=nodeToRootPath(node.right,data);
//          if(rightAns.size()>0){
//             rightAns.add(node.data);
//             return rightAns;
//         }
//         return new ArrayList<>();
//       }
    
// }
