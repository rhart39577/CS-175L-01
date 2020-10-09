

public class Assign5Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student verny = new Student("Verny P. Barbaro", "s1060002@monmouth.edu", "SE", 2022);
		Student sam = new Student("Samatha S. Holms", "s7712346@monmouth.edu", "CS", 2022);
		Student rob = new Student ("Robert T. Hart", "s1197112@monmouth.edu", "CS", 2022);
		Student james = new Student("James R. Smith", "s1112211@monmouth.edu", "SE", 2022);
		Student Kim = new Student ("Kimberly S. Lyons", "s2225522@monmouth.edu", "CS", 2022);

		Student[] studentArray = { verny, sam, rob};
		StudentList myStudentList = new StudentList(studentArray);
		
		System.out.println(myStudentList.getAllStudentInfo());
		myStudentList.removeStudent(verny);
		myStudentList.addStudent(james);
		myStudentList.addStudent(Kim);
		
		
		
		
		

	}

}
