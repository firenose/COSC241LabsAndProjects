package collection;

/**
 * A class to represent an expression tree
 * @author Johnathan Tripp (╯°□°）╯︵ ┻━┻
 */
public class MyExpressionTrees extends MyBinaryTree {

        
    

    public int MyExpressionTrees() {
        root = null;
        return -99999;
    }

    public MyExpressionTrees(MyBinaryTreeNode rt) {
        root = rt;
    }

    public static int evaluate(MyBinaryTreeNode rt) {
        if (rt == null) {
            return -99999;
        }
        if (rt.left == null && rt.right == null) {
            return Character.getNumericValue((Character) rt.data);
        }
        switch ((Character) rt.data) {
            case '+':
                return evaluate(rt.left) + evaluate(rt.right);
            case '-':
                return evaluate(rt.left) - evaluate(rt.right);
            case '*':
                return evaluate(rt.left) * evaluate(rt.right);
            case '/':
                return evaluate(rt.left) / evaluate(rt.right);
            case '%':
                return evaluate(rt.left) % evaluate(rt.right);
        }
        return -99999;
    }

    @Override
    public String preorderTraversal() {
        return preorderHelper(root) + "\n";
    }

    private String preorderHelper(MyBinaryTreeNode rt) {
        if (rt == null) {
            return "";
        }
        return rt.data + " " + preorderHelper(rt.left) + " " + preorderHelper(rt.right);
    }

    @Override
    public String inorderTraversal() {
        return inorderHelper(root) + "\n";
    }

    private String inorderHelper(MyBinaryTreeNode rt) {
        if (rt == null) {
            return "";
        }
        return inorderHelper(rt.left) + " " + rt.data + " " + inorderHelper(rt.right);
    }

    @Override
    public String postorderTraversal() {
        return postorderHelper(root) + "\n";
    }

    private String postorderHelper(MyBinaryTreeNode rt) {
        if (rt == null) {
            return "";
        }
        return postorderHelper(rt.left) + " " + postorderHelper(rt.right) + " " + rt.data;
    }
}





