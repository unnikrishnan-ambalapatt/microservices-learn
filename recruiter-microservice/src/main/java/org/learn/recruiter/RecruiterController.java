package org.learn.recruiter;

import org.learn.recruiter.vo.Candidate;
import org.learn.recruiter.vo.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/recruiter")
public class RecruiterController {

    @Autowired
    private RecruiterService recruiterService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/jobs")
    public List<Job> getAllJobs() {
        List<Job> allJobs = recruiterService.getAllJobs();
        allJobs.stream().forEach(j -> {
            //Preserve existing job data and use only list of candidates from returned service
            Job job = restTemplate
                    .getForObject("http://candidate-service/candidate/jobs/" + j.getJobId(), Job.class);
            if(job != null && job.getCandidates() != null ) {
                j.setCandidates(job.getCandidates());
            }
        });
        return allJobs;
    }

    @RequestMapping("/jobs/{name}")
    public Candidate getJobsFor(@PathVariable String name) {
        return restTemplate
                .getForObject("http://candidate-service/candidate/" + name,
                        Candidate.class);
    }
}
