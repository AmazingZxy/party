package org.party.zxy.dao;

import static org.party.zxy.util.common.HrmConstants.JOBTABLE;
import static org.party.zxy.util.common.HrmConstants.TYPETABLE;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.party.zxy.dao.provider.TypeDynaSqlProvider;
import org.party.zxy.domain.Job;
import org.party.zxy.domain.Type;


public interface TypeDao {
	
	// 动态查询
		@SelectProvider(type=TypeDynaSqlProvider.class,method="selectWhitParam")
		List<Type> selectByPage(Map<String, Object> params);
		
		
		@SelectProvider(type=TypeDynaSqlProvider.class,method="count")
		Integer count(Map<String, Object> params);
		
		@Select("select * from "+TYPETABLE+" ")
		List<Type> selectAllType();
		
		@Select("select * from "+TYPETABLE+" where ID = #{id}")
		Type selectById(int id);

		// 根据id删除部门
		@Delete(" delete from "+TYPETABLE+" where id = #{id} ")
		void deleteById(Integer id);
		
		// 动态插入部门
		@SelectProvider(type=TypeDynaSqlProvider.class,method="insertDept")
		void save(Type type);
		
		// 动态修改用户
		@SelectProvider(type=TypeDynaSqlProvider.class,method="updateDept")
		void update(Type type);
}
