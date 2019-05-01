package collection;

/**
 * A class to represent an expression tree
 * @author Johnathan Tripp (╯°□°）╯︵ ┻━┻
 */
public class MyExpressionTree extends MyBinaryTree {

    public MyExpressionTree() {
        root = null;
    }

    public MyExpressionTree(MyBinaryTreeNode rt) {
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
            case '-':
                return evaluate(rt.left) - evaluate(rt.right);
            case '+':
                return evaluate(rt.left) + evaluate(rt.right);
            case '*':
                return evaluate(rt.left) * evaluate(rt.right);
            case '/':
                return evaluate(rt.left) / evaluate(rt.right);
            case '%':
                return evaluate(rt.left) % evaluate(rt.right);
        }
        return -99999;
    }

}

