package Users;

public class Student extends Users {
	
	 int id;
	
	
	
	
	public Student(String name, int iD, String email, String phoneNumber) {
		super();
		this.name = name;
		this.id = iD;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}


	

	public int getId() {
		return id;
	}

	public void setId(int iD) {
		this.id = iD;
	}
	
	@Override
	
	public void update(String message) {
		
	}
	
}
