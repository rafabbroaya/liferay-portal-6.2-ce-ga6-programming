package ec.test.quartz;

import java.util.Date;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleTrigger;
import org.quartz.impl.StdSchedulerFactory;

public class SimpleTriggerExample {

	public static void main(String[] args) {
		JobDetail job = new JobDetail();
		job.setName("dummyJob");
		job.setJobClass(HelloQuartz.class);
		
		SimpleTrigger trigger = new SimpleTrigger();
		trigger.setName("dummySimpleTrigger");
		trigger.setStartTime(new Date());
		trigger.setRepeatCount(SimpleTrigger.REPEAT_INDEFINITELY);
		trigger.setRepeatInterval(10000);
		
		try {
			Scheduler scheduler = new StdSchedulerFactory().getScheduler();
			scheduler.start();
			scheduler.scheduleJob(job, trigger);
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
