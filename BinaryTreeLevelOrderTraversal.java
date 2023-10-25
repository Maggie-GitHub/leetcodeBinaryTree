import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrderBottom (TreeNode root){
        List<List<Integer>> resList = new LinkedList<List<Integer>>();
        if(root == null){
            return resList;
        }
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(root);

        while(!que.isEmpty()){
            List<Integer> temp = new LinkedList<>();
            int size = que.size();
            for(int i = 0; i < size; i++){
                TreeNode node = que.poll();
                temp.add(0, node.val);

                if(node.right != null){
                    que.offer(right);
                }
                if(node.left != null){
                    que.offer(left);
                }
            }
            resList.add(0, temp);
        }
        return resList;
    }
}
