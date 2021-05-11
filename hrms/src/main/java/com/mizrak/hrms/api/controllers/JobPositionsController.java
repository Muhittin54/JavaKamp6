package com.mizrak.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mizrak.hrms.business.abstracts.JobPositionService;
import com.mizrak.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/positions")
public class JobPositionsController {
	
	private JobPositionService jobPosition;

	@Autowired
	public JobPositionsController(JobPositionService jobPosition) {
		super();
		this.jobPosition = jobPosition;
	}
	
	@GetMapping("/getall")
	public List<JobPosition> getAll() {
		return this.jobPosition.getAll();
	}
}
