package lab.mvc.model;

public class Person {
	
	private String firstName;
	private String lastName;
	private String birthDay;
	private String sex;
	
	public Person(String f, String l, String b, String s){
		this.firstName = f;
		this.lastName = l;
		this.birthDay = b;
		this.sex = s;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	

}
