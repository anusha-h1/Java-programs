class tester
{
	public static double rectangle(int l, int b) 
	{
	   double area = l * b;
	   return area;
	}
}

class rect33
{
	public static void main(String args[])
	{
		double x = tester.rectangle(7, 2);
		System.out.println(x);
	}
}