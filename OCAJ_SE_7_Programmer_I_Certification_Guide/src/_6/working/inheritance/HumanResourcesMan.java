package _6.working.inheritance;

public class HumanResourcesMan extends Employee implements InterfaceInterviewer {

	String name;

	public HumanResourcesMan() {
		this.name = "Human Resources Man";
	}

	public void printName() {
		System.out.println(this.name);
	}

	@Override
	public void conductInterview() {
		System.out.println("Human resorurces conduct interview");

	}

	public void testInterface(InterfaceInterviewer interfaceInterviewer) {
		interfaceInterviewer.conductInterview();
	}

	public static void main(String[] args) {
		HumanResourcesMan humanResourcesMan = new HumanResourcesMan();
		humanResourcesMan.testInterface(humanResourcesMan);
	}

}
