package org.learn.recruiter;

import org.learn.recruiter.vo.Job;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RecruiterService {

    private static List<Job> jobs = new ArrayList<>();

    static {
        jobs = Arrays.asList(new Job(1, "Engineer"),
                new Job(2, "Developer"),
                new Job(3, "Programmer"),
                new Job(4, "Analyst"),
                new Job(5, "DBA"));
    }

    public List<Job> getAllJobs() {
        return jobs;
    }
}
