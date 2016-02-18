package _6.working.inheritance;

public class Employee {

	String name;
	private int age;

	Employee() {
		this.name = "Employee Default";
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
	
	public void printName(){
		System.out.println(this.name);
	}

}
