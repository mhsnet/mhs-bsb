package com.mhs.bsb.quartz.tutorial;

import org.springframework.web.bind.annotation.RestController;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
//import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.quartz.JobBuilder.*;
import static org.quartz.SimpleScheduleBuilder.*;
import static org.quartz.CronScheduleBuilder.*;
import static org.quartz.CalendarIntervalScheduleBuilder.*;
import static org.quartz.TriggerBuilder.*;
import static org.quartz.DateBuilder.*;

@RestController
@RequestMapping("/quartz/tutorial/")
public class TutorialApplication {
  public TutorialApplication() {
  }

  @RequestMapping("/")
  String home() {
    return "Quartz教程";
  }

  @RequestMapping("/using-quartz/")
  void usingQuartz() throws SchedulerException {
    SchedulerFactory schedFact = new StdSchedulerFactory();
    Scheduler sched = schedFact.getScheduler();
    sched.start();
    // 定义job并与HelloJob class联系起来
    JobDetail job = newJob(HelloJob.class)
        .withIdentity("myJob", "group1")
        .build();
    // Trigger(job立即运行，然后每40秒运行一次)
    Trigger trigger = newTrigger()
        .withIdentity("myTrigger", "group1")
        .startNow()
        .withSchedule(simpleSchedule()
            .withIntervalInSeconds(5)
            .repeatForever())
        .build();
    // 告诉quartz使用trigger schedule job
    sched.scheduleJob(job, trigger);
  }

}