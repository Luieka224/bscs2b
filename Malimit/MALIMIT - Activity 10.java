import java.util.Scanner;
import java.util.ArrayList;

// interface GradesInterface {
// 	ArrayList<Integer> getGrade(String studentNumber);
// 	ArrayList<String> getStudentDetails(String studentNumber);
// 	void inputGrade(String studentNumber, int Math, int Science, int English, int Programming);
// 	void addStudent(String studentNumber, String firstName, String lastName);
// }

class StudentInfo {
	private ArrayList<ArrayList<Integer>> grades = new ArrayList<ArrayList<Integer>>();
	private ArrayList<ArrayList<String>> students = new ArrayList<ArrayList<String>>();

	ArrayList<ArrayList<Integer>> getAllGrades() {
		return this.grades;
	}

	ArrayList<ArrayList<String>> getAllStudentDetails() {
		return this.students;
	}

	// void inputGrade(String studentNumber, int Math, int Science, int English, int Programming) {
	// 	ArrayList<Integer> grade = new ArrayList<Integer>();

	// 	grade.add(Math);
	// 	grade.add(Science);
	// 	grade.add(English);
	// 	grade.add(Programming);

	// 	for(int i = 0; i < students.size(); i++) {
	// 		if(students.get(i).get(0).equals(studentNumber)) {
	// 			grades.set(i, grade);
	// 		}
	// 	}
	// }

	void addStudent(ArrayList<String> student, ArrayList<Integer> grade) {
		students.add(student);
		grades.add(grade);
	}
}

class ComSciStudent extends StudentInfo {
	static ComSciStudent css = new ComSciStudent();

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		

		int choice = 0;

		while(choice != 3) {
			System.out.println(
				"\n=============================="+
				"\n1.  Add Student" +
				"\n2.  View All Entries" +
				"\n3.  Exit" +
				"\n=============================="
			);
			choice  = input.nextInt();

			if (choice == 1) {
				addStudents();
			} else if (choice == 2) {
				displayAllEntries();
			}
		}
	}

	static void displayAllEntries() {
		ArrayList<ArrayList<Integer>> grades = css.getAllGrades();
		ArrayList<ArrayList<String>> students = css.getAllStudentDetails();
		
		for(int i = 0; i < students.size(); i++) {
			System.out.println(
				"\n=============================="+
				"\nName: " + students.get(i).get(2) + ", " + students.get(i).get(1) +
				"\nID Number: " + students.get(i).get(0) +
				"\nGRADES" +
				"\nMath: " + grades.get(i).get(0) +
				"\nScience: " + grades.get(i).get(1) +
				"\nEnglish: " + grades.get(i).get(2) +
				"\nProgramming: " + grades.get(i).get(3) +
				"\n=============================="
			);
		}
	}

	static void addStudents() {
		ArrayList<String> student = new ArrayList<String>();
		ArrayList<Integer> grade = new ArrayList<Integer>();

		System.out.print("Student Number: ");
		String studentNumber = input.next();
		input.nextLine();
		System.out.print("First Name: ");
		String firstName = input.nextLine();
		System.out.print("Last Name: ");
		String lastName = input.nextLine();
		System.out.print("Grade in Math: ");
		int math = input.nextInt();
		System.out.print("Grade in Science: ");
		int science = input.nextInt();
		System.out.print("Grade in English: ");
		int eng = input.nextInt();
		System.out.print("Grade in Programming: ");
		int prog = input.nextInt();


		student.add(studentNumber);
		student.add(firstName);
		student.add(lastName);

		grade.add(math);
		grade.add(science);
		grade.add(eng);
		grade.add(prog);

		css.addStudent(student, grade);
	}
}
