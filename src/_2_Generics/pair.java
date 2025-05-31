package _2_Generics;

public class pair <k,v>{

    private k key;
    private v value;

    public pair(k key,v value) {
        super();
        this.key = key;
        this.value=value;
    }

    public k getKey() {
        return key;
    }

    public void setKey(k key) {
        this.key = key;
    }

    public v getValue() {
        return value;
    }

    public void setValue(v value) {
        this.value = value;
    }

    public static void main(String[] args) {
        pair<String,Integer> obj=new pair<>("krish",19);
        System.out.println("Name is "+obj.getKey()+"  Age is "+obj.getValue());

        pair<Float,String> x=new pair<>(4f, "radius of circle is : ");
        System.out.println(x.getValue()+""+x.getKey());

    }
}
