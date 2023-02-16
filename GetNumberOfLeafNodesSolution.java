package Tree;

public class GetNumberOfLeafNodesSolution {
    public static int countLeafNodes(TreeNode<Integer> root){

        // Write your code here
        if(root == null){
            return 0;
        }
        QueueUsingLL<TreeNode<Integer>> queue = new QueueUsingLL<>();
        queue.enqueue(root);
        int count = 0;
        while (!queue.isEmpty()){

            try{
                TreeNode<Integer> temp = queue.dequeue();

                for(TreeNode<Integer> i : temp.children){
                    queue.enqueue(i);
                }
                if(temp.children.size() == 0){
                    count++;
                }
            }catch (Exception e) {

            }
        }
        return count;

    }
}
