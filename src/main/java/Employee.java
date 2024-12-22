
public class Employee {

	private int empId;
	private String empName;
	private double empSalaray;
	private String empLocation;
	private int empAge;
	
	
	
	public Employee(int empId, String empName, double empSalaray, String empLocation, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalaray = empSalaray;
		this.empLocation = empLocation;
		this.empAge = empAge;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalaray() {
		return empSalaray;
	}
	public void setEmpSalaray(double empSalaray) {
		this.empSalaray = empSalaray;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	
}
