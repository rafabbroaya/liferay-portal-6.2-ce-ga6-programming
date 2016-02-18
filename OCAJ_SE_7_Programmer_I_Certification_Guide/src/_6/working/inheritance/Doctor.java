package _6.working.inheritance;

public class Doctor extends Employee implements InterfaceTrainable,
		InterfaceInterviewer {

	Doctor() {
		this.name = "Doctor Default";
	}

	protected String name;

	@Override
	public void attendTraining(String[] trainingSchedule) {
		System.out.println("Doctor Attend training: "+this.name+":"+super.getName());
	}

	@Override
	public void conductInterview() {
		System.out.println("Doctor interview");
	}
	
	public String getSuperName(){
		return super.getName();
	}
	
	public void setSuperName(String name){
		super.name = name;
	}
}
