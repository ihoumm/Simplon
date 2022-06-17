package todoListEntity;

public class User {
	private int userId;
	private String first_name, last_name, usrename, password;
	public User() {
		super();
	}
	public User(int userId, String first_name, String last_name, String usrename, String password) {
		super();
		this.userId = userId;
		this.first_name = first_name;
		this.last_name = last_name;
		this.usrename = usrename;
		this.password = password;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUsrename() {
		return usrename;
	}
	public void setUsrename(String usrename) {
		this.usrename = usrename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", first_name=" + first_name + ", last_name=" + last_name + ", usrename="
				+ usrename + ", password=" + password + "]";
	}
	
}
