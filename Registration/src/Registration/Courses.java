package Registration;

import java.util.ArrayList;

public class Courses {
	
	   private int no_of_seats = 100;
	   static int enrolled = 0;
	   
	   public String course_type;
	   
	   public String course_name;
	  static ArrayList<Student> enrolled_students = new ArrayList<Student>();
	   
	   Courses(String type, String name){
		   course_type = type;
		   course_name = name;
	   }
	   
	   
	    void enrolled_list(){
		   System.out.println("List of Enrolled in " + this.course_name);
		   for(Student s : enrolled_students) {
			   System.out.println(s.id + "\t\t" + s.name);
		   }
	   }
	   void enroll_Student(Student X) {
		   enrolled_students.add(X);
		   enrolled++;
	   }
	   
	   boolean check_availability() {
		   return (no_of_seats > enrolled);
	   }
	   
	   
}