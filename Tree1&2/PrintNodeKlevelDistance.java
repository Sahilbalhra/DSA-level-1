// 1. You are given a partially written BinaryTree class.
// 2. You are given a value data and a value k.
// 3. You are required to complete the body of printKNodesFar function. The function is expected to print all nodes which are k distance away in any direction from node with value equal to data.
// 4. Input is managed for you.

// Sample Input
// 19
// 50 25 12 n n 37 30 n n n 75 62 n 70 n n 87 n n
// 37
// 2
// Sample Output
// 12
// 50

// public static ArrayList<Node> nodeToRootPath(Node node, int data) {
//     if (node == null) {
//       return new ArrayList<>();
//     }

//     if (node.data == data) {
//       ArrayList<Node> base = new ArrayList<>();
//       base.add(node);
//       return base;
//     }

//     ArrayList<Node> leftAns = nodeToRootPath(node.left, data);
//     if (leftAns.size() > 0) {
//       leftAns.add(node);
//       return leftAns;
//     }
//     ArrayList<Node> rightAns = nodeToRootPath(node.right, data);
//     if (rightAns.size() > 0) {
//       rightAns.add(node);
//       return rightAns;
//     }
//     return new ArrayList<>();
//   }

//   public static void printklevelDown(Node node, int k, Node blocker) {
//     if (node == null || k < 0 || node == blocker) {
//       return;
//     }

//     if (k == 0) {
//       System.out.println(node.data);
//     }
//     printklevelDown(node.left, k - 1, blocker);
//     printklevelDown(node.right, k - 1, blocker);


//   }

//   public static void printKNodesFar(Node node, int data, int k) {
//     // write your code here
//     ArrayList<Node> n2r=nodeToRootPath(node,data);
//       Node blocker=null;
    
//     for(int i=0;i<n2r.size();i++){
//         Node n=n2r.get(i);
//         printklevelDown(n,k-i,blocker);
//         blocker=n;
        
//     }
//   }
