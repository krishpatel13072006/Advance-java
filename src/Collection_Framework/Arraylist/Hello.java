package Collection_Framework.Arraylist;

import java.util.*;

class ordername implements Comparator<String>
{

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}

public class Hello implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {

        return o2 - o1;
    }
    public static void main(String[] args) {

        List<String> a1=new ArrayList<>();
        a1.add("Amit");
        a1.add("Bansri");
        a1.add("Crish");
        a1.addLast("hanji");
        a1.addFirst("rahul");

        Collections.sort(a1,new ordername());
        System.out.println(a1);

        //iterate
        /*for(String s:a1)
        {
            System.out.println(s);
        }*/

        //remove
        /*a1.remove("hii");
        a1.remove(1);
        a1.removeLast();
        a1.removeFirst();
        System.out.println(a1);*/

//        System.out.println(a1.size());

//        System.out.println(a1.contains("hi"));

        //fixed list
        List<Integer> list= Arrays.asList(12,3,4,2,35,4,6,5,7,84,67,3,6);
        ArrayList<Integer> num =new  ArrayList<>(list);
        Collections.sort(num);
        System.out.println(num);

        List<Integer> xyz= List.of(12,3,4,2,35,4,6,5,7,84,67,3,6);
        ArrayList<Integer> num2 =new  ArrayList<>(xyz);
        num2.addLast(23 );
        System.out.println(num2);

        Collections.sort(num2,new Hello());
        System.out.println(num2);






    }


}

