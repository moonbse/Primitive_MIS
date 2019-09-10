package Registration;

import java.util.ArrayList;



//public class Branches {
//private int no_of_seats = 100;
//static int enrolled_CSE = 0;
//static int enrolled_CCE = 0;
//static int enrolled_ECE = 0;
//static int enrolled_ME = 0;
//public String branch_name;

//boolean check_availability(String a) {
//	   if(a.equals("CSE")) {
//	   return (no_of_seats > enrolled_CSE);}
//	   
//	   if(a.equals("CCE")) {
//		   return (no_of_seats > enrolled_CCE);}
//	   
//	   if(a.equals("ECE")) {
//		   return (no_of_seats > enrolled_ECE);}
//
//	   if(a.equals("ME")){
//		   return (no_of_seats > enrolled_ME);}
//	   return false;
//}
//
//ArrayList<Student> enrolled_students = new ArrayList<Student>();
//}


class CSE extends abstract_branch {
     
	static int enrolled ;
	final Courses[] Core = new Courses[6];
	final Courses[] electives = new Courses[4];
	
	ArrayList<Student> enrolled_students = new ArrayList<Student>();

    CSE() {	
    	
	Core[0] = new Courses("Core", "Aa_CSE");
	Core[1] = new Courses("Core", "Bb_CSE");
	Core[2] = new Courses("Core", "Cc_CSE");
	Core[3] = new Courses("Core", "Dd_CSE");
	Core[4] = new Courses("Core", "Ee_CSE");
	Core[5] = new Courses("Core", "Ff_CSE");
	
	electives[0] = new Courses("elective", "Xx_CSE");
	electives[1] = new Courses("elective", "Yy_CSE");
	electives[2] = new Courses("elective", "Zz_CSE");
    };
    
	@Override
	boolean check_availability(){ 
		   return (no_of_seats > enrolled);
	}
	
	 void Core_list() {
		for(int i =0; i < 6; i++ ) {
			System.out.println( i + "."  + "\t\t" + Core[i].course_name);
		}
	}
	void Elective_list(){
	    for(int i = 0; i < 3; i++){
	    	System.out.println( i + "."  + "\t\t" + electives[i].course_name);
	    }
	}
	
	void enroll_Student(Student X) {
		   enrolled_students.add(X);
		   enrolled++;
	   }
	

  void enrolled_list() {
	  System.out.println("List of Enrolled in CSE");
	   for(Student s : enrolled_students) {
		   System.out.println(s.id + "\t\t" + s.name);
	   }
  }
  @Override
 public String toString() {
	 return "CSE";
  }
  
}

class CCE extends abstract_branch{
	
	static int enrolled;
	final Courses[] Core = new Courses[6];
	final Courses[] electives = new Courses[4];
//	ArrayList<Courses> Core = new ArrayList<>();
//	ArrayList<Courses> electives = new ArrayList();
	CCE() {	
    	
	Core[0] = new Courses("Core", "Aa_CCE");
	Core[1] = new Courses("Core", "Bb_CCE");
	Core[2] = new Courses("Core", "Cc_CCE");
	Core[3] = new Courses("Core", "Dd_CCE");
	Core[4] = new Courses("Core", "Ee_CCE");
	Core[5] = new Courses("Core", "Ff_CCE");
	
	electives[0] = new Courses("elective", "Xx_CCE");
	electives[1] = new Courses("elective", "Yy_CCE");
	electives[2] = new Courses("elective", "Zz_CCE");
    };
    
	
	@Override
	boolean check_availability() {
		   return (no_of_seats > enrolled);
	
	}
	void enroll_Student(Student X) {
		   enrolled_students.add(X);
		   enrolled++;
	   }
	
	void Core_list() {
		for(int i =0; i < 6; i++ ) {
			System.out.println( i + "."  + "\t\t" + Core[i].course_name);
		}
	}
	
	void Elective_list(){
	    for(int i = 0; i < 3; i++){
	    	System.out.println( i + "."  + "\t\t" + electives[i].course_name);
	    }
	}
  ArrayList<Student> enrolled_students = new ArrayList<Student>();
	
}

class ECE extends abstract_branch{
	static int enrolled;
//	ArrayList<Courses> Core = new ArrayList<>();
//	ArrayList<Courses> electives = new ArrayList();
	final Courses[] Core = new Courses[6];
	final Courses[] electives = new Courses[4];
	ECE() {	
    	
	Core[0] = new Courses("Core", "Aa_ECE");
	Core[1] = new Courses("Core", "Bb_ECE");
	Core[2] = new Courses("Core", "Cc_ECE");
	Core[3] = new Courses("Core", "Dd_ECE");
	Core[4] = new Courses("Core", "Ee_ECE");
	Core[5] = new Courses("Core", "Ff_ECE");
	
	electives[0] = new Courses("elective", "Xx_ECE");
	electives[1] = new Courses("elective", "Yy_ECE");
	electives[2] = new Courses("elective", "Zz_ECE");
    };
    
	@Override
	boolean check_availability() {
		   return (no_of_seats > enrolled);
	
	}
	void enroll_Student(Student X) {
		   enrolled_students.add(X);
		   enrolled++;
	   }
	
	void Core_list() {
		for(int i =0; i < 6; i++ ) {
			System.out.println( i + "."  + "\t\t" + Core[i].course_name);
		}
	}
	
	void Elective_list(){
	    for(int i = 0; i < 3; i++){
	    	System.out.println( i + "."  + "\t\t" + electives[i].course_name);
	    }
	}
  ArrayList<Student> enrolled_students = new ArrayList<Student>();
}

class ME extends abstract_branch{
	static int enrolled;
//	ArrayList<Courses> Core = new ArrayList<>();
//	ArrayList<Courses> electives = new ArrayList();
	final Courses[] Core = new Courses[6];
	final Courses[] electives = new Courses[4];
	ME() {	
    	
	Core[0] = new Courses("Core", "Aa_CSE");
	Core[1] = new Courses("Core", "Bb_CSE");
	Core[2] = new Courses("Core", "Cc_CSE");
	Core[3] = new Courses("Core", "Dd_CSE");
	Core[4] = new Courses("Core", "Ee_CSE");
	Core[5] = new Courses("Core", "Ff_CSE");
	
	electives[0] = new Courses("elective", "Xx_CSE");
	electives[1] = new Courses("elective", "Yy_CSE");
	electives[2] = new Courses("elective", "Zz_CSE");
    };
    
	@Override
	boolean check_availability() {
		   return (no_of_seats > enrolled);
	
	}
	void enroll_Student(Student X) {
		   enrolled_students.add(X);
		   enrolled++;
	   }
	
	void Core_list() {
		for(int i =0; i < 6; i++ ) {
			System.out.println( i + "."  + "\t\t" + Core[i].course_name);
		}
	}
	
	void Elective_list(){
	    for(int i = 0; i < 3; i++){
	    	System.out.println( i + "."  + "\t\t" + electives[i].course_name);
	    }
	}
  ArrayList<Student> enrolled_students = new ArrayList<Student>();
}


