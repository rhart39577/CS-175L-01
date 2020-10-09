import java.util.ArrayList;
public class StudentList {
private ArrayList<Student> students;
private Student[] studentArray;
	
	public StudentList(Student[] studentArray){
		setStudentArray(studentArray);
	}

	public Student[] getStudentArray() {
		return studentArray;
	}

	public void setStudentArray(Student[] studentArray) {
		this.studentArray = studentArray;
	}
	
	public int StudentCount(String major) {
		int count = 0;
				for (int i=0; i < studentArray.length; i++)
				{
					if (major == studentArray[i].getMajor())
							{
						count++;
						
							}
					
				}
		return count;
		
		
	}
	
	public Student getStudentInfo(String email) {
		for (int i =0; i < studentArray.length; i++ )
		{
			if (email == studentArray[i].getEmail())
			{
				return studentArray[i];
			}
		}
		
		return null;
	}
	
	public String getAllStudentInfo() {
		String allStudentInfo = "";
		for (int i = 0; i < studentArray.length; i++) {
			allStudentInfo = allStudentInfo + studentArray[i].toString() + System.lineSeparator();
		}
		return allStudentInfo;
	}
	
	
	public boolean updateStundentGraduationYear (String email, Integer graduationYear) {
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].getEmail()==email) {
				studentArray[i].setGraduationYear(graduationYear);
				
			}
		}
		return true;
	}
	
	public boolean addStudent(Student student ) {
		if (!students.contains(student)) {
			students.add(student);
			return true;
			}
		return false;
	}
	public void removeStudent(Student student) {
		students.remove(student);
	}

}

		


