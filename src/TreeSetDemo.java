import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(55);
        treeSet.add(44);
        treeSet.add(97);
        treeSet.add(67);
        System.out.println(treeSet);
        System.out.println("treeSet.first() = " + treeSet.first());
        System.out.println("treeSet.last() = " + treeSet.last());
        System.out.println("treeSet.pollFirst() = " + treeSet.pollFirst());
        System.out.println("treeSet.pollLast() = " + treeSet.pollLast());
        System.out.println(treeSet);
    }
}
