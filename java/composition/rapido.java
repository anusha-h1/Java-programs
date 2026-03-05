class rapido
{static void raid(int pin){
	System.out.println("otp for the ride");
}
static void raid(String name){
	System.out.println("name of the raider");
}
static void raid(int no,String name){
	System.out.println("number of the customer and name of the customer");
}
static void raid(String name,int no){
	System.out.println(" name of the customer and number of the customer");
}
public static void main(String[] args){
	rapido.raid(1234);
	rapido.raid("deepak");
	rapido.raid(12344,"deepak");
	rapido.raid("deepak",67788);
}
}