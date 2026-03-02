class mobile1   
{
	   
	static String brand="samsung";
		int cost;
		String colour;
		String model;
	
	static String car_name="benz";
		int car_cost;
		String car_colour;
		
	static String company="dell";
	int laptop_cost;
	String color;
	
	static  String school_name="jspider";
	int course_cost;
	String course;
		
	static  String country="india";
	int home_cost;
	String home_name;
	
	static  String bike_brand="pulsur";
	int bike_cost;
	String bike_colour;
	
	
	static  String univer_name="jain";
	 String course_name;
	int courses_cost;
	
		
	
		
		
	public static void main(String[] args) 
	{
		System.out.println("mobile brand is: "+brand);
		mobile1 m1=new mobile1();
		m1.cost=20000;
		System.out.println("mobile cost is :"+m1.cost);
		m1.colour="blue";
		System.out.println("mobile colour is :"+m1.colour);
		m1.model="galaxy 267";
		System.out.println("mobile model is :"+m1.model);
		m1.cost=30000;
		System.out.println("mobile cost is :"+m1.cost); 
	    System.out.println(""); 
	
		System.out.println("car name :"+car_name);
		mobile1 m2=new mobile1();
		m2.car_cost=40000;
		System.out.println("car cost is :"+m2.car_cost); 
		m2.car_colour="red";
		System.out.println("car colour  is :"+m2.car_colour); 
		System.out.println(""); 
		 
		 System.out.println("laptop company is: "+company);
		 mobile1 m3=new mobile1();
		m3.laptop_cost=50000;
		System.out.println("laptop cost is :"+m3.laptop_cost); 
		m3.colour="red";
		System.out.println("laptop colour  is :"+m3.colour); 
		System.out.println(""); 
		
		 System.out.println("school name is: "+school_name);
		 mobile1 m4=new mobile1();
		m3.course_cost=10000;
		System.out.println("course cost is :"+m3.course_cost); 
		m3.course="java";
		System.out.println("course  is :"+m3.course); 
		System.out.println("");
		
		 System.out.println("country  is: "+country);
		 mobile1 m5=new mobile1();
		m5.home_cost=1000;
		System.out.println("home cost is :"+m5.home_cost); 
		m5.home_name="java nivas";
		System.out.println("home name   is :"+m5.home_name); 
		System.out.println("");
	
	    System.out.println("bike brand   is: "+bike_brand);
		 mobile1 m6=new mobile1();
		m6.bike_cost=100000;
		System.out.println("bike cost is :"+m6.bike_cost); 
		m6. bike_colour="red";
		System.out.println("home name   is :"+m6. bike_colour); 
		System.out.println("");
		
		  System.out.println(" univer name  is: "+ univer_name);
		 mobile1 m7=new mobile1();
		m7.courses_cost=100000;
		System.out.println("cost is :"+m6.courses_cost); 
		m7.course_name ="full stack";
		System.out.println("course name    is :"+m7.course_name); 
		System.out.println("");
	
		
	}
}