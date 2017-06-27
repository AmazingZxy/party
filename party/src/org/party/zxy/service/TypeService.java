package org.party.zxy.service;

import java.util.List;

import org.party.zxy.domain.Type;
import org.party.zxy.util.tag.PageModel;

public interface TypeService {
	/**
	 * 获得所有部门，分页查询
	 * @return Dept对象的List集合
	 * */
	List<Type> findDept(Type type,PageModel pageModel);
	
	/**
	 * 获得所有部门
	 * @return Dept对象的List集合
	 * */
	List<Type> findAllDept();
	
	/**
	 * 根据id删除部门
	 * @param id
	 * */
	public void removeDeptById(Integer id);
	
	/**
	 * 添加部门
	 * @param dept 部门对象
	 * */
	void addDept(Type type);
	
	/**
	 * 根据id查询部门
	 * @param id
	 * @return 部门对象
	 * */
	Type findDeptById(Integer id);
	
	/**
	 * 修改部门
	 * @param dept 部门对象
	 * */
	void modifyDept(Type type);
}
