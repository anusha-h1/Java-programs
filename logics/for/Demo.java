class Demo
{
public static void para(int start,int end){
for(int i=start; i<=end; i++){
System.out.print(i);

}
System.out.println();
for (int i=end;i>=start ;i-- )
{
	System.out.print(i);
}
System.out.println();
for (int i=start;i<=end ;i++ )
{
	if(i<=3)
	System.out.print(i);}
	System.out.println();

for(int i=end;i>=start;i--)
	{
		if(i<=3)
		System.out.print(i);
	}
	System.out.println();
for(int i=start;i<=end;i++){
	if(i>3)
	System.out.print(i);
}
System.out.println();
for(int i=end;i>=start;i--)
	{
	if(i>=4)
		System.out.print(i);
	}
	System.out.println();
for(int i=start;i<=end;i++)
	if(i%2==0)
	System.out.print(i);
System.out.println();
for(int i=end;i>=start;i--)
	if(i%2==0)
	System.out.print(i);
System.out.println();
for(int i=start;i<=end;i++)
	if(i%2!=0)
	System.out.print(i);
System.out.println();

for(int i=end;i>=start;i--)
	if(i%2!=0)
	System.out.print(i);
System.out.println();
}
public static void main(String args[])
{
Demo.para(1,6);
}}