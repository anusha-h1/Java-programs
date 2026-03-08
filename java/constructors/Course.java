class Course
{
    String name;
    String university;
    int examcost;

    Course(String a,String b,int c)
    {
        name=a;
        university=b;
        examcost=c;
    }

    public static void main(String[] args)
    {
        Course c1=new Course("Java","VTU",1200);

        System.out.println(c1.name);
        System.out.println(c1.university);
        System.out.println(c1.examcost);
    }
}