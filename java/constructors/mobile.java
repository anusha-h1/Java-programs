class mobile 
{
	int cost;
	String name;
	String colour;
	mobile(int a,String b,String c){
		cost=a;
		name=b;
		colour=c;
	}
		
	public static void main(String[] args) 
	{
		mobile b1=new mobile(44264,"MI","white");
		System.out.println(b1.cost);
		System.out.println(b1.name);
		System.out.println(b1.colour);
	}
}
