package net.ukr.silentpriest;

public class Triangle {
	private double length1;
	private double length2;
	private double length3;
	

	public Triangle(double length1, double length2, double length3) {
		super();
		this.length1 = length1;
		this.length2 = length2;
		this.length3 = length3;
	
	}

	public double getLength1()  {
		return length1;
	}

	public void setLength1(double length1) {
		this.length1 = length1;
	}

	public double getLength2() {
		return length2;
	}

	public void setLength2(double length2) {
		this.length2 = length2;
	}

	public double getLength3() {
		return length3;
	}

	public void setLength3(double length3) {
		this.length3 = length3;
	}

	void Area() {
		double p = 0.5 * (getLength1() + getLength2() + getLength3());
		double a = Math.sqrt((p * (p - getLength1()) * (p - getLength2()) * (p - getLength3())));
		System.out.println("Площадь треугольника " + a);
	}

}
