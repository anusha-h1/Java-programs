class prime 
{
	public static void main(String[] args) 
	{
		int a=7;
		boolean flag=true;
		if (a<=1)
		{
		flag = false;
		}
		else
		    for (int i=2;i<=(a/2) ;i++ )
		    {
			if(a%2==0)
				
				{
					flag=false;
					break;
		    }}
			if (flag)
			{
		System.out.println("prime");
			}
			else
				System.out.println("not");
	}
}
