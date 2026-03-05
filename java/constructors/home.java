class home 
{
	int cost;
	String name;
	String colour;
	home(int a,String b,String c){
		cost=a;
		name=b;
		colour=c;
	}
		
	public static void main(String[] args) 
	{
		home b1=new home(4544564,"Ghar","white");
		System.out.println(b1.cost);
		System.out.println(b1.name);
		System.out.println(b1.colour);
	}
}
