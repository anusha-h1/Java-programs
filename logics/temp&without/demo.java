
class Trapezoid {

    public double area(int a, int b, int h) {
        double res = 0.5 * (a + b) * h;
        return res;
    }

    public static void main(String args[]) {
        Trapezoid t = new Trapezoid();
        double result = t.area(4, 5, 6);
        System.out.println("Area of Trapezoid = " + result);
    }
}