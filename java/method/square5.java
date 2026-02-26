class tester
{
	public static double square() 
	{
	   int s = 4;
	   double area = s * s;
	   return area;
	}
}

class square5
{
	public static void main(String args[])
	{
		double x = tester.square();
		System.out.println(x);
	}
}