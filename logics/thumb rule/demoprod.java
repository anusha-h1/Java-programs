class  demoprod
{
	public static void para(int start,int end)
	{
	int product=1;
	for(int i=start;i<= end;i++)
		product=product*i;
		System.out.println(product);}
	public static void main(String[] args){ 
		demoprod.para(1,6);
}}
