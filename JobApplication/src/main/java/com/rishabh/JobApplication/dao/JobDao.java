package com.rishabh.JobApplication.dao;

import com.rishabh.JobApplication.model.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface JobDao extends JpaRepository <Jobs,Integer>{

}
