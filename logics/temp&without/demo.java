class demo 
{
	public void print(int a,int b,int temp){
	     temp=a;
	     a=b;
		 b=temp;
		 System.out.println(a);
		 System.out.println(b);
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		new demo().print(1,2,0 );
		System.out.println();
	}
}
