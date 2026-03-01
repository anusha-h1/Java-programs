class simple
{
	void area(){
	int r=7;
	double area=3.14*r*r;
	System.out.println(area);
}
 void tris(){
	int b=8;
	int h=9;
	double area=0.5*b*h;
	System.out.println(area);
}
void tps(){
	int b=8;
	int a=4;
	int h=9;
	double area=0.5*(a+b)*h;
	System.out.println(area);
}
void sqs(){int a=7;
	int area=a*a;
	System.out.println(area);
}
void scs(){
	int r=8;
	int o=9;
	double area=0.5*r*o*r;
	System.out.println(area);
}
void res(){
	int w=8;
	int h=9;
	int area=w*h;
	System.out.println(area);
}
void pas(){
	int b=8;
	int h=9;
	int area=b*h;
	System.out.println(area);
}
 void els(){
	int a=8;
	int b=9;
	double area=3.14*b*a;
	System.out.println(area);
}
void cirm(int r){
	double area=3.14*r*r;
	System.out.println(area);
}
void elm(int a,int b){
	double area=3.14*a*b;
	System.out.println(area);
}
void pam(int b,int h){
	int area=b*h;
	System.out.println(area);
}
void rem(int w,int h){
	int area=w*h;
	System.out.println(area);
}
void scm(int r,int o){
	double area=0.5*r*o*r;
	System.out.println(area);
}
void sqm(int a){
	int area=a*a;
	System.out.println(area);
}
void tpm(int a,int b,int h){
	double area=0.5*(a*b)*h;
	System.out.println(area);
}
void trim(int a,int b){
	double area=0.5*a*b;
	System.out.println(area);
}
 double cirr(int r){
	double area=3.14*r*r;
	return area;
}
double elr(int a,int b){
	double area=3.14*a*b;
	return area;
}
int par(int b,int h){
	int area=b*h;
	return area;
}
int rer(int w,int h){
	int area=w*h;
	return area;
}
 double scr(int r,int o){
	double area=0.5*r*r*o;
	return area;
}
int sqr(int a){
	int area=a*a;
	return area;
}
double tpr(int a,int b,int h){
	double area=0.5*(a*b)*h;
	return area;
}
 double trir(int a,int b){
	double area=0.5*a*b;
	return area;
}
}
class demo
{
public static void main(String[] args){
	simple su=new simple();
	System.out.println("using the normal code");
	su.area();
	su.tris();
	su.tps();
	su.sqs();
	su.scs();
	su.res();
	su.pas();
	su.els();
	System.out.println("using the methods and paramters code");
	su.cirm(5);
	su.elm(3,9);
	su.pam(4,5);
	su.rem(3,8);
	su.scm(2,7);
	su.sqm(9);
	su.tpm(2,5,8);
	su.trim(5,9);
	System.out.println("using the return type");
	double cir=su.cirr(5);
	System.out.println(cir);
	double el=su.elr(5,8);
	System.out.println(el);
	int pa=su.par(3,8);
	System.out.println(pa);
	int re=su.rer(3,7);
	System.out.println(re);
	double sc=su.scr(5,9);
	System.out.println(sc);
	int sq=su.sqr(3);
	System.out.println(sq);
	double tp=su.tpr(5,3,7);
	System.out.println(tp);
	double tri=su.trir(5,3);
	System.out.println(tri);
}
}