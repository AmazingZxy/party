package org.party.zxy.service;

import java.util.List;

import org.party.zxy.domain.Job;
import org.party.zxy.util.tag.PageModel;

public interface JobService {
	/**
	 * 获得所有职位
	 * @return Job对象的List集合
	 * */
	List<Job> findAllJob();
	
	List<Job> findJob(Job job,PageModel pageModel);
	
	/**
	 * 根据id删除职位
	 * @param id
	 * */
	public void removeJobById(Integer id);
	
	/**
	 * 添加职位
	 * @param Job 部门对象
	 * */
	void addJob(Job job);
	
	/**
	 * 根据id查询职位
	 * @param id
	 * @return 职位对象
	 * */
	Job findJobById(Integer id);
	
	/**
	 * 修改职位
	 * @param dept 部门对象
	 * */
	void modifyJob(Job job);
}
