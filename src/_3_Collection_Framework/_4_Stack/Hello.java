package _3_Collection_Framework._4_Stack;

import java.util.Stack;

public class Hello {

    public static void main(String[] args) {

        Stack<Integer> obj=new Stack<>();
        //
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        System.out.println(obj);

        obj.pop();
        System.out.println(obj);
        obj.removeFirst();
        System.out.println(obj);

        System.out.println(obj.peek());

        System.out.println(obj.isEmpty());

        System.out.println(obj.search(3));

        for(int i:obj)
        {
            System.out.println(i);
        }
    }
}
