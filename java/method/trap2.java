class tester
{
	public static void trapezoid(int a, int b, int h)
	{
		double area = 0.5 * (a + b) * h;
		System.out.println(area);
	}
}

class trap2
{
	public static void main(String args[])
	{
		tester.trapezoid(3, 5, 4);
	}
}