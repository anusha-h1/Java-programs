class demo2 {
    public static void main(String[] args) {

        Reference3 s1 = new Reference3();
        double x = s1.triangle(1, 2);
        int y = s1.rectangle(1, 2);
        int z = s1.square(2);
        int a = s1.parallelogram(1, 3);
        double b = s1.trapezoid(1, 2, 3);
        double c = s1.ellipse(1, 2);
        double d = s1.sector(4, 60);

    }
    // area of triangle

    double triangle(int b, int h) {
        final double c = 0.5;
        double area = c * b * h;
        System.out.println("the area of triangle is:" + area);
        return area;
    }

    // area of rectangle

    int rectangle(int a, int b) {
        int area = a * b;
        System.out.println("the area of rectangle is:" + area);
        return area;
    }

    // area of square

    int square(int a) {
        int area = a * a;
        System.out.println("the area of square:" + area);
        return area;
    }

    // area of parallelogram

    int parallelogram(int b, int h) {
        int area = b * h;
        System.out.println("the area of parallelogram is:" + area);
        return area;
    }

    // area of trapezoid

    double trapezoid(int a, int b, int h) {

        final double c = 0.5;
        double area = c * (a + b) * h;
        System.out.println("the area of trapezoid:" + area);
        return area;
    }

    double ellipse(int a, int b) {
        double pi = 3.14;
        double area = pi * a * b;
        System.out.println("the area of ellipse is:" + area);
        return area;
    }

    // Area of circle

    double circle(int r) {

        double pi = 3.14;
        double area = pi * r * r;
        System.out.println("the area of circle is:" + area);
        return area;
    }

    // area of sector

    double sector(int angle, int r) {
        double pi = 3.14;
        double area = (angle * pi * r * r) / 360;
        System.out.println("the area of sector is:" + area);
        return area;

    }
}