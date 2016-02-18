package _6.working.inheritance;

public class Programmer extends EmployeeAbstract implements InterfaceTrainable {

	@Override
	public void printName() {
		System.out.println(getName());

	}

	@Override
	public void printAge() {
		System.out.println(getAge());

	}

	@Override
	public void attendTraining(String[] trainingSchedule) {
		System.out.println("Programmer traing");
	}

	@Override
	public void conductInterview() {
		// TODO Auto-generated method stub
		
	}

}
