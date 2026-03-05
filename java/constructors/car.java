class car 
{
	int cost;
	String name;
	String colour;
	car(int a,String b,String c){
		cost=a;
		name=b;
		colour=c;
	}
		
	public static void main(String[] args) 
	{
		car b1=new car(200000,"Suzuki","white");
		System.out.println(b1.cost);
		System.out.println(b1.name);
		System.out.println(b1.colour);
	}
}
