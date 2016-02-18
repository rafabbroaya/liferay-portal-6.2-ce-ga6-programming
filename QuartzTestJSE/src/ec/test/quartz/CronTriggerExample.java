package ec.test.quartz;

import java.text.ParseException;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

public class CronTriggerExample {
	public static void main(String[] args) {
		JobDetail job = new JobDetail();
		job.setName("dummyJob");
		job.setJobClass(HelloQuartz.class);
		
		CronTrigger trigger = new CronTrigger();
		try {
			trigger.setName("dummyTrigger");
			trigger.setCronExpression("0/10 * * * * ? 2016");
			
			Scheduler scheduler = new StdSchedulerFactory().getScheduler();
			scheduler.start();
			scheduler.scheduleJob(job, trigger);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
