package Tree;

import BinaryTree.BinaryTreeNode;

public class FindHeightSolution {
    public static int getHeight(TreeNode<Integer> root){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if(root == null){
            return 0;
        }
//        if(root.children == null){
//            return 1;
//        }
        int height = 0;
        for(TreeNode<Integer> i : root.children){
            height = Math.max(height, getHeight(i));
        }
        return height+1;
    }
}
