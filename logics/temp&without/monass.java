import java.util.Scanner;
class monass
{  static double cir(int r){
	double area=3.14*r*r;
	return area;
}
double tri(int b,int h){
	double area = 0.5*b*h;
	return area;
}
	public static void main(String[] args){
	
	Scanner bh = new Scanner(System.in);
	monass su = new monass();
	System.out.println("enter the student name");
	String name = bh.nextLine();
	System.out.println("enter the student id");
	int id = bh.nextInt();
	System.out.println("enter the student section");
	char section = bh.next().charAt(0);
	System.out.println(name);
	System.out.println(id);
	System.out.println(section);
	System.out.println("enter the value for radius");
	int r=bh.nextInt();
	double y=cir(5);
	System.out.println("the area of circle is"+"  "+y);
	System.out.println("enter the base value for triangle");
	int b=bh.nextInt();
	System.out.println("enter the height value for triangle");
	int h=bh.nextInt();
	double z=su.tri(b,h);
	System.out.println("the area of triangle is "+"  "+z);
	
}
}