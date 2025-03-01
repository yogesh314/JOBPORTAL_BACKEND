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
        repo.save(jobPost);
    }

    public List<JobPost> getAllJobs(){
            return repo.findAll();
    }

    public JobPost getJob(int postId) {
        return repo.findById(postId).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public void deletePost(int postId) {
        repo.deleteById(postId);
    }
}
