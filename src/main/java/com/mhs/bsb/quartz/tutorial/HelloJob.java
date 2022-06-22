package com.mhs.bsb.quartz.tutorial;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJob implements Job {
  public HelloJob() {
  }

  public void execute(JobExecutionContext context) throws JobExecutionException {
    System.err.println("你好!HelloJob正在执行。");
  }
}
