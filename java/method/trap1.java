class tester
{
	public static void trapezoid()
	{
		int a = 4;
		int b = 6;
		int h = 5;
		
		double area = 0.5 * (a + b) * h;
		System.out.println(area);
	}
}

class trap1
{
	public static void main(String args[])
	{
		tester.trapezoid();
	}
}