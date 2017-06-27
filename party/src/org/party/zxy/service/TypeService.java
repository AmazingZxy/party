package org.party.zxy.service;

import java.util.List;

import org.party.zxy.domain.Type;
import org.party.zxy.util.tag.PageModel;

public interface TypeService {
	/**
	 * 获得所有部门，分页查询
	 * @return Type对象的List集合
	 * */
	List<Type> findType(Type type,PageModel pageModel);
	
	/**
	 * 获得所有部门
	 * @return Type对象的List集合
	 * */
	List<Type> findAllType();
	
	/**
	 * 根据id删除部门
	 * @param id
	 * */
	public void removeTypeById(Integer id);
	
	/**
	 * 添加部门
	 * @param Type 部门对象
	 * */
	void addType(Type type);
	
	/**
	 * 根据id查询部门
	 * @param id
	 * @return 部门对象
	 * */
	Type findTypeById(Integer id);
	
	/**
	 * 修改部门
	 * @param Type 部门对象
	 * */
	void modifyType(Type type);
}
