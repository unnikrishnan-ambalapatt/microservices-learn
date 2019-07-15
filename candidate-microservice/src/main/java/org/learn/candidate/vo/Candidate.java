package org.learn.candidate.vo;

import java.util.List;

public class Candidate {

    private Integer id;
    private String name;
    private Integer age;
    private List<Integer> jobsApplied;

    public Candidate() {
    }

    public Candidate(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Candidate(Integer id, String name, Integer age, List<Integer> jobsApplied) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.jobsApplied = jobsApplied;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Integer> getJobsApplied() {
        return jobsApplied;
    }

    public void setJobsApplied(List<Integer> jobsApplied) {
        this.jobsApplied = jobsApplied;
    }
}
