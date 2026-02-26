class Sector{
void area(int r, int theta )
{
	

double res=0.5*r*r*theta;
System.out.println(res);
}
public static void main(String args[])
{
new Sector().area(3,60);
}}