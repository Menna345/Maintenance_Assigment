package Users;

public abstract  class Users {
	 String name;
	 String email;
	 String phoneNumber;
	
	 public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	public abstract void update(String message);
			

}
