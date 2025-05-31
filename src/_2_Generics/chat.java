package _2_Generics;

public class chat<t>{

    private t day;
    private t message;

    chat(t day, t message){
        this.day=day;
        this.message=message;
    }

    public t day() {
        return day;
    }

    public t message() {

        return (t)("hey "+ message);
    }

    @Override
    public String toString() {
        return "days{" +
                "day=" + day +
                ", message=" + message +
                '}';
    }

    public static void main(String[] args) {
        System.out.println();
        chat<String> obj = new chat<>("Kalu ----(to darshil)","bhaya mai kesi lag rahi hu?");
        System.out.println(obj.day()+" : "+obj.message());
        System.out.println();


        chat<String> obj1 = new chat<>("Darhsil ---(ganne wale bahya)","ek dam kalenlag rahe ho madam!"+
                " App kaho to ganne ka juice laga du abhi abhi nikala hai madam khas apke liye " );
        System.out.println(obj1.day()+" : "+obj1.message());
        System.out.println();

        chat<String> obj3 = new chat<>("Hetansh---(drug dealer)","yee Niga chal ganne ka juice laga de!"+"Ganne ka juice Bada glass 20rs ka>>>");
        System.out.println(obj3.day()+" : "+obj3.message());
        System.out.println();

    }
}
