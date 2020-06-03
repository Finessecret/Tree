public class Main {

    public static void main(String[] args) throws Exception {
        DefaultBinaryTree<Integer> tree = new BinaryTree<Integer>(s -> Integer.parseInt(s));
        tree.fromBracketNotation("5 (4 , 7)");
        tree.solution();
        System.out.print(tree.toBracketStr());
    }
}
