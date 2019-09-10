package Registration;

import java.util.ArrayList;

import java.util.HashMap;

public class Student {
	public String name;
	public int id =0;
	String branch;
	
	ArrayList<Courses> courses_enrolled = new ArrayList<Courses>();
	
//	In hashMap String will be the course_enrolled[i].course_name
	
	HashMap<String , Character> grades = new HashMap<String, Character>();
	//Default constructor will be used to increment the id
	Student(){
		this.id += id;
	}
	Student(String Name, String Branch){
		this.name = Name;
		this.branch = Branch;
		this.id = id+1;
	}
	
	void list_course() {
		System.out.println("Enrolled_courses:");
		for(Courses k : courses_enrolled) {
			System.out.println(k.course_name + "\t\t" + k.course_type);
		}
	}
//	since maps cannot be interated directly from iterator as they are not collections
//	for(HashMap.Entry<K, V> block : grades.entrySet()....is possible solution
//	or we can just use for_each  with lambda
	void gradesheet() {
		System.out.println("Gradesheet of" + this.name + ":");
		grades.forEach((k,v) -> System.out.println(k + "\t\t" + v));
	}
	
	void add_grade(Courses c,Character d) {
//		String temp = this.name;
		int temp = 0;
		while (c.course_name != courses_enrolled.get(temp).course_name) temp++;
		grades.put(c.course_name,  d);
	}
         
	void add_Course(Courses k){
		courses_enrolled.add(k);
		
	}
}