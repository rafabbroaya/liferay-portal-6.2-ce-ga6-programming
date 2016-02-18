package _6.working.inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		/*
		 * Doctor doctor = new Doctor(); doctor.setName("Bernardo"); doctor.name
		 * = "Jose"; doctor.setSuperName("Super Name");
		 * System.out.println(doctor.getName());
		 * System.out.println(doctor.name);
		 * System.out.println(doctor.getSuperName());
		 * 
		 * 
		 * EmployeeAbstract employeeAbstract = new Programmer();
		 * employeeAbstract.setName("Rafael"); employeeAbstract.printName();
		 * 
		 * InterfaceTrainable doctor1 = new Doctor();
		 * doctor1.attendTraining(null);
		 * 
		 * 
		 * EmployeeAbstract employeeAbstract = new Astronaut("Rafael", 30);
		 * Astronaut astronaut = (Astronaut) employeeAbstract;
		 * astronaut.printName();
		 */

		Employee employee = new Employee();
		Employee humanResourcesMan = new HumanResourcesMan();
		System.out.println(employee.name);
		System.out.println(humanResourcesMan.name);
		employee.printName();
		humanResourcesMan.printName();
	}

}
