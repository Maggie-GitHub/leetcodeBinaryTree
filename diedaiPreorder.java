import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class diedaiPreorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);//add root into stack
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();//pop root out from the stack
            result.add(node.val);//result add the root node
            if(node.right != null){
                stack.push(node.right);
            }
            if(node.left != null){
                stack.push(node.left);
            }
        }
        return result;
    }
}
