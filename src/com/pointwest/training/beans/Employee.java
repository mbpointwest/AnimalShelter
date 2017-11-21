public class Employee {
	
	private int employeeId;
private String firstName;
	
	public Employee() {
		this.id = 1;
		this.firstName = "Juan";
	}
	
	public void setId(int employeeId) {
		this.employeeId = employeeId;

	}
	
	public int getId() {
		return employeeId;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
}