package pmanage.domain;

public class User {
	private  static int idUser;
	private  static String email;
	private  static String password;
	private  static String fname;
	private  static String lname;
	private  static boolean isApproved;
	private  static String created_at;
	private  static String updated_at;
	public static int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		User.idUser = idUser;
	}
	public static String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		User.email = email;
	}
	public static String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		User.password = password;
	}
	public static String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		User.fname = fname;
	}
	public static String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		User.lname = lname;
	}
	public static boolean isApproved() {
		return isApproved;
	}
	public void setApproved(boolean isApproved) {
		User.isApproved = isApproved;
	}
	public static String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		User.created_at = created_at;
	}
	public static String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		User.updated_at = updated_at;
	}
	public User() {
		super();
	}
	public User(int idUser, String email, String password, String fname, String lname, boolean isApproved,
			String created_at, String updated_at) {
		super();
		User.idUser = idUser;
		User.email = email;
		User.password = password;
		User.fname = fname;
		User.lname = lname;
		User.isApproved = isApproved;
		User.created_at = created_at;
		User.updated_at = updated_at;
	}
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", email=" + email + ", password=" + password + ", fname=" + fname
				+ ", lname=" + lname + ", isApproved=" + isApproved + ", created_at=" + created_at + ", updated_at="
				+ updated_at + "]";
	}
	
	
	
	
}
