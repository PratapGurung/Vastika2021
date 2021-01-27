import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaQuestion36To40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10, 2, 4, 20, 12, 10, 4};
		//duplicateElement(array);
		
		int[][] arr1 = { { 1, 2, 5 }, { 3, 4, 6 } }; 
		int[][] arr2 = { { 1, 2,3 }, { 3, 4, 1 } }; 
		
		//matrixAdd(arr1,arr2);
		
		/*
		String s = "Narran";
		if(palindrome(s)) {
			System.out.println(s+ " is a palindrome.");
		}else {
			System.out.println(s+ "is not a palindrome.");
		}
		*/
		//System.out.println(shotForm("Ram Kishore Singh"));
		//System.out.println(reverse("palindrome "));
		//duplicateLetter("palindromeap");
		//duplicateWord("Hello world hello world i I");
		
	}
	

	/*
	 * question 36
	 * find duplicate elements in an array. 
	 * to call this function: duplicateElements(int[] arry)
	 * return: List<Integer>
	 *
	 */
	public static List<Integer> duplicateElement(int[] arry) {
		List<Integer> duplicate = new ArrayList<>();
		
		for(int i = 0; i < arry.length; i++) {
			for(int j = i+1; j < arry.length; j++) {
				if(arry[i] == arry[j]) {
					if(!duplicate.contains(arry[i])){
						duplicate.add(arry[i]);
					}
					
				}
					
			}
		}
		System.out.println(duplicate.toString());
		return duplicate;
		
	}
	
	/*
	 * question 37
	 * performs matrix addition 
	 * to call this function: matrixAdd(int[][] arry)
	 * return: List<Integer>
	 *
	 */
	public static int[][] matrixAdd(int[][] arry1, int[][] arry2){
		int row = arry1.length;
		int column = arry1[0].length;
		
		int[][] result = new int[row][column];
		
		for(int i= 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				result[i][j] = arry1[i][j] + arry2[i][j];
			}
		}
		
		//display result
		for(int i= 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print(result[i][j] + " "); 
			}
			System.out.println();
		}
		
		return result;
		
	}
	
	/*
	 * question 38
	 * check whether a given string is palindrome or not.
	 * to call this function: palindrome(String)
	 * return: boolean
	 *
	 */
	
	public static boolean palindrome(String s) {
		int length = s.length()-1;
		int mid = length/2;
		s = s.toLowerCase();
		for(int i = 0; i < mid; i++ ) {
			if(s.charAt(i) != s.charAt(length)) {
				return false;
			}
			length--;
		}
		
		return true;
	}
	
	/*
	 * question 39
	 * display names in short form. E.g. Ram Kishore Singh  -> R. k. Singh
	 * to call this function: shotForm(String)
	 * return: string
	 *
	 */
	public static String shotForm(String s) {
		String result = "";
		String[] parts = s.split(" ");
		for(int i=0; i < parts.length - 1; i++) {
			result += parts[i].charAt(0) + ". ";
		}
		result += parts[parts.length-1];
		return result;
	}
	
	
	/*
	 * question 40
	 * program to reverse the string.
	 * to call this function: reverse(String)
	 * return: string
	 *
	 */
	public static String reverse(String s) {
		String result = "";
		for(int i = s.length() - 1; i >= 0; i--) {
			result += s.charAt(i);
		}
		return result.strip();
	}
	
	/*
	 * question 41
	 * find the duplicate letters in a word.
	 * to call this function: duplicateLetter(String)
	 * return: list of duplicate letters in a word 
	 *
	 */
	public static List<Character> duplicateLetter(String s) {
		List<Character> duplicate = new ArrayList<>();
		for(int i = 0; i < s.length(); i++) {
			for(int j = i+1; j < s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					if(!duplicate.contains(s.charAt(i))){
						duplicate.add(s.charAt(i));
					}
					
				}
					
			}
		}
		System.out.println(duplicate.toString());
		return duplicate;
		
	}
	
	/*
	 * question 42
	 *  find the duplicate word from a long string.
	 * to call this function: duplicateWord(String)
	 * return: list of duplicate word in a long string 
	 *
	 */
	public static List<String> duplicateWord(String s) {
		List<String> duplicate = new ArrayList<>();
		String[] parts = s.toLowerCase().split(" ");
		for(int i = 0; i < parts.length; i++) {
			for(int j = i+1; j < parts.length; j++) {
				if(parts[i].equals(parts[j])) {
					if(!duplicate.contains(parts[i])){
						duplicate.add(parts[i]);
						
					}
					
				}
					
			}
		}
		System.out.println(duplicate.toString());
		return duplicate;
		
	}
	
	/*
	 * question 43 - a 
	 * program to trap the exception handling to trap the divided by zero and out of index value in array.
	 * to call this function: ExceptionHandlingExample()
	 * return: int
	 *
	 */
	public static int ExceptionHandlingExample(int a, int b) {
		try {
			a = a / b;
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		return a;
		
	}
	
	/*
	 * question 43 - b
	 * program to trap the exception handling to trap the divided by zero and out of index value in array.
	 * to call this function: ExceptionHandlingExample()
	 * return: void
	 */
	public static void ExceptionHandlingExample(int[] arry, int index) {
		try {
			System.out.println("Element index at: " + arry[index]);
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
	
	
	
}	
