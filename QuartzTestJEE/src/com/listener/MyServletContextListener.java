package com.listener;

import java.text.ParseException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

import com.test.quartz.HelloQuartz;

public class MyServletContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		try {
			Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
			if (scheduler != null) {
				System.out.println("Shutdown scheduler");
				scheduler.shutdown();
			}
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("My Servlet Context Initialized");
		
		try {
			Scheduler scheduler = new StdSchedulerFactory().getScheduler();
			scheduler.start();
			
			JobDetail job = new JobDetail();
			job.setName("dummyJob");
			job.setJobClass(HelloQuartz.class);
			
			CronTrigger trigger = new CronTrigger();
			trigger.setName("dummyCronTrigger");
			//Fire at 10:15am every day during the year 2016
			trigger.setCronExpression("0/5 0-59 9-18 16 2 ? 2016");
			
			scheduler.scheduleJob(job, trigger);
			
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
