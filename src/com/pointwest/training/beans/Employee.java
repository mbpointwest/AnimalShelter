public class Employee {
	
	private int employeeId;
	private String name;
	
	public Employee() {
		this.employeeId = 2;
		this.name = "Juan";
	}
	
	public void setId(int employeeId) {
		this.employeeId = employeeId;

	}
	
	public int getId() {
		return employeeId;
	}
	
	public void setFirstName(String name) {
		this.name = name;
	}
	
	public String getFirstName() {
		return name;
	}
}