import java.util.HashSet;

public class Tut_95_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        h.add(34);
        h.add(23);
        System.out.println(h);
        System.out.println(h.isEmpty());
        System.out.println(h.size());
        System.out.println(h.contains(23));
        h.remove(34);
        System.out.println(h);
    }
}
/*
[34, 23]
false
2
true
[23]
 */