package javaConcepts;

public class College {
	public void collegeName () {
		System.out.println("COLLEGE NAME:");
		
		
		System.out.println("Sona college of technology");
		
		
	}
	public static void department() {
		
		System.out.println("DEPARTMENT:");
		System.out.println("B.com");
		System.out.println("BA(English)");
		System.out.println("BCA");
		System.out.println("B.SC(maths,chemistry,computer science)");
		System.out.println("B.E(computer science,civil,mech)");
		
	}
	public static void departmentWisePassedStudentsOfPercentage() {
		
		System.out.println("DEPARTMENT WISE OF PASSED STUDENTS :");
		System.out.println("B.com = 80%");
		System.out.println("BA(English) = 70%");
		System.out.println("BCA = 65%");
		System.out.println("B.SC(maths = 95%");
		System.out.println("B.E(computer science = 100%)");
		
		//
		
	}
	public static void departmentWiseFailedStudentsOfPercentage() {

	System.out.println("DEPARTMENTS WISE OF FAILED STDUENTS :");
	System.out.println("B.com = 20%");
	System.out.println("BA(English) = 30%");
	System.out.println("BCA = 35%");
	System.out.println("B.SC(maths = 5%");
	System.out.println("B.E(computer science = 0%)");
//
	}
	public void departmentInRankWise() {
		
		System.out.println("RANK OF DEPARTMENTS  :");
        System.out.println("B.E Computer science = FIRST RANK");
		System.out.println("B.SC Maths = SECOND RANK");
		System.out.println("B.com = THRIED RANK");
		System.out.println("BA English = FOURTH RANK");
		System.out.println("BCA = FIFTH RANK");

	}

	
 public static void main(String[] args) {
	 College f1 = new College();
	 f1.collegeName();
	 department();
	 departmentWisePassedStudentsOfPercentage();
	 departmentWiseFailedStudentsOfPercentage();
	f1.departmentInRankWise(); 
	 
}
}
