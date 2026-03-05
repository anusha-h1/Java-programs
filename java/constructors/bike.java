class bike 
{
	int cost;
	String name;
	String colour;
	bike(int a,String b,String c){
		cost=a;
		name=b;
		colour=c;
	}
		
	public static void main(String[] args) 
	{
		bike b1=new bike(45564,"Royal Enfield","Black");
		System.out.println(b1.cost);
		System.out.println(b1.name);
		System.out.println(b1.colour);
	}
}
