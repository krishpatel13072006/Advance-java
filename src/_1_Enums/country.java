package _1_Enums;

public enum country {

    india("indian")
            {
                @Override
                public void culture() {
                    System.out.println("Indian culture");
                }
            },australia("austrilian")
            {
                public void culture() {
                    System.out.println("Austrilian culture");
                }
            },america("american")
            {
                public void culture() {
                    System.out.println("American culture");
                }
            };

    String msg;
    private country(String msg)
    {
        this.msg=msg;
    }

    public String msg() {
        return msg;
    }

    public abstract void culture();
    public static void main(String[] args) {

        country indain=country.india;
        indain.culture();
        System.out.println(indain.msg());
        System.out.println(indain.ordinal());

        country x[]=country.values();
        for (country n:x)
        {
            System.out.println(n);
        }
    }
}
