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
		this.moduleList = moduleList;
		this.startDate = startD;
		this.endDate = endD;
	}
		
	public void setCourseName(String courseNme) {
		
		this.courseName = courseNme;

	}	
	public void setModules(ArrayList moduleList) {
		
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
	
	public void addModule(Module module) {
		moduleList.add(module);
	}
	public LocalDate getStartDate() {
		return startDate;
		
	}
	
	public LocalDate getEndDate() {
		return endDate;
		
	}
   
	public String toString() {
		 String sentence = "Student Course Name: " + getCourseName() +
				   "\nStudent Module: " + getModules()+
				   "\nStudent Start Date: " + getStartDate() +
				   "\nStudent End Date: " + getEndDate()
				   + "\n";				
		return sentence;		
	}

//	public static void main(String[] args) {
//    	Programme programme = new Programme("Computer Science", null, new LocalDate(2017, 10, 02), new LocalDate(2018, 05, 12));
//        System.out.println(programme);
//	}
}