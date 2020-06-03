public class Main {

    public static void main(String[] args) throws Exception {
        DefaultBinaryTree<Integer> tree = new BinaryTree<Integer>(s -> Integer.parseInt(s));
        tree.fromBracketNotation("8 (6 (4 (5), 6), 5 (, 5 (2, 8)))");
        tree.solution();
        System.out.print(tree.toBracketStr());
    }
}
