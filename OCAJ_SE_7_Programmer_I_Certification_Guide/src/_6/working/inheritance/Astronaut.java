package _6.working.inheritance;

public class Astronaut extends EmployeeAbstract {

	public Astronaut(String name, int age) {
		super(name, age);
	}

	public static void aumentarEdad() {

	}

	@Override
	public void printName() {
		System.out.println(getName());
		System.out.println(this.name);
	}

	@Override
	public void printAge() {
		// TODO Auto-generated method stub

	}

	public void printName(String name) {

	}

	protected Astronaut trabajar() {
		return null;
	}

}
