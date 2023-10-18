import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Tut_91_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>(5);
        l1.add(45);
        l1.add(1,3);
        l1.add(35);
        l2.add(5);
        l2.add(3);
        l1.remove(0);
        l1.add(0,23);
        l1.addAll(l2);
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
23
3
35
5
3
true
false
1
4

 */