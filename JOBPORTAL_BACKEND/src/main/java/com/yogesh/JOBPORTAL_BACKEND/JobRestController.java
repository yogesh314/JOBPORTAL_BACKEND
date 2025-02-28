package com.yogesh.JOBPORTAL_BACKEND;

import com.yogesh.JOBPORTAL_BACKEND.model.JobPost;
import com.yogesh.JOBPORTAL_BACKEND.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController                                       //Using RestController if our whole controller is returning rest data don't need ResponseBody
@CrossOrigin(origins = "http://localhost:3000")       //Adding this to solve the security issue between frontend and backend
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
//    @ResponseBody                          //we are using this coz whenever we use controller it thinks that we are returning View name but here we are not using JSP using ResponseBody it understand we are sending body(data).
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){              //Adding PathVariable so that we can fetch postId from url
        return service.getJob(postId);
    }

    @PostMapping("jobPost")                                                 //We are using PostMapping to get data from user we can use same endpoint in GetMapping and PostMapping
    public void addJob(@RequestBody JobPost jobPost){                       //Here We are using RequestBody to Map Json data that we are getting from user to JobPost object
        service.addJob(jobPost);
    }
}
