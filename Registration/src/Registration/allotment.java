package Registration;
import java.util.Scanner;
import java.lang.System;

public class allotment {
//	have to see her why static
	static void initial() {
		System.out.println("Select the code of respective Branch that you wish to Choose...");
		System.out.println("Branch \t\t Code");
		System.out.println("CSE \t\t A");
		System.out.println("CCE \t\t B");
		System.out.println("ECE \t\t C");
		System.out.println("ME \t\t D");
		System.out.println("Enter any other key to finish the Registration process");
		}
		
//	this would need refactoring....since I should reduce the redundancy, 
//	one solution could be have all essential methods in a superclass...like check_availability...
	void Register(Character c) {
//	 multiple inputs and parsing can be an improvment...like preference based system...
//		lots of repetition here , refactoring will remove a lot of mess here...
		if(c == 'A') {
			CSE temp = new CSE();
			
			if(temp.check_availability()) {
				Scanner in = new Scanner(System.in);
				System.out.println("Enter Students Name: ");
				String name = in.nextLine();
            			
				Student new_student = new Student(name , "CSE");
				temp.enroll_Student(new_student);
				System.out.println("Select the Core courses code , Enter your choices: ");
				temp.Core_list();
//				checks required for robustness of input...later
				String selects = in.nextLine();
				int index = 0;
				
//				selecting core courses
				while(index < selects.length()  && (selects.charAt(index) != '\0')  ) {
					if(temp.Core[index].check_availability()) {
						new_student.add_Course(temp.Core[index]);
						temp.Core[index].enroll_Student(new_student);
						
					}
					else
						System.out.println("Course with code  " + selects.charAt(index) + " not available");
					index++;
				}
//				selecting electives
				System.out.println("Select the electives, Enter your choices...");
				temp.Elective_list();
				String selects2 = in.nextLine();
				int temp5 = 0;
				while(temp5 < selects2.length() && (selects2.charAt(temp5) != '\0')) {
					if(temp.electives[temp5].check_availability()) {
						new_student.add_Course(temp.electives[temp5]);
						temp.electives[temp5].enroll_Student(new_student);
						
					}
					else
						System.out.println("Course with code  " + selects.charAt(temp5) + " not available");
					temp5++;
				}
				
				System.out.println("Congratulations You are enrolled in " + temp.toString() + "\n");
				
				
			}
		}
		
		if(c == 'B') {
			CCE temp = new CCE();
			
			if(temp.check_availability()) {
				Scanner in = new Scanner(System.in);
				System.out.println("Enter Students Name: ");
				String name = in.nextLine();
            			
				Student new_student = new Student(name , "CSE");
				temp.enroll_Student(new_student);
				System.out.println("Select the Core courses code , Enter your choices: ");
				temp.Core_list();
//				checks required for robustness of input...later
				String selects = in.nextLine();
				int index = 0;
				
//				selecting core courses
				while(index < selects.length()  && (selects.charAt(index) != '\0')  ) {
					if(temp.Core[index].check_availability()) {
						new_student.add_Course(temp.Core[index]);
						temp.Core[index].enroll_Student(new_student);
						
					}
					else
						System.out.println("Course with code  " + selects.charAt(index) + " not available");
					index++;
				}
//				selecting electives
				System.out.println("Select the electives, Enter your choices...");
				temp.Elective_list();
				String selects2 = in.nextLine();
				int temp5 = 0;
				while(temp5 < selects2.length() && (selects2.charAt(temp5) != '\0')) {
					if(temp.electives[temp5].check_availability()) {
						new_student.add_Course(temp.electives[temp5]);
						temp.electives[temp5].enroll_Student(new_student);
						
					}
					else
						System.out.println("Course with code  " + selects.charAt(temp5) + " not available");
					temp5++;
				}
				
				System.out.println("Congratulations You are enrolled in " + temp.toString() + "\n");
				
				
			}
		}
		
		if(c == 'C') {
			ECE temp = new ECE();
			
			if(temp.check_availability()) {
				Scanner in = new Scanner(System.in);
				System.out.println("Enter Students Name: ");
				String name = in.nextLine();
            			
				Student new_student = new Student(name , "CSE");
				temp.enroll_Student(new_student);
				System.out.println("Select the Core courses code , Enter your choices: ");
				temp.Core_list();
//				checks required for robustness of input...later
				String selects = in.nextLine();
				int index = 0;
				
//				selecting core courses
				while(index < selects.length()  && (selects.charAt(index) != '\0')  ) {
					if(temp.Core[index].check_availability()) {
						new_student.add_Course(temp.Core[index]);
						temp.Core[index].enroll_Student(new_student);
						
					}
					else
						System.out.println("Course with code  " + selects.charAt(index) + " not available");
					index++;
				}
//				selecting electives
				System.out.println("Select the electives, Enter your choices...");
				temp.Elective_list();
				String selects2 = in.nextLine();
				int temp5 = 0;
				while(temp5 < selects2.length() && (selects2.charAt(temp5) != '\0')) {
					if(temp.electives[temp5].check_availability()) {
						new_student.add_Course(temp.electives[temp5]);
						temp.electives[temp5].enroll_Student(new_student);
						
					}
					else
						System.out.println("Course with code  " + selects.charAt(temp5) + " not available");
					temp5++;
				}
				
				System.out.println("Congratulations You are enrolled in " + temp.toString() + "\n");
				
				
			}
		}
		
		if(c == 'D') {
			ME temp = new ME();
			
			if(temp.check_availability()) {
				Scanner in = new Scanner(System.in);
				System.out.println("Enter Students Name: ");
				String name = in.nextLine();
            			
				Student new_student = new Student(name , "CSE");
				temp.enroll_Student(new_student);
				System.out.println("Select the Core courses code , Enter your choices: ");
				temp.Core_list();
//				checks required for robustness of input...later
				String selects = in.nextLine();
				int index = 0;
				
//				selecting core courses
				while(index < selects.length()  && (selects.charAt(index) != '\0')  ) {
					if(temp.Core[index].check_availability()) {
						new_student.add_Course(temp.Core[index]);
						temp.Core[index].enroll_Student(new_student);
						
					}
					else
						System.out.println("Course with code  " + selects.charAt(index) + " not available");
					index++;
				}
//				selecting electives
				System.out.println("Select the electives, Enter your choices...");
				temp.Elective_list();
				String selects2 = in.nextLine();
				int temp5 = 0;
				while(temp5 < selects2.length() && (selects2.charAt(temp5) != '\0')) {
					if(temp.electives[temp5].check_availability()) {
						new_student.add_Course(temp.electives[temp5]);
						temp.electives[temp5].enroll_Student(new_student);
						
					}
					else
						System.out.println("Course with code  " + selects.charAt(temp5) + " not available");
					temp5++;
				}
				
				System.out.println("Congratulations You are enrolled in " + temp.toString() + "\n");
				
				
			}
		}
		
	}
	
	public static void main(String[] args) {  

		allotment allotment = new allotment();
	System.out.println("Welcome to the Registration Desk..\n\n");
	while(true) {
	initial();
	Scanner in = new Scanner(System.in);
	char temp;
	temp = in.next().charAt(0);
	
	switch(temp){
	case 'A':{
		allotment.Register('A');
		
	  break;
	}
	case 'B':
	{
		allotment.Register('B');
	  break;
	}
	case 'C':
	{
		allotment.Register('C');
	  break;
	}
	case 'D':
	{
		allotment.Register('D');
	  break;
	}
	default:
		System.out.println("Not a valid Selection!!! exiting....will throw exceptions later");
//		System.exit(0);
     	break;
	}
	break;	
//	instead of breaking....
//	now choose what you want to do...if you want
//	create instances and use methods to print students list...gradesheets...course-wise lists etc
	
}}}