class Employee
{
    int id;
    int salary;
    String grade;

    Employee(int a,int b,String c)
    {
        id=a;
        salary=b;
        grade=c;
    }

    public static void main(String[] args)
    {
        Employee e1=new Employee(101,35000,"Anant");

        System.out.println(e1.id);
        System.out.println(e1.salary);
        System.out.println(e1.grade);
    }
}