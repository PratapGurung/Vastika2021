import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/*
 * Pratap Gurung
 * this class contain method that will solve the question 21 - 27, 29, 30. 
 * question 28 is done in separate class. 
 */
public class JavaQuestion21To30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dayOfTheWeek(1);
		//table(11);
		//sumToN(5);
		//System.out.println(factorialOfN(3));
		//highestScore();
		//reverseNum(521);
		//sumProductDigit(423);
		//int n = 4;
		//System.out.println("Sum of macluarin Series of " + n + " terms is " + macluarinSeries(n) + ".");
		fibonacciSeries(10);
	}
	
	/*
	 * question 21
	 * to input the number of (1...7) and translate to its equivalent name of the day of the week.
	 * to call this function: dayOfTheWeek(int a)
	 * return: String
	 * 
	 */
	public static String dayOfTheWeek(int day) {
		switch(day) {
		case 1: 
			System.out.println("Monday");
			return "Monday";
		case 2:
			System.out.println("Tuesday");
			return "Tuesday";
		case 3:
			System.out.println("Wednesday");
			return "Wednesday";
		case 4:
			System.out.println("Thursday");
			return "Thursday";
		case 5:
			System.out.println("Friday");
			return "Friday";
		case 6:
			System.out.println("Saturday");
			return "Saturday";
		case 7: 
			System.out.println("Sunday");
			return "Sunday";
		default:
			System.out.println("The day value is not between 1 and 7.");
			return "";
		}
	}
	
	
	/*
	 * question 22
	 * print the table of given numbers
	 * to call this function: table(int a)
	 * return: String
	 */
	public static void table(int num) {
		for(int i = 1; i<= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i );
		}
	}
	
	/*
	 * question 23
	 * Program to sum 1 to nth natural numbers.
	 * to call this function: sumToN(int a)
	 * return: int
	 */
	public static int sumToN(int n) {
		int sum = n * (n + 1) / 2;
		System.out.println("Sum to N natural Numbers: " + sum);
		return n;
	}
	
	/*
	 * question 24
	 * a program to print the factorial number of given numbers.
	 * to call this function: factorialOfN(int a)
	 * return: int
	 */
	public static double factorialOfN(double n) {
		if (n == 1)
			return 1;
		n = n * factorialOfN(n-1);
		return n;
	}
	
	/*
	 * question 25
	 * prompts the user to enter the number of students and each student’s name and score. 
	 * Finally display the student with the highest score.
	 * to call this function: highestScore()
	 * return: HashMap<string, int>
	 */
	public static HashMap<String, Integer> highestScore(){
		Scanner input = new Scanner(System.in);
		HashMap<String, Integer> results = new HashMap<String,Integer>();
		try{
			System.out.print("Enter the number of students: ");
			int numStudents = input.nextInt();
			input.nextLine(); //capture escape characters
			
			HashMap<String, Integer> record = new HashMap<String,Integer>();
			
			//enter n records 
			for(int i=0; i < numStudents; i++ ) {
				System.out.print("Enter " + (i + 1) + " student's name: "  );
				String name = input.nextLine();
				
				System.out.print("Enter " + (i + 1) + " student's score: "  );
				int score = input.nextInt();
				input.nextLine();//capture escape character
				record.put(name, score);
			}
			
			// using iterators 
	        Iterator<Entry<String, Integer>> itr = record.entrySet().iterator(); 
			int maxScore = 0;
	        while(itr.hasNext()) {
	        	Entry<String, Integer> entry = itr.next(); 
	        	if(maxScore < entry.getValue()) {
	        		maxScore = entry.getValue();
	        		results.clear();
	        		results.put(entry.getKey(), entry.getValue());
	        	}
	     	
	        }
	        System.out.println("========================================================");
	        //display student with highest score
	        results.forEach((key,value) -> {
	        	System.out.println(key + " has highest score of " + value + ".");
	        }); 
	        System.out.println("========================================================");
			
		}catch(InputMismatchException e){
			System.out.println(e);
		}
		
		
		input.close();
		return results;
	}
	
	/*
	 * question 26
	 * reverse the given number. //123 => 321
	 * Finally display the student with the highest score.
	 * to call this function: reverseNum(int n)
	 * return: int
	 */
	public static int reverseNum(int num) {
		int reverse = 0;
		int n = num;
		while(num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}
		System.out.println("Reversed Number of " + n + " is " + reverse + ".");
		return reverse;
	}
	
	/*
	 * question 27
	 * sum each digit of given number as well as product. //456 =>4*5*6 and 4+5+6
	 * to call this function: sumProductDigit(int n)
	 * return: int
	 */
	public static void sumProductDigit(int num) {
		List<Integer> digits = new ArrayList<>();
		System.out.println("Input: " + num);
		while(num != 0) {
			digits.add(num%10);
			num /= 10;
		}
		
		//product
		System.out.print("Product: ");
		int product = 1;
		int i;
		for(  i = 0;i < digits.size() - 1; i++ ) {
			product *= digits.get(i);
			System.out.print(digits.get(i) + " x ");
		}
		product *= digits.get(i);
		System.out.print(digits.get(i));
		System.out.print(" = " +  product);
		System.out.println();
		
		//sum
		System.out.print("Sum: ");
		int sum = 0;
		for (i = 0; i < digits.size() - 1; i++) {
			sum += digits.get(i);
			System.out.print(digits.get(i) + " + ");
		}
		sum += digits.get(i);
		System.out.print(digits.get(i));
		System.out.print(" = " + sum);
		System.out.println();
	}
	

	/*
	 * question 29
	 * 
	 * to call this function: macluarinSeries(int n)
	 * return: int
	 */
	
	public static double macluarinSeries(double n) {
		
		if(n == 1)
			return 1;
		n = (n) / factorialOfN(n)+ macluarinSeries(n-1);// - ( (n-1) / factorialOfN(n-1)); 
		return n;
	}
	
	
	/*
	 * question 30 -sub
	 *  fibonacci number of nth term
	 * to call this function: fibonacci(int n)
	 * return: int
	 */
	public static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}	
		n = fibonacci(n-1) + fibonacci(n-2);
		return n;
	}
	
	/*
	 * question 30 - main
	 * display fibonacci numbers up to nth term
	 * to call this function: fibonacci(int n)
	 * return: void
	 */
	private static void fibonacciSeries(int n) {
		System.out.print("Fibonacci series up to "+ n+ "th term: ");
		for(int i = 0; i <= n; i++ ) {
			System.out.print(fibonacci(i) + " ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
