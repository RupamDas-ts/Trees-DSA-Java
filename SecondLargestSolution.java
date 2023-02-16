package Tree;

class PairOfMax<T>{
    T max;
    T secondMax;
}
public class SecondLargestSolution {
    private static PairOfMax<TreeNode<Integer>> findSecondLargestHelper(TreeNode<Integer> root,
                                                                   PairOfMax<TreeNode<Integer>> pair){
        if(root == null){
            return pair;
        }
        if (pair.max == null){
            pair.max = root;
        } else if(root.data > pair.max.data){
            pair.secondMax = pair.max;
            pair.max = root;
        }else if((pair.secondMax == null || root.data > pair.secondMax.data) && root.data != pair.max.data){
            pair.secondMax = root;
        }
        for(TreeNode<Integer> i : root.children){
            pair = findSecondLargestHelper(i, pair);
        }
        return pair;
    }
    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
        // Write your code here
        return findSecondLargestHelper(root,new PairOfMax<>()).secondMax;
    }
}
