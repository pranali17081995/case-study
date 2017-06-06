package com.techm.dao;

import java.util.List;

import com.techm.beans.Job;

public interface JobDetails {
	
	public boolean addjob(Job job);
	public boolean modifyJob(Job job);
	public boolean deleteJob(int jcode);
	public Job getJob(int jcode);
	List<Job>display();
	

}
