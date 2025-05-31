package _3_Collection_Framework._5_Hashmap;

import java.util.*;

public class Hello {

    public static void main(String[] args) {

        HashMap<Integer,String> obj = new HashMap<>(10,4);

        obj.put(1, "krish");
        obj.put(2, "rakshit");
        obj.put(3, "rakesh");
        obj.put(4, "rohan");
        obj.put(5, "lakshya");
        obj.put(6, "hetansh");
        obj.put(7, "darshil");
        obj.put(8, "priya");
        obj.put(9, null);

        System.out.println(obj.size());


        System.out.println(obj.get(1));

        obj.remove(8);

        System.out.println(obj.containsKey(4));

        System.out.println(obj.containsValue("priya"));

        for (String x : obj.values()) {
            System.out.print(x+" ");
        }

        for (Integer x : obj.keySet())
        {
            System.out.print(x+" ");
        }

        System.out.println(obj.isEmpty());

        obj.replace(5,"mahima");

        obj.putIfAbsent(9,"Manoj");

        System.out.println(obj);

        obj.clear();
        System.out.println(obj);


    }
}
