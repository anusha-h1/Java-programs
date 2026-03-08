class Cloth
{
    String colour;
    int cost;
    String size;

    Cloth(String a,int b,String c)
    {
        colour=a;
        cost=b;
        size=c;
    }

    public static void main(String[] args)
    {
        Cloth c1=new Cloth("Red",800,"L");

        System.out.println(c1.colour);
        System.out.println(c1.cost);
        System.out.println(c1.size);
    }
} 