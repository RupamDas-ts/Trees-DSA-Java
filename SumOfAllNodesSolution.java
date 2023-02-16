package Tree;

public class SumOfAllNodesSolution {

    /*	TreeNode structure
 *
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/

    private static int sumHelper(TreeNode<Integer> root, int sum){
        if(root == null){
            return 0;
        }
        if(root.children == null){
            return root.data;
        }
        for(TreeNode<Integer> i : root.children){
            sum = sum + sumHelper(i,0);
        }
        return root.data+sum;
    }
    public static int sumOfAllNode(TreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        return sumHelper(root,0);
    }
}
