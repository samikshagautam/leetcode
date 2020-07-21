public class SameTree {
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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public TreeNode[] initTree() {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);
        root1.right.right.right = new TreeNode(25);

        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(9);
        root2.right = new TreeNode(22);
        root2.right.left = new TreeNode(15);
        root2.right.right = new TreeNode(7);
        root2.right.right.right = new TreeNode(25);

        TreeNode[] result = {root1, root2};

        return result;

    }


    public static void main(String[] args) {
        SameTree tree = new SameTree();
        TreeNode[] nodes = tree.initTree();
        boolean res = tree.isSameTree(nodes[0], nodes[1]);
        System.out.println(res);


    }


}
