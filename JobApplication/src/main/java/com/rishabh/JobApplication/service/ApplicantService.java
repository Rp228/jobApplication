package com.rishabh.JobApplication.service;

import com.rishabh.JobApplication.dao.ApplicantDao;
import com.rishabh.JobApplication.model.Applicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ApplicantService {
     @Autowired
     private ApplicantDao applicantDao;


    public  Applicant addApplicant(Applicant applicant) {
        return applicantDao.save(applicant);


    }

    public List<Applicant> getApplicant() {
        return applicantDao.findAll();
    }

    public Optional<Applicant> getApplicantById(Integer id) {
        return applicantDao.findById(id);
    }

    public void deleteById(Integer id) {
        applicantDao.deleteById(id);
    }
}
