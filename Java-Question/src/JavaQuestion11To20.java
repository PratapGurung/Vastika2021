import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaQuestion11To20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call here any method to test 
		//displayiInfo();
		//ascii(12);
		//leapYear(1992);
		//largestNum(10,21,3);
		//triangleInfo(2,3,4);
		calculator();
	}
	
	/*
	 * question 11
	 * swap
	 * to call this function: swap(int a, int b)
	 * return: void
	 * return type: void
	 */
	public static void swap(int a, int b) {
		Scanner input = new Scanner(System.in);
		System.out.println("==========================Choose Either option 1 or 2.===========================");
		System.out.println("|																				 |");
		System.out.println("|	1. With temp																 |");
		System.out.println("|	2. Without temp	 															 |");
		System.out.println("|																				 |");
		System.out.println("==================================================================================");
		System.out.print("Enter number 1 or 2:  ");
		int option = input.nextInt();
		if(option == 1) {
			System.out.println("Before Swapping: ");
			System.out.println("a: " + a);
			System.out.println("b: " + b);
			int temp = b;
			b = a;
			a = temp;
			System.out.println("After Swapping: ");
			System.out.println("a: " + a);
			System.out.println("b: " + b);
		}
		else if (option == 2) {
			System.out.println("Before Swapping: ");
			System.out.println("a: " + a);
			System.out.println("b: " + b);
			
			a = a + b;
			b = a -b;
			a = a - b;
			
			System.out.println("After Swapping: ");
			System.out.println("a: " + a);
			System.out.println("b: " + b);
		}
		else {
			System.out.println("please enter either 0 or 1.");
		}
		input.close();
	}
	
	/*
	 * question 12
	 * a program to accept the roll, name, and nationality of the person and display those values in good format.
	 * to call this function: info(String, String, String)
	 * return: void
	 * return type: void
	 */
	public static void displayiInfo() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your roll#: ");
		try {
			int roll = input.nextInt();
			input.nextLine();
			System.out.print("Enter your name: ");
			String name = input.nextLine();
			System.out.print("Enter your nationality: ");
			String nationality = input.nextLine();
			System.out.println("==========================Info Card===========================");
			System.out.printf("|	Roll# = %d									 	          ", roll);
			System.out.println();
			System.out.printf("| 	Name = %s												  ", name);
			System.out.println();
			System.out.printf("|	Nationality = %s										  ", nationality);
			System.out.printf("|															  ");
			System.out.println();
			System.out.println("===============================================================");
			input.close();
		}
		catch(InputMismatchException e){
			System.out.println("Please enter number only for roll number.");
		}
	
	}
	
	/*
	 * question 13
	 * program to print the number entered by the user only if the number entered is negative.
	 * to call this function: printNum()
	 * return: void
	 * return type: void
	 */
	public static void printNum() {
		boolean checkpoint = true;
		Scanner input = new Scanner(System.in);
		while(checkpoint) {
			try {
				System.out.print("Enter a negative number: ");
				int num = input.nextInt();
				if(num < 0) {
					System.out.println("The number you have entered is " + num+ ".");
					checkpoint = false;
				}
			}catch(InputMismatchException e){
				System.out.println("Please enter number only.");
				checkpoint = false;
			}
	
		}
		input.close();
	}
	
	/*
	 * question 14
	 * relate two integers entered by the user using = =or > or < sign.
	 * to call this function: relateNum()
	 * return: void
	 * return type: void
	 */
	public static void relateNum() {
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Enter the first integer: ");
			int num1 = input.nextInt();
			System.out.print("Enter the second integer: ");
			int num2 = input.nextInt();
			
			if(num1 == num2) {
				System.out.println("Both numbers are equal.");
			}
			else if(num1 > num2) {
				System.out.printf("%d is greater than %d.", num1,num2);
			}
			else {
				System.out.printf("%d is smaller than %d.", num1,num2);
			}
			
		}catch(InputMismatchException e){
			System.out.println("Please enter number only.");
			
		}
		input.close();
	}
	
	/*
	 * question 15
	 * receives an ASCII code (between 0 – 128) and display its character [example: 97 (input) ->a(output)].
	 * to call this function: ascii(int)
	 * return: void
	 * return type: void
	 */
	public static void ascii(int code) {
		if(code >= 0 && code <= 128 ) {
			System.out.println("ASCII character with value "+ code + " is "+ (char) code + ".");
		}
		else {
			System.out.println("The ascii code is not between 0 and 128.");
		}
		
	}
	
	/*
	 * question 16
	 * find the given number is even or odd.
	 * to call this function: parity(int)
	 * return: void
	 * return type: void
	 */
	
	public static void parity(int num) {
		if(num % 2 == 0 ) {
			System.out.printf("Number %d is even.", num);
		}
		else {
			System.out.printf("Number %d is odd.", num);
		}
	}
	
	/*
	 * question 17
	 * description: calculate leap year.
	 * to call this function: leapYear(int)
	 *
	 * return type: boolean
	 */
	
	public static boolean leapYear(int year) {
		boolean value = false;
		if(year%4 == 0) {
			if(year%100 ==0) {
				if(year%400 ==0) {
					System.out.printf("Year %d is a leap year.", year);
				}
				else {
					System.out.printf("Year %d is not a leap year.", year);
				}
			}
			else {
				System.out.printf("Year %d is a leap year.", year);
			}
		}
		else {
			System.out.printf("Year %d is not a leap year.", year);
		}
		return value;
	}
	
	/*
	 * question 18
	 * description: display the largest number from given three values.
	 * to call this function: largestNum(int, int , int)
	 *
	 * return type: int 
	 */
	public static int largestNum(int a, int b, int c ) {
		int largest = 0;
		if(a > b && a > c) {largest = a;}
		if(b > a && b > c) {largest = b;}
		if(c > a && c > b) {largest = c;}
		System.out.printf("Largest num out of %d, %d, %d is %d.", a,b,c,largest);
		return largest;
	}
	
	/*
	 * question 19
	 * description: accept three sides of a triangle and display which kind of triangle is formed.
	 * to call this function: triangleInfo(int, int , int)
	 *
	 * return type: void 
	 */
	public static void triangleInfo(int a, int b, int c) {
		if(a == b && b == c ) {
			System.out.println("Equilateral  Triangle");
		}
		else if(a == b || b == c || a == c) {
			System.out.println("Isosceles  Triangle");
		}
		else {
			System.out.println("Scalene Triangle");
		}
	}
	
	/*
	 * question 20
	 * description: create the equivalent of a four-function calculator. 
	 * to call this function: calculator()
	 *
	 * return type: void 
	 */
	public static void calculator() {
		Scanner input = new Scanner(System.in);
		try {
		
			System.out.println("==========================Calculator===========================");
			System.out.println("|	Functions: 						 	          ");
			System.out.println("| 	1 to add.											  ");
			System.out.println("|	2 to subtract.										  ");
			System.out.println("| 	3 to multiply.											  ");
			System.out.println("|	4 to divide.										  ");
			System.out.println("|															  ");
			System.out.println("===============================================================");
			
			System.out.print("Enter first number: ");
			double num1 = input.nextDouble();
			System.out.print("Enter second number: ");
			double num2 = input.nextDouble();
			System.out.print("Enter first number: ");
			int function = input.nextInt();
			double result = 0;
			switch(function){
			case 1:
				result = num1 + num2;
				System.out.printf("Addition of %.0f and %.0f is %.0f", num1, num2, result);
				break;
			case 2:
				result = num1 - num2;
				System.out.printf("Subtraction of %.0f from %.0f is %.0f", num1, num2, result);
				break;
			case 3:
				result = num1 * num2;
				System.out.printf("Multiplication of %.0f and %.0f is %.0f", num1, num2, result);
				break;
			case 4: 
				result = num1 / num2;
				System.out.printf("Division of %.0f by %.0f is %.2f", num1, num2, result);
				break;
			}
			input.close();
		}
		catch(InputMismatchException e){
			System.out.println("Please enter number only.");
		}

	}
}
