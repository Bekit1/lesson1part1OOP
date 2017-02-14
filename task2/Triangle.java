package task2;

import java.util.Scanner;

public class Triangle {
	private String name;
	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) {
		super();
		this.name = name;
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
		super();
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void createTriangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input side a for triangle " + name + ": ");
		a = sc.nextDouble();
		System.out.println("Input side b for triangle " + name + ": ");
		b = sc.nextDouble();
		System.out.println("Input side c for triangle " + name + ": ");
		c = sc.nextDouble();

	}

	public void square() {
		double p = (a + b + c) / 2;
		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("Square of triangle " + name + ": " + s);
	}

}
