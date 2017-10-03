package Assignment.RegSystem;
import java.util.ArrayList;

public class Module {
	// contain information such as (Module Name, ID(CT417), List of students)
	private String moduleName;
	private String id;
    private ArrayList<Student> studentList;

	
	public Module(String moduleNme, String id1, ArrayList<Student> studentList) {
		
		this.moduleName = moduleNme;
		this.id = id1;//
		this.studentList = new ArrayList<Student>();

	}
	
	public void setModuleName(String moduleNme) {
		
		this.moduleName = moduleNme;

	}
	
	public void setID(String id1) {
		
		this.id = id1;

	}
	
	public void setStudentList(ArrayList<Student> studentList) {
		
        this.studentList = studentList;
	}
	
	public String getModuleName() {
		return moduleName;
		
		
	}
	
	public String getID() {
		return id;
		
	}
	
	public ArrayList<Student> getStudentList() {
		return studentList;
		
	}
	
	public String toString() {
		String sentence = "Student Module Name: " + getModuleName() +
				   "\nStudent ID: " + getID() +
				   "\nStudent List: " + getStudentList();				
		return sentence;		
	}
	
    public static void main(String[] args) {
    	Module module = new Module("Software Engineering III", "1433586", null);
        System.out.println(module);
	}

}
