class tester
{
	public static void ellipse(int a, int b)
	{
		final double pie = 3.14;
		
		double area = pie * a * b;
		System.out.println(area);
	}
}

class ellipse22
{
	public static void main(String args[])
	{
		tester.ellipse(4, 2);
	}
}