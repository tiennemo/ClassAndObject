package advance.dev;

	import java.util.Scanner;

	public class MainApp {
	    private static final int NUM_STUDENTS = 10;

	    public static void main(String[] args) {
	        Student[] students = new Student[NUM_STUDENTS];
	        input(students);
	        print(students);
	    }

	    public static void input(Student[] students) {
	        Scanner scanner = new Scanner(System.in);

	        for (int i = 0; i < students.length; i++) {
	            System.out.println("Enter details for student " + (i + 1));

	            System.out.print("Name: ");
	            String name = scanner.nextLine();

	            System.out.print("Age: ");
	            int age = scanner.nextInt();
	            scanner.nextLine(); // Đọc ký tự '\n' sau khi đọc số nguyên

	            System.out.print("Address: ");
	            String address = scanner.nextLine();

	            System.out.print("Phone number: ");
	            String phoneNumber = scanner.nextLine();

	            System.out.print("Average score: ");
	            double averageScore = scanner.nextDouble();
	            scanner.nextLine(); // Đọc ký tự '\n' sau khi đọc số thực

	            students[i] = new Student(name, age, address, phoneNumber, averageScore);
	        }

	        scanner.close();
	    }

	    public static void print(Student[] students) {
	        System.out.println("List of students:");
	        for (int i = 0; i < students.length; i++) {
	            System.out.println("Student " + (i + 1) + ":");
	            System.out.println("Name: " + students[i].getName());
	            System.out.println("Age: " + students[i].getAge());
	            System.out.println("Address: " + students[i].getAddress());
	            System.out.println("Phone number: " + students[i].getPhoneNumber());
	            System.out.println("Average score: " + students[i].getAverageScore());
	            System.out.println();
	        }
	    }
	}

