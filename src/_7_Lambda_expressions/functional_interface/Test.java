package _7_Lambda_expressions.functional_interface;
import _7_Lambda_expressions.Hello;


@FunctionalInterface
interface show{
    abstract void getmsg();
}

@FunctionalInterface
interface sum {
    public abstract void getadd(int a,int b);
}

@FunctionalInterface
interface print{
    public abstract void len(String str);
}


public class Test {

    public static void main(String[] args) {

        show s1=new show(){
            public void getmsg()
            {
                System.out.println("msg method of Show interface");
            }
        };
        s1.getmsg();


        print p1=new print() {
            @Override
            public void len(String str) {
                System.out.println(str.length());
            }
        };
        p1.len("krish");

        sum obj=(a,b)-> System.out.println(a+b);
        obj.getadd(2,3);
    }
}

