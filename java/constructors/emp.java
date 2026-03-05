class emp 
{
	int id;
	int sal;
	char grade;
	emp(int a,int b,char c){
		id=a;
		sal=b;
		grade=c;
	}
		
	public static void main(String[] args) 
	{
		emp b1=new emp(2334,500000,'A');
		System.out.println(b1.id);
		System.out.println(b1.sal);
		System.out.println(b1.grade);
	}
}
