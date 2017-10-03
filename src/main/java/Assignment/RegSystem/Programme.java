package Assignment.RegSystem;
import java.util.ArrayList;

import org.joda.time.LocalDate;

public class Programme {
	
	//  (Course Name (CS & IT or ECE, etc), List of modules, Academic Start date and End dates
	String courseName;
    private ArrayList<Module> moduleList;
	LocalDate startDate;
	LocalDate endDate;	
	
	public Programme(String courseNme, ArrayList<Module> moduleList, LocalDate startD, LocalDate endD) {
		
		this.courseName = courseNme;
		this.moduleList = new ArrayList<Module>();
		this.startDate = startD;
		this.endDate = endD;
	}
	
	public void setCourseName(String courseNme) {
		
		this.courseName = courseNme;

	}	
	public void setModules(ArrayList<Module> moduleList) {
		
		this.moduleList = moduleList;

	}
	public void setStartDate(LocalDate startD) {
		this.startDate = startD;
	}
	
	public void setEndDate(LocalDate endD) {
		this.endDate = endD;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public ArrayList<Module> getModules() {
		return moduleList;
		
	}
	
	public LocalDate getStartDate() {
		return startDate;
		
	}
	
	public LocalDate getEndDate() {
		return endDate;
		
	}
	public String toString() {
		 String sentence = "Student Course Name: " + getCourseName() +
				   "\nStudent Module: " + getModules() +
				   "\nStudent Start Date: " + getStartDate() +
				   "\nStudent End Date: " + getEndDate();				
		return sentence;		
	}
	//Start and end dates should use Joda Time
	//classes, which should be added as a project dependency
    public static void main(String[] args) {
    	Programme module = new Programme("Computer Science", null, null, null);
        System.out.println(module);
	}
}
