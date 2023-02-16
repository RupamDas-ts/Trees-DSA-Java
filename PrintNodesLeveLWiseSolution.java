package Tree;

public class PrintNodesLeveLWiseSolution {
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



    public static void printLevelWise(TreeNode<Integer> root){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */
        if(root == null){
            return;
        }
        QueueUsingLL<TreeNode<Integer>> queue = new QueueUsingLL<>();
        queue.enqueue(root);
        int count = 1; //Keeps the track of the levels
        while (!queue.isEmpty()){
            if(count == 0){
                System.out.println();
                count = queue.size();
            }
            try{
                TreeNode<Integer> temp = queue.dequeue();

                for(TreeNode<Integer> i : temp.children){
                    queue.enqueue(i);
                }
                System.out.print(temp.data+" ");
                count--;
            }catch (Exception e) {

            }
        }
    }
}
