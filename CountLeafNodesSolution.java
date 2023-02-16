package Tree;

public class CountLeafNodesSolution {
    public static int countLeafNodes(TreeNode<Integer> root){

        // Write your code here
        if(root == null){
            return 0;
        }
        if(root.children.size() == 0){
            return 1;
        }
        int count = 0;
        for(TreeNode<Integer> i : root.children){
            count = count + countLeafNodes(i);
        }
        return count;
    }
}
