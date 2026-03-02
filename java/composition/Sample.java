class Sample
{
	int javamock;
	static String in_name="jspiders";
	public static void main(String args[]){
		System.out.println("Institutte name is "+in_name);
		Sample s1=new Sample();
		s1.javamock=1;
		System.out.println("mock"+s1.javamock);
		Sample s2=new Sample();
		s2.javamock=2;
		System.out.println("mock s2"+s2.javamock);
		s2.javamock=1;
		System.out.println("mock s2"+s2.javamock);
}}