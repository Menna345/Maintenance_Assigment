package Users;

import java.sql.Date;

public class Professor extends Users{
	
	String department;
	Date hirringDate;
	String PhDTopic;
	
	
	
	public Professor(String name, String department, Date hirringDate, String phDTopic, String email,
			String phoneNumber) {
		super();
		this.name = name;
		this.department = department;
		this.hirringDate = hirringDate;
		PhDTopic = phDTopic;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getHirringDate() {
		return hirringDate;
	}
	public void setHirringDate(Date hirringDate) {
		this.hirringDate = hirringDate;
	}
	public String getPhDTopic() {
		return PhDTopic;
	}
	public void setPhDTopic(String phDTopic) {
		PhDTopic = phDTopic;
	}
	
	
	@Override
	public void update(String message) {
	}
	
	
	
	
}
