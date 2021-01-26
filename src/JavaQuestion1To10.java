import java.util.Scanner;

public class JavaQuestion1To10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// avg(input);
		//System.out.println(area(2));
		//tempConverter();
		lbToKg();
	}
	//question 1
	//greet
	public static void greet() {
		System.out.println("Hello Everyone !!");
	}
	
	//question 2
	//greet
	public static void greet(String name) {
			System.out.println("Hi everyone, I am " + name + "." + "Nice to meet you all.");
	}
	/*
	 * question 3
	 * Average of two numbers
	 * to call this function: avg(Scanner ): parameter = Scanner object
	 * return: average of two numbers 
	 * return type: double
	 */
	public static double avg(Scanner input) {

		System.out.print("Enter first Number: ");
		int first = input.nextInt();
		System.out.print("Enter second Number: ");
		int second = input.nextInt();
		double avg = (first + second) / 2.0;
		System.out.println("Average of Two number is " + avg);
		return avg;

	}
	
	/*
	 * question 4
	 * simple interest
	 * to call this function: simpleInterest(double, double, double)
	 * return: simple interest from given principle amount , time and rate 
	 * return type: double
	 */
	public static double simpleInterest(double p, double t, double r) {
		return (p * t * r) / 100.0;
	}

	/*
	 * question 5 -a 
	 * area of circle
	 * to call this function: area(double:radius)
	 * return: area of circle of a given radius
	 * return type: double
	 */
	public static double area(double radius) {
		return (22 / 7.0) * Math.pow(radius, 2);
	}

	/*
	 * question 5 - b 
	 * area of triangle
	 * to call this function: area(double:base, double:height)
	 * return: area of triangle of a given base and height
	 * return type: double
	 */
	public static double area(double base, double height) {
		return 0.5 * base * height;
	}

	/*
	 * question 5 - c 
	 * area of rectangle
	 * to call this function: rectArea(double:width, double:length)
	 * return: area of rectangle of a given width and length
	 * return type: double
	 */
	public static double rectArea(double wide, double length) {
		return wide * length;
	}

	/*
	 * question 6 - a 
	 * perimeter of circle
	 * to call this function: perimeter(double:radius)
	 * return: perimeter of a circle 
	 * return type: double
	 */
	public static double perimeter(double radius) {
		return 2 * (22 / 7.0) * radius;
	}

	/*
	 * question 6 - b
	 * perimeter of triangle
	 * to call this function: perimeter(double:a,double:b, double:c)
	 * return: perimeter of a triangle 
	 * return type: double
	 */
	public static double perimeter(double a, double b, double c) {
		return a + b + c;
	}

	/*
	 * question 6 - c
	 * perimeter of rectangle
	 * to call this function: perimeter(double:width,double:length)
	 * return: perimeter of a rectangle 
	 * return type: double
	 */
	public static double perimeter(double length, double width) {
		return 2 * (length + width);
	}
	
	
	/*
	 * question 7
	 * volume of cylinder
	 * to call this function: volume(double: radius, double:length)
	 * return: volume of a cylinder 
	 * return type: double
	 */
	public static double volume(double radius, double length) {
		
		double volume = (22 / 7.0) * length * radius * radius;
		System.out.println(volume);
		return volume;
	}
	
	/*
	 * question 8
	 * Temperature Converter
	 * to call this function: tempConverter()
	 * return: void
	 * return type: double
	 */
	public static double tempConverter() {
		Scanner input = new Scanner(System.in);
		double output = 0.0;
		System.out.println("==========================Choose Either option 1 or 2.===========================");
		System.out.println("|																				 |");
		System.out.println("|	1. Celcius to Fahrenheit 													 |");
		System.out.println("|	2. Fahrenheit to Celcius  													 |");
		System.out.println("|																				 |");
		System.out.println("==================================================================================");
		System.out.print("Enter number 1 or 2:  ");
		int option = input.nextInt();
		if(option == 1) {
			System.out.print("Celcius to Fahrenheit: ");
			double temp = input.nextDouble();
			System.out.println("Input Celcius Temp: " + temp);
			output = (temp * 9/5) + 32;
			System.out.println("Output Fahrenheit Temp: "+ output);
		}
		else if (option == 2) {
			System.out.print("Fahrenheit to Celcius: ");
			double temp = input.nextDouble();
			System.out.println("Input Fahrenheit Temp: "+ temp);
			output = (temp - 32) * 5 / 9;
			System.out.println("Output Celcius Temp: " + output);
		}else {
			System.out.println("please enter either 0 or 1.");
		}
		input.close();
		return output;
	}
	
	/*
	 * question 9
	 * Weight Converter( lb to kg)
	 * to call this function: weightConverter()
	 * return: void
	 * return type: double
	 */
	public static double lbToKg() {
		Scanner input = new Scanner(System.in);
		double kg = 0.0;
		System.out.print("Enter the weight in pounds(Lbs): ");
		double lbs = input.nextDouble();
		kg = (lbs * 0.45359237);
		System.out.printf("Weight in Kilos: %.3f kg" ,kg);
		input.close();
		return kg;
		
	}
	
	

	/*
	 * question 10 -a 
	 * mathematical functions: displacement
	 * to call this function: mathFucs(double: initVel, douible:acceleration, double:time)
	 * return: void
	 * return type: double
	 */
	public static double mathFunc(double initVel, double acceleration, double time) {
		return (initVel * time) + 0.5 * acceleration * time*time;
	}
	
	/*
	 * question 10 -b 
	 * mathematical functions: area of triangle given three sides and half perimetre
	 * to call this function: mathFunc(double s, double a, double b, double c)
	 * return: void
	 * return type: double
	 */
	public static double mathFunc(double s, double a, double b, double c) {
		return Math.sqrt(s* (s-a)*(s-b)* (s-c));
	}
	
	/*
	 * question 10 -c 
	 * mathematical functions: quadratic formula
	 * to call this function: mathFunc(int s, int a, int b, int c)
	 * return: void
	 * return type: double[]
	 */
	public static double[] mathFunc(int a, int b, int c) {
		double[] x = new double[2];
		x[0] = (-b + Math.sqrt(b*b - 4 * a*c) ) /2;
		x[1] = (-b - Math.sqrt(b*b - 4 * a*c) ) /2;
		return x;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
