package _6.working.inheritance;

public abstract class EmployeeAbstract {

	public String name;
	private int age;

	public EmployeeAbstract() {
	}
	
	public EmployeeAbstract(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	public abstract void printName();

	public abstract void printAge();

	EmployeeAbstract trabajar() {
		return null;
	}
}
