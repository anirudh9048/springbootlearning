package com.aka.jst;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

@Component
public class JobAddService {

    List<Job> jobs;

    public JobAddService() {
        this.jobs = new ArrayList<>();
    }

    public void addJob(Job j) {
        this.jobs.add(j);
    }

    public void addJobList(List<Job> jobList) {
        this.jobs.addAll(jobList);
    }

    @Bean
    public Job createJob() {
        return new Job("Sample Test Company", "Sample Test Role", 0);
    }


//    @Bean
    public List<Job> loadJobsFromFile(String filename) {
        List<Job> jobs = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
                String[] fields = line.split(",");
                jobs.add(new Job(fields[0], fields[1], Integer.parseInt(fields[2])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jobs;
    }

//    @Bean
//    public Job createCustomJob(String company, String role, int salary) {
//        return new Job(company, role, salary);
//    }

}
