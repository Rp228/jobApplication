package com.rishabh.JobApplication.dao;

import com.rishabh.JobApplication.model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public  interface ApplicantDao extends JpaRepository<Applicant, Integer> {

}
