class tester
{
	public static double ellipse(int a, int b)
	{
		final double pie = 3.14;
		
		double area = pie * a * b;
		return area;
	}
}

class ellipse33
{
	public static void main(String args[])
	{
		double x = tester.ellipse(6, 3);
		System.out.println(x);
	}
}