package Users;

public class TA extends Users{
	String department;
	
	

	public TA(String name, String department, String email, String phoneNumber) {
		super();
		this.name = name;
		this.department = department;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}


	

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public void update(String message) {	
}
}
