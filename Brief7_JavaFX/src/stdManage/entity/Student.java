package stdManage.entity;

public class Student {
	
	private int id;
	private String email, first_name, last_name, address, city, country;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Student() {
		super();
	}
	public Student(int id, String email, String first_name, String last_name, String address, String city, String country) {
		super();
		this.id = id;
		this.email = email;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.city = city;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", email=" + email + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", address=" + address + ", city=" + city + ", country=" + country + "]";
	}
	
	
	
}
