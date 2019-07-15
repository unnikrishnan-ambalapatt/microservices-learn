package org.learn.candidate;

import org.learn.candidate.vo.Candidate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CandidateService {

    private static List<Candidate> candidates = new ArrayList<>();

    static {
        candidates = Arrays.asList(new Candidate(1, "Sam", 23),
                new Candidate(2, "Tom", 26, Arrays.asList(1, 5)),
                new Candidate(3, "John", 27, Arrays.asList(3,4)),
                new Candidate(4, "Steve", 33, Arrays.asList(2)),
                new Candidate(5, "Mark", 35, Arrays.asList(1,2,3)));
    }

    public Candidate getCandidate(String name) {

        return candidates.stream()
                .filter(candidate -> candidate.getName().equalsIgnoreCase(name))
                .findFirst().orElse(new Candidate());
    }

    public List<Candidate> getCandidateForJob(Integer jobId) {
        return candidates.stream()
                .filter(candidate -> candidate.getJobsApplied() != null && candidate.getJobsApplied().contains(jobId)).collect(Collectors.toList());
    }
}

