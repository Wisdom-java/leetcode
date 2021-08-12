package com.ibm.leetcode;

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};

public class LeetCode2042 {

    class Solution {
        Node pre,head;
        public Node treeToDoublyList(Node root) {
            if(root == null){
                return null;
            }
            dfs(root);
            pre.right = head;
            head.left = pre;
            return head;
        }
        //中序遍历
        public void dfs(Node current){
            if(current == null){
                return;
            }
            dfs(current.left);
            if(pre != null){
                pre.right = current;
            }else{
                head = current;
            }
            current.left = pre;
            pre = current;
            dfs(current.right);
        }
    }
}
