class laptop 
{
	int cost;
	String name;
	String colour;
	laptop(int a,String b,String c){
		cost=a;
		name=b;
		colour=c;
	}
		
	public static void main(String[] args) 
	{
		laptop b1=new laptop(444564,"HP","white");
		System.out.println(b1.cost);
		System.out.println(b1.name);
		System.out.println(b1.colour);
	}
}
