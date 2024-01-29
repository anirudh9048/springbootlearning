package com.aka.jst;


public class Job {
    String company;
    String role;
    int salary;

    public Job(String company, String role, int salary) {
        this.company = company;
        this.role = role;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Job{" +
                "company='" + company + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
}
