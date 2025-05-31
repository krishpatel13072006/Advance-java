package _3_Collection_Framework._3_Vector;

import java.util.*;

public class Helloo {

    public static void main(String[] args) {
        Vector<Integer> obj= new Vector<>(10,3);


        obj.addFirst(1);
        obj.addLast(4);
        System.out.println(obj);
        obj.add(1,3);
        obj.add(0,0);
        System.out.println(obj);

        obj.removeAll(Arrays.asList(0,1));


        System.out.println(obj.reversed());

        System.out.println(obj.isEmpty());

        obj.set(0,1);
        System.out.println(obj);

        for(int x: obj)
        {
            System.out.println(x);
        }

        System.out.println(obj.contains(1));
        System.out.println(obj.containsAll(List.of(1,4)));

        Collections.sort(obj.reversed());
        System.out.println(obj);

        obj.clear();
        System.out.println(obj);




    }
}
