package com.mizrak.hrms.business.abstracts;

import java.util.List;

import com.mizrak.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
