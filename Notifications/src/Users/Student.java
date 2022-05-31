package Users;

public class Student extends Users {
	
	int Id;
	
	
	
	
	public Student(String name, int id, String email, String phoneNumber) {
		super();
		this.name = name;
		Id = id;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}


	

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
	@Override
	
	public void update(String message) {
		
	}
	
}
