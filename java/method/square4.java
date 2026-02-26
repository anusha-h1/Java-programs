class tester
{
	public static void square(int side) 
	{
		double area = side * side;
		System.out.println(area);
	}
}

class square4
{
	public static void main(String args[])
	{
		tester.square(5);
	}
}