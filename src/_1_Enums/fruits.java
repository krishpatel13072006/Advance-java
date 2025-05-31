package _1_Enums;

 interface characteristics{

     public abstract void taste();
}

public enum fruits implements characteristics {

    mango("yellowish-orange")
            {
                public void taste()
                {
                    System.out.println("tastes sweet and little sour");
                }

                <T> void price() {
                    System.out.println(100+"rs");
                }
            },

    grapes("green")
            {
                @Override
                public void taste() {
                    System.out.println("tastes sour");
                }

                <T> void price() {
                    System.out.println(80+"rs");
                }
            },

    banana("yellow")
            {
                @Override
                <T> void price() {
                    System.out.println(60+"rs");
                }

                @Override
                public void taste() {
                    System.out.println("tastes sweet");
                }

            };

    String color;
    private fruits(String color)
    {
        this.color=color;
    }

    public String getColor() {
        return color;
    }

  abstract <T> void price();

    public static void main(String[] args) {

        fruits banana=fruits.banana;
        System.out.println(banana.getColor());;
        banana.taste();
        banana.price();

        fruits[] x=fruits.values();
        for (fruits val: x)
        {
            System.out.println(val);
        }

    }
}
