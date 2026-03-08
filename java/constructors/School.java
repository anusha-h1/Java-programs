class School
{
    String name;
    String grade;
    int strength;

    School(String a,String b,int c)
    {
        name=a;
        grade=b;
        strength=c;
    }

    public static void main(String[] args)
    {
        School s1=new School("ABC School","A",1200);

        System.out.println(s1.name);
        System.out.println(s1.grade);
        System.out.println(s1.strength);
    }
}