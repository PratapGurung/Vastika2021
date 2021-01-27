import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
/*
 * question 44
 * program to store the name and address of 10 students in file and search address by given name.
 * to call this function: fileExample()
 * return: void
 */
public class JQ44_fileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("==========================Choose one option .===========================");
		System.out.println("|																				 ");
		System.out.println("|	1. Write to file													 ");
		System.out.println("|	2. Read from file  													 ");
		System.out.println("|	3. Search Name by Add																			 ");
		System.out.println("==================================================================================");
		
		//enter file name
		System.out.print("Enter file name to read/write: " );
		String fileName = input.nextLine();
		
		int option=0;
		try {
			System.out.print("Choose one the option from above: " );
			option = input.nextInt();
			input.nextLine(); //capture \n
		}catch(InputMismatchException e){System.out.println(e);}
		
		switch(option) {
			case 1:
				List<Student> studentList = readData(input);
				write(studentList, fileName);
				break;
				
			case 2:
				//read from file
				List<Student> listFrmFile = read(fileName);
				for(Student s: listFrmFile) {
					System.out.println(s.getName() + " : " + s.getAddress());
				}
				break;
			case 3:
				System.out.print("Enter name to search: " );
				String name = input.nextLine();
				String add = searchAdd(fileName,name);
				if(add!=null) {
					System.out.println("The address of Student " + name + " is " + add + ".");
				}
				else {
					System.out.println("Threse is no record of Student with name " + name +".");
				}
				break;
			default: System.out.println("Please choose between 1, 2 and 3.");
		}
		
		
	}

	private static List<Student> readData(Scanner input){
		
		System.out.print("Enter the number of Students: " );
		int numStudents = input.nextInt();
		input.nextLine(); //capture \n
		
		//input students
		List<Student> studentList = new ArrayList<>();
		for(int i = 1; i < numStudents; i++ ) {
			System.out.println("Enter the name of Student: ");
			String name = input.nextLine();
			
			
			System.out.println("Enter the Address of "+ name + " : ");
			String address = input.nextLine();
			
			Student std = new Student(name,address);
			studentList.add(std);
		
		}
		return studentList;
	}
	private static void write(List<Student> stdList, String fileName) {
		// write
		File file = new File(fileName);
		try (FileWriter fw = new FileWriter(file, false)) {
			for (Student s : stdList) {
				fw.write(s.getName() + " : " + s.getAddress() + "\n");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private static List<Student> read(String fileName){
		List<Student> studentList = new ArrayList<>();
		// write
		File file = new File(fileName);
		try (
				FileReader reader = new FileReader(file);
				BufferedReader bufferreader = new BufferedReader(reader)
				) {
			
			String line;
			while ((line = bufferreader.readLine()) != null) {
				String[] studentRec = line.split(":");
				String name =  studentRec[0].strip();
				String add =  studentRec[1].strip();
				Student std = new Student(name, add);
				studentList.add(std);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return studentList;
	}
	
	/*
	 * search address by name
	 */
	public static String searchAdd(String fileName, String name) {
		
		List<Student> studentList = read(fileName);
		
		for(Student s: studentList) {
			if(name.toLowerCase().equals(s.getName().toLowerCase())) {
				
				return s.getAddress();
			}
		}
		return null;
	}
}

/*
 * student class
 */
class Student{
	private String name;
	private String address;
	
	Student(String name, String add){
		this.name = name;
		address = add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
