package com.mhs.bsb.quartz;

import org.springframework.web.bind.annotation.RestController;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/quartz/")
public class QuartzApplication {
  public QuartzApplication() {
  }

  @RequestMapping("/")
  String home() {
    return "quartz";
  }

  @RequestMapping("/test/")
  void test() {
    try {
      Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
      scheduler.start();
      scheduler.shutdown();

    } catch (SchedulerException se) {
      se.printStackTrace();
    }
  }
  @RequestMapping("/using-quartz/")
  void usingQuartz() {
    try {
      Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
      scheduler.start();
      scheduler.shutdown();

    } catch (SchedulerException se) {
      se.printStackTrace();
    }
  }

}