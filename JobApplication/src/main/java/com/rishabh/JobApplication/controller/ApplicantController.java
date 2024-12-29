package com.rishabh.JobApplication.controller;

import com.rishabh.JobApplication.model.Applicant;
import com.rishabh.JobApplication.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("applicant")

public class ApplicantController {
    @Autowired
    private ApplicantService applicantService;
    @PostMapping("add")
    public Applicant   addApplicant(@RequestBody Applicant applicant){
        return  applicantService.addApplicant(applicant);

    }
    @GetMapping("get")
    public List<Applicant> getApplicant(){
        return applicantService.getApplicant();
    }
    @GetMapping("get/{id}")
    public Optional<Applicant> getApplicantByID(@PathVariable Integer id){
        return applicantService.getApplicantById(id);
    }
    @DeleteMapping("del/{id}")
    public void deleteByid(@PathVariable Integer id){
        applicantService.deleteById(id);
    }


}
