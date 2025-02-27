package com.yogesh.JOBPORTAL_BACKEND;

import com.yogesh.JOBPORTAL_BACKEND.model.JobPost;
import com.yogesh.JOBPORTAL_BACKEND.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController                             // using RestController if our whole controller is returning rest data don't need ResponseBody
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
//    @ResponseBody                          //we are using this coz whenever we use controller it thinks that we are returning View name but here we are not using JSP using ResponseBody it understand we are sending body(data).
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    
}
