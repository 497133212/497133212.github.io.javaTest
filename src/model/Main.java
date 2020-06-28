package model;

public class Main {
	public static void main(String[] args) {
		String name = "张三";
		int age = 16;
		String gender = "男";
		String id = "123456";
		Student s = new Student(name, age, gender, id);
		System.out.println("姓名:" + s.getName());
		System.out.println("年龄:" + s.getAge());
		System.out.println("性别:" + s.getGender());
		System.out.println("ID:" + s.getId());
	}
}
