import java.util.ArrayList;
import java.util.List;

/*
 * 28.	Write a program in a single class having the following functions.
 * 			a.	isPrimenumber(int)
 *			b.	firstNthPrime(int)
 * 			c.	allPrimebetween(int start , int  end)

 */
public class JQ28 {
	
	//default
	JQ28(){}
	
	public static boolean isPrimeNumber(int n) {
		int i = 2;
	    boolean flag = false;
	    while (i <= n / 2) {
	      // condition for nonprime number
	      if (n % i == 0) {
	        flag = true;
	        break;
	      }

	      i++;
	    }
		return !flag;
	}
	
	public static List<Integer> firstNthPrime(int n) {
		List<Integer> listPrime = new ArrayList<>();
		int i = 2;
		while(listPrime.size() < n) {
			if(isPrimeNumber(i)) 
				listPrime.add(i);
			i++;
		}
		
		return listPrime;
		
	}
	
	public static List<Integer> allPrimebetween(int start, int end) {
		List<Integer> listPrime = new ArrayList<>();
		for(int i= start; i < end; i++) {
			if(isPrimeNumber(i)) 
				listPrime.add(i);
		}
		return listPrime;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 37;
		if(isPrimeNumber(num)) {
			 System.out.println(num + " is a prime number.");
		}
		else {
			 System.out.println(num + " is not a prime number.");
		}
		
		int i = 10;
		System.out.print("First " + i + "th Prime numbers: ");
		for(int n: firstNthPrime(i)) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		int start = 20, end = 50;
		System.out.print("Prime numbers between " + start + " and " + end + " : ");
		for(int n: allPrimebetween(start, end)) {
			System.out.print(n + " ");
		}
	}

}
