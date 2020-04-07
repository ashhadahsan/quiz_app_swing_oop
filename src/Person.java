import java.io.Serializable;

public class Person  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name,gender,phone;
	private int age;
	public Person() {

	}
	public Person(String n,String gen,String ph,int  ag) {
		
			
		name=n;gender=gen;phone=ph;age=ag;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
