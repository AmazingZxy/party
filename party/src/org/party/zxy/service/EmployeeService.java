package org.party.zxy.service;

import java.util.List;

import org.party.zxy.domain.Employee;
import org.party.zxy.util.tag.PageModel;

public interface EmployeeService {

	/**
	 * 获得所有员工
	 * @param employee 查询条件
	 * @param pageModel 分页对象
	 * @return 对象的List集合
	 * */
	List<Employee> findEmployee(Employee employee,PageModel pageModel);
	
	/**
	 * 根据id删除员工
	 * @param id
	 * */
	void removeEmployeeById(Integer id);
	
	/**
	 * 根据id查询员工
	 * @param id
	 * @return 员工对象
	 * */
	Employee findEmployeeById(Integer id);
	
	/**
	 * 添加员工
	 * @param employee 员工对象
	 * */
	void addEmployee(Employee employee);
	
	/**
	 * 修改员工
	 * @param employee 员工对象
	 * */
	void modifyEmployee(Employee employee);
}
