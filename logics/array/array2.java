class array2
{
public static void main(String args[]){
double [] arr=new double[5];
arr[0]=2.90;
arr[2]=4.08;
System.out.println("Output"+arr[0]);
System.out.println("Output"+arr[2]);


float [] arr2=new float[4];
arr2[1]=0.02882f;
arr2[2]=82.2998182f;
System.out.println(arr2[1]);
System.out.println(arr2[2]);

char[] arr3=new char[4];
arr3[3]='A';
arr3[2]='B';
arr3[1]='C';
System.out.println(arr3[3]);
System.out.println(arr3[2]);
System.out.println(arr3[1]);

boolean[]str4=new boolean[2];
str4[0]=true;
str4[1]=false;
System.out.println("\n"+str4[0]);
System.out.println(str4[1]);

long[]arr5=new long[4];
arr5[2]=333l;
System.out.println(arr5[2]);

String[]arr6=new String[7];
arr6[2]="hello";
arr6[4]="hi";
System.out.println(arr6[2]);
System.out.println(arr6[4]);

int[]arr7=new int[3];
arr7[0]=2;
arr7[1]=4;
arr7[2]=8;
for (int i=0;i<3 ;i++ )
{
	System.out.println(arr7[i]);
}

}
}
