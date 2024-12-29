package com.rishabh.JobApplication.service;

import com.rishabh.JobApplication.dao.JobDao;
import com.rishabh.JobApplication.model.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class JobService {
    @Autowired
    private JobDao jobDao;


    public List<Jobs> findAllJob() {
        return jobDao.findAll();

    }

    public Jobs addJob(Jobs jobs) {
        return jobDao.save(jobs);
    }

    public Optional<Jobs> getJobById(Integer id) {
        return jobDao.findById(id);
    }

    public void deleteJobById(Integer id) {
        jobDao.deleteById(id);
    }
}
