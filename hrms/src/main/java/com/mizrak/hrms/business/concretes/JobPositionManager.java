package com.mizrak.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mizrak.hrms.business.abstracts.JobPositionService;
import com.mizrak.hrms.dataAccess.abstracts.JobPositionDao;
import com.mizrak.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPosition;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPosition) {
		super();
		this.jobPosition = jobPosition;
	}
	
	@Override
	public List<JobPosition> getAll() {
		
		return this.jobPosition.findAll();
	}

}
