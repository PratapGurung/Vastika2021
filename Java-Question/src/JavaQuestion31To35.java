import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class JavaQuestion31To35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//displayPatterns(5);
		//sumArray(4);
		int[] array = {100, 2, 4, 20, 12};
		//displayInAscending(array);
		//reverseArray(array);
		secondLargest(array);
	}
	
	/*
	 * question 31
	 * display patterns up to nth term
	 * to call this function: displayPatterns(int n)
	 * return: int
	 */
	public static void displayPatterns(int n) {
		int x = 0;
		for(int i = 1; i <= n; i++) { 
			x = x *10 + i;
			System.out.println(x);
		}
	}
	
	/*
	 * question 32
	 * accept n values in an array and display their sum.
	 * to call this function: sumArray(int n)
	 * return: int
	 */
	public static int sumArray(int n) {
		int sum = 0;
		int[] numlist = new int[n];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter " + n + " values: ");
		for(int i = 0; i < n; i++) {
			try {
				numlist[i] = input.nextInt();
				sum += numlist[i];
			}catch(InputMismatchException e) {
				System.out.println(e);
			}
		}
		
		System.out.println("Sum : "  + sum);
		return sum;
	}
	
	/*
	 * question 33
	 * display numbers in ascending order in array. //mnerge sort
	 * to call this function: displayInAscending(int[] numArry)
	 * return: 
	 */
	public static void displayInAscending(int[] numArry) {
		System.out.print("Input Array: ");
		for(int n: numArry) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		System.out.print("Array in Ascending order: ");
		for(int n: mergeSort(numArry, 0, numArry.length-1)) {
			System.out.print(n + " ");
		}
		
	}
	
	/*
	 * question 33 - sub function
	 *  merge sort
	 * to call this function: mergesort(int[] numArry)
	 * return: int []
	 */
	private static int[] mergeSort(int arr[], int l, int r){
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;
 
            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
		return arr;
        
    }
	
	
	/*
	 * question 33 - sub function
	 *  merge 
	 * to call this function: merge(int[] arry1, int[] arry2)
	 * return: int []
	 */
  
	private static int[] merge(int arr[], int l, int m, int r){
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        return arr;
    }
	
	
	
	
	/*
	 * question 34 
	 *  reverse the element of an array. 
	 * to call this function: reverseArray(int[] arry)
	 * return: int []
	 */
	public static int[] reverseArray(int[] arry) {
		int[] reverseArry = new int[arry.length];
		System.out.print("Input Array: ");
		for(int n: arry) { System.out.print(n + " "); }
		
		System.out.println();

		System.out.print("Reverse Array: ");
		int index = 0;
		for(int i= arry.length -1; i >= 0; i--) {
			reverseArry[index] = arry[i];
			System.out.print(arry[i] + " ");
			index++;
		}
		return reverseArry;
		
	}
	
	/*
	 * question 35 
	 * find the second largest number in a given array.
	 * to call this function: secondLargest(int[] arry)
	 * return: int
	 */
	
	public static int secondLargest(int[] arry) {
		int second_largest = 0; 
		int max = 0;
		for(int i = 0; i < arry.length; i++ ) {
			if(max < arry[i]) {
				second_largest = max;
				max = arry[i];
			}
			if(second_largest < max && max != arry[i] && second_largest < arry[i]) {
				second_largest = arry[i];
			}
			
		}
		System.out.print("Input Array: ");
		for(int n: arry) { System.out.print(n + " "); }
		System.out.println();
		System.out.println("Second largest:  " + second_largest);
		return second_largest;
	}
	
	


	
}
