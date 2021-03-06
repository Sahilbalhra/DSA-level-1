// 1. You are given a partially written BinaryTree class.
// 2. You are required to complete the body of printSingleChildNodes function. The function is expected to print in separate lines, all such nodes which are only child of their parent. Use preorder for traversal.
// 3. Input and Output is managed for you.

// Sample Input
// 19
// 50 25 12 n n 37 30 n n n 75 62 n 70 n n 87 n n
// Sample Output
// 30
// 7


// public static void printSingleChildNodes(Node node, Node parent){
//     // null case
//     if(node==null){
//         return;
//     }
//     //one child case
//     if(node.left==null && node.right!=null){
//         System.out.println(node.right.data);
//     }
//     if(node.left!=null && node.right==null){
//         System.out.println(node.left.data);
//     }
//     //left call
//     printSingleChildNodes(node.left,parent);
//     //right call
//      printSingleChildNodes(node.right,parent);
    
//   }