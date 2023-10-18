import java.util.ArrayDeque;

public class Tut_93_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> d=new ArrayDeque<>();
        d.add(1);
        System.out.println(d.isEmpty());
        d.addFirst(45);
        d.addLast(34);
        d.remove(1);
        System.out.println(d);
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
        }
    }
/*
false
[45, 34]
45
34
 */
