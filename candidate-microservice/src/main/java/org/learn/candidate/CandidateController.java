package org.learn.candidate;

import org.learn.candidate.vo.Candidate;
import org.learn.candidate.vo.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    CandidateService candidateService;

    @RequestMapping("/{name}")
    public Candidate getCandidate(@PathVariable String name) {
        return candidateService.getCandidate(name);
    }

    @RequestMapping("/jobs/{jobId}")
    public Job getCandidateForJob(@PathVariable Integer jobId) {
        return new Job(jobId, "", candidateService.getCandidateForJob(jobId));
    }
}
