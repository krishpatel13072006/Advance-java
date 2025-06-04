package _2_Generics;

public class colleges_ranking<T,s> implements details<T,s>{

    T rank;
    s name;


    @Override
    public void setname(T rank,s name) {

        this.rank=rank;
        this.name=name;
    }

    @Override
    public T gettname() {
        return rank;
    }


    @Override
    public s getsname() {
        return name;
    }


    public static void main(String[] args) {

        colleges_ranking<Integer,String> obj=new colleges_ranking<>();
        obj.setname(1,"Apollo Institute Of Engineering And Technology");
        System.out.println(obj.gettname()+" "+obj.getsname());
    }
}
