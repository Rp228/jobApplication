package com.rishabh.JobApplication.controller;

import com.rishabh.JobApplication.model.Jobs;
import com.rishabh.JobApplication.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchTransactionManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("job")
public class JobController {
    @Autowired
    private JobService jobService;
    @GetMapping("getjobs")
    public List<Jobs> findAllJob(){
        return jobService.findAllJob();
    }
    @PostMapping("createJob")
    public Jobs addJob(@RequestBody Jobs jobs){
        return jobService.addJob(jobs);

    }
    @GetMapping("getjobs/{id}")
    public Optional<Jobs> getJobById(@PathVariable Integer id){
        return jobService.getJobById(id);

    }
    @DeleteMapping("delete/{id}")
    public void deleteJobById(@PathVariable Integer id){
        jobService.deleteJobById(id);
    }
}
