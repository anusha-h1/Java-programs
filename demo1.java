class demo1 {
	double pi = 3.14;

	public static void main(String[] args) {
		Reference1 s1 = new Reference1();
		s1.triangle(1, 2);
		s1.rectangle(1, 2);
		s1.square(2);
		s1.parallelogram(1, 3);
		s1.trapezoid(1, 2, 3);
		s1.ellipse(1, 2);
		s1.sector(4, 60);
	}

	void triangle(int b, int h) {

		double area = 0.5 * b * h;
		System.out.println("the area of triangle is:" + area);
	}

	void rectangle(int b, int h) {
		double area = b * h;
		System.out.println("the area of rectangle is:" + area);
	}

	void square(int a) {
		int area = a * a;
		System.out.println("the area of square is:" + area);
	}

	void parallelogram(int b, int h) {
		int area = b * h;
		System.out.println("the area of parallelogram:" + area);
	}

	void trapezoid(int a, int b, int h) {
		double area = 0.5 * (a + b) * h;
		System.out.println("the area of trapezoid is:" + area);
	}

	void ellipse(int a, int b) {
		double area = pi * a * b;
		System.out.println("the area of ellipse is:" + area);
	}

	void sector(int r, int angle) {
		double area = (pi * r * r * angle) / 360;
		System.out.println("the area of ellipse is:" + area);
	}

}