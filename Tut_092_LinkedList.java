import java.util.LinkedList;

public class Tut_92_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        l1.add(45);
        l1.add(1,3);
        l1.add(35);
        l2.add(5);
        l2.add(3);
        l1.remove(0);
        l1.add(0,23);
        l1.addAll(l2);
        l1.addLast(3455);
        l1.addFirst(22222);
        for (Integer integer : l1) {
            System.out.println(integer);
        }
        System.out.println(l1.contains(5));
        System.out.println(l1.isEmpty());
        System.out.println(l1.indexOf(3));
        System.out.println(l1.lastIndexOf(3));
    }
}
/*
22222
23
3
35
5
3
3455
true
false
2
5
 */