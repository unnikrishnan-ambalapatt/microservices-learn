package org.learn.candidate.vo;

import java.util.List;

public class Job {

    private Integer jobId;
    private String jobName;
    List<Candidate> candidates;

    public Job() {
    }

    public Job(Integer jobId, String jobName) {
        this.jobId = jobId;
        this.jobName = jobName;
    }

    public Job(Integer jobId, String jobName, List<Candidate> candidates) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.candidates = candidates;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }
}
