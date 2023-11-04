package csd;

import java.util.concurrent.TransferQueue;

class App {
	
	
	public static void main(String[] args)
	{
		QuadraticTest.run();
	}
	
}


class QuadraticTest {
	
	public static void printDifferentRoots(double x1, double x2) 
	{
		System.out.printf("x1: %f%nx2: %f",x1,x2);
	}
	
	public static void printSameDifferentRoots(double x) 
	{
		System.out.printf("x1 = x2 = %f",x);
	}
	
	public static void printZeroRoots()
	{
		System.out.print("Gerçek kök yok");
		
	}
	
	public static void run ( ) {
		java.util.Scanner  sc = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		double a = sc.nextDouble();
		System.out.print("Bir sayı giriniz: ");
		double b = sc.nextDouble();
		System.out.print("Bir sayı giriniz: ");
		double c = sc.nextDouble();
		
		QuadraticEquation.isFindRoots(a, b, c);
	}
}

class QuadraticEquation {
		
	public static double delta(double a, double b, double c)
	{
		return b*b-4*a*c;
	}
	
	public static void isFindRoots(double a, double b, double c)
	{
		double delta = delta(a, b, c);
		
		if(delta > 0)
			isDifferentRoots(a, b, delta);
		else if (delta == 0)
			sameRoots(a, b);
			
		else
			notRoots();
		
	}
	
	public static void isDifferentRoots(double a, double b, double delta)
	{
		double sqrt = Math.sqrt(delta);
		double x1 = (-b + sqrt) / (2*a);
		double x2 = (-b - sqrt) / (2*a);
		QuadraticTest.printDifferentRoots(x1, x2);
		
	}
	
	public static void sameRoots (double a, double b)
	{
		double x1 = -b / (2*a);
		QuadraticTest.printSameDifferentRoots(x1);
	}
	
	public static void notRoots ()
	{
		QuadraticTest.printZeroRoots();
	}
}