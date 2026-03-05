class demo {
    public double course(String c_name, int c_cost, int duration) {
        System.out.println("Course name is " + c_name);
        System.out.println("Course cost is " + c_cost);
        System.out.println("Course duration is " + duration + " months");
        return c_cost;   
    }
    public static void main(String args[]) {
        demo c1 = new demo();  
        double result = c1.course("Java", 20000, 3);
        System.out.println("Returned value: " + result);
    }
}
