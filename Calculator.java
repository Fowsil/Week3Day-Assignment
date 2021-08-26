package week3.day1Polymorphism;

public class Calculator {
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("Sum of 2 no's : " +c);
	}
	public void add(int a, int b,int c)
	{
		int d=a+b+c;
		System.out.println("Sum of 3 no's : "+d);
	}
	public void product(int a,int b) {
		int c=a*b;
		System.out.println("Product of 2 Integers : "+c);
	}
	public void product(int a,double b)
	{
		double c=a*b;
		System.out.println("Product of Doouble and Integer : " +c);
	}
	public void division(int a,int b)
	{
		int c=a/b;
		System.out.println("Division Of 2 Integers : " +c);
	
	}
	public void division(double a,int b)
	{
		double c=a/b;
		System.out.println("Division of double and int : " +c);
	}
	
	public static void main(String[] args) {
		
	Calculator cal=new Calculator();
	cal.add(5, 10);
	cal.add(213,323,323131);
	cal.product(1232,6574);
	cal.product(2313,221);
	cal.division(4566.34,32);
	cal.division(32223,321);
	}

}
