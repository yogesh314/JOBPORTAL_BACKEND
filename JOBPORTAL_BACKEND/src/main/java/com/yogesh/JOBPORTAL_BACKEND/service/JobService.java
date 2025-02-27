package com.yogesh.JOBPORTAL_BACKEND.service;

import com.yogesh.JOBPORTAL_BACKEND.Repo.JobRepo;
import com.yogesh.JOBPORTAL_BACKEND.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
            return repo.getAllJobs();
    }
}
