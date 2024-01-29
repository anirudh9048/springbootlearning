package com.aka.jst;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Runner {
    @Autowired
    JobAddService service;


    @Autowired
    Job testJob;

    public void test() {
        System.out.println("Test Job : " + testJob);
    }

    public void run() {
        System.out.println("App started");
//        service.addJob(service.createJob());
//        for (Job j : service.jobs) {
//            System.out.println(j);
//        }
        List<Job> list = service.loadJobsFromFile("/Users/anirudhaddepalli/IdeaProjects/jobsearch/src/main/resources/jobs");

        for (Job j : list) {
            System.out.println("Added Job " + j.toString());
        }
    }
}
