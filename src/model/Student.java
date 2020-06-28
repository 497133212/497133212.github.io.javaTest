package model;

public class Student {
	public String name;
	public int age;
	public String gender;
	public String id;
	
	public Student(String name, int age, String gender, String id) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
