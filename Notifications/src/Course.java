import java.util.ArrayList;

import Gateways.EmailGateway;
import Messages.TaskAddedEmailMessage;
import Users.Users;

public class Course  {
	
	String name;
	String code;
	ArrayList<String> announcements;
	ArrayList<String> exams;
	ArrayList<String> grades;
	
	ArrayList<Users> usersForEmailNotification;
	ArrayList<Users	> usersForSMSNotification;
	
	
	
	public Course(String name, String code) {
		super();
		this.name = name;
		this.code = code;
		
		announcements = new ArrayList<>();
		exams = new ArrayList<>();
		grades = new ArrayList<>();
		
		usersForEmailNotification = new ArrayList<>();
		usersForSMSNotification = new ArrayList<>();
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public void subscribeUserForEmailNotification(Users user) {
		usersForEmailNotification.add(user);
	}
	
	public void subscribeUserForSMSNotification(Users user) {
		usersForSMSNotification.add(user);
	}
	
	
	public void addAssignment(String assignName, String assignBody) {
		announcements.add(assignName);
		String[] placeholders = new String[] {assignName, assignBody};
		// do some logic here 
		
		notifyAllUsers(placeholders);
	}
	
	// AddExam, PostGrades, PostAnnouncement  will be the same 

	private void notifyAllUsers(String[] placeholders) {
		// notify users by email
		TaskAddedEmailMessage msg = new TaskAddedEmailMessage();
		
		String notification = msg.prepareMessage(placeholders);
		
		// open connection for Email gateway and do some configurations to the object
		
		EmailGateway emailGateway = new EmailGateway();
		
		
		
		for (Users user : usersForEmailNotification) {
			user.update(notification);
			emailGateway.sendMessage(notification,user.getEmail());
		}
		
		
	}
	
	
	
	
}
