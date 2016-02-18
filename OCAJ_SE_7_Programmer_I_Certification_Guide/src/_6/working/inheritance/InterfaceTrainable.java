package _6.working.inheritance;

public interface InterfaceTrainable extends InterfaceInterviewer, EmployeeInterface{
	int maxDays = 20;
	//public final static maxDays = 20;

	void attendTraining(String[] trainingSchedule);
}
