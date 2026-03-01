import java.util.Scanner;
public class studentdet
{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your name");
		String c=sc.nextLine();
		System.out.println("Enter your grade");
		int a=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your section");
	     char b=sc.next().charAt(0);
		 System.out.println("name:"+c+"grade"+a+"section"+b);
	}}