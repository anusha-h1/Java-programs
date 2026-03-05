class trapezoid {
    public double area(int a, int b, int h) {
        double result = 0.5 * (a + b) * h;
        return result;
    }
class demo2
{
    public static void main(String args[]) {
        trapezoid t1 = new trapezoid();
       double res = t1.area(10, 8, 5);
        System.out.println("Area of Trapezoid = " + res);
    }
}}
