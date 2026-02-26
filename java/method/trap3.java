class tester
{
	public static double trapezoid(int a, int b, int h)
	{
		double area = 0.5 * (a + b) * h;
		return area;
	}
}

class trap3
{
	public static void main(String args[])
	{
		double x = tester.trapezoid(6, 8, 5);
		System.out.println(x);
	}
}