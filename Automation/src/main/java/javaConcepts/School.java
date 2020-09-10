package javaConcepts;

public class School extends States {

 public void subject() {
	 System.out.println("SUBJECT NAMES:");

	 System.out.println("TAMIL");
	 System.out.println("ENGLISH");
	 System.out.println("HINDI");
	 System.out.println("MATHS");
	 System.out.println("PHYSICS");
	 System.out.println("CHEMISTRY");
	 System.out.println("COMPUTER SCIENCE");
	 System.out.println("BIOLOGY");
	 System.out.println("HISTRY");
	 System.out.println("ENVIRONMENTAL");	 

 }
 public void studentName () {
	 System.out.println("STUDENT NAMES:");
	 System.out.println("RAM");
	 System.out.println("SHIVA"); 
	 System.out.println("RAGU");
	 System.out.println("ARUN");
	 System.out.println("RAVI");
	 System.out.println("ASWIN");
 
}
 public static void main(String[] args) {
	School f2 = new School();
	f2.subject();
	f2.studentName();
	dist1();
}

}