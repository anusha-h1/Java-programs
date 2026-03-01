class demo {
	int b = 10, h = 20, a = 10;
	double pi = 3.14;

	public static void main(String[] args) {
		Reference s1 = new Reference();
		s1.triangle();
		s1.rectangle();
		s1.square();
		s1.parallelogram();
		s1.trapezoid();
		s1.ellipse();
		s1.sector();
		s1.circle();
	}

	void triangle() {
		int b = 10, h = 20;
		double area = 0.5 * b * h;
		System.out.println("the area of triangle is:" + area);
	}

	void rectangle() {
		double area = b * h;
		System.out.println("the area of rectangle is:" + area);
	}

	void square() {
		int area = a * a;
		System.out.println("the area of square is:" + area);
	}

	void parallelogram() {
		int area = b * h;
		System.out.println("the area of parallelogram:" + area);
	}

	void trapezoid() {
		double area = 0.5 * (a + b) * h;
		System.out.println("the area of trapezoid is:" + area);
	}

	void ellipse() {
		double area = pi * a * b;
		System.out.println("the area of ellipse is:" + area);
	}

	void sector() {
		int angle = 30, r = 3;
		double area = (pi * r * r * angle) / 360;
		System.out.println("the area of ellipse is:" + area);
	}

	void circle() {
		int r = 5;
		double area = pi * r * r;
		System.out.println("the area of circle is: " + area);
	}

}