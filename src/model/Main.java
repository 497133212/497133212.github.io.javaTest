package model;

public class Main {
	public static void main(String[] args) {
		String name = "����";
		int age = 16;
		String gender = "��";
		String id = "123456";
		Student s = new Student(name, age, gender, id);
		System.out.println("����:" + s.getName());
		System.out.println("����:" + s.getAge());
		System.out.println("�Ա�:" + s.getGender());
		System.out.println("ID:" + s.getId());
	}
}
