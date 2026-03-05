class tv
{
	int cost;
	String name;
	String colour;
	tv (int a , String b,String c)
	{	cost=a;
		name=b;
		colour=c;
	}
	public static void main(String args[]){
		tv t1=new tv(26000,"MI","Black");
		System.out.println(t1.cost);
		System.out.println(t1.name);
		System.out.println( t1.colour);
	}}