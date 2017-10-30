package DesignPattern.Proxy.ex1;

public class Student {
	private int id;
	private String name;
	private boolean Gender;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public boolean isGender() {
		return Gender;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(boolean gender) {
		Gender = gender;
	}
	
}
