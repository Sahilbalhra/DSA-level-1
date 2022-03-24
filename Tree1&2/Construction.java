import java.util.*;

public class Construction {

    public static class Node {
        int val;
        int left;
        int right;

        Node() {
        }

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node left, Node right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static class pair {
        Node node;
        int state;

        pair() {
        }

        pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }

    }

    public static void main(String[] args) {
        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };
        Stack<pair> st = new Stack<>();
        pair rootPair = new pair(arr[0], 1);
        int idx = 1;

        while (st.size() != 0) {
            pair peekPair = st.peek();

            if (peekPair.state == 1) {
                if (arr[idx] != null) {
                    Node leftChild = new Node(arr[idx]);
                    peekPair.node.left = leftChild;
                    st.push(new pair(leftChild, 1));
                }
                idx++;
            } else if (peekPair.state == 2) {
                if (arr[idx] != null) {
                    Node rightChild = new Node(arr[idx]);
                    peekPair.node.left = rightChild;
                    st.push(new pair(rightChild, 1));
                }
                idx++;
            } else {
                st.pop();
            }
        }

    }

}
