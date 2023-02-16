package Tree;
class Pair<T>{
    int sum;
    T node;
    Pair(int sum, T node){
        this.sum = sum;
        this.node = node;
    }
}
public class NodeWithMaxSumSolution {
    private static Pair<TreeNode<Integer>> maxSumNodeHelper(TreeNode<Integer> root){
        if(root == null){
            return null;
        }
        int newSum = root.data;
        for(TreeNode<Integer> i : root.children){
            newSum = newSum + i.data;
        }
        Pair<TreeNode<Integer>> pair = new Pair<>(newSum, root);
//        pair.sum = newSum;
//        pair.node = root;
        for(TreeNode<Integer> i : root.children){
            Pair<TreeNode<Integer>> newPair = maxSumNodeHelper(i);
            if(newPair.sum > pair.sum){
                pair = newPair;
            }
        }
        return pair;
    }
    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
        // Write your code here
        return maxSumNodeHelper(root).node;
    }
}
