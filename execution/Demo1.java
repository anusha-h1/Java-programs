class Demo1 {
    public double details(String name, int id, double radius, double angle) {

        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        double area = (angle * 3.14 * radius * radius) / 360;
        return area;
    }

    public static void main(String args[]) {
        Demo1 d1 = new Demo1();
        double result = d1.details("Rahul", 101, 7, 60);
        System.out.println("Area of Sector = " + result);
    }
}