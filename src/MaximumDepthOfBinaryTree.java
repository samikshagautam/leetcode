import org.w3c.dom.Node;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumDepthOfBinaryTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        Deque<TreeNode> dq = new ArrayDeque<>();
        int depth = 0, next = 0;
        TreeNode curr;
        dq.offer(root);

        while(!dq.isEmpty()){
            depth++;
            next = dq.size();
            for(int i = 0 ; i < next ; ++i){
                curr = dq.poll();
                if(curr.left != null) {
                    dq.offer(curr.left);
                }
                if(curr.right != null){
                    dq.offer(curr.right);
                }
            }
        }
        return depth;
    }

    public TreeNode initTree() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(25);

        return root;
    }

    public static void main(String[] args){
        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
        int max = maximumDepthOfBinaryTree.maxDepth(maximumDepthOfBinaryTree.initTree());
        System.out.println(max);
    }

}


