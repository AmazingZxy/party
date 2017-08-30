package org.party.zxy.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.party.zxy.dao.provider.UserDynaSqlProvider;
import org.party.zxy.domain.User;

import static org.party.zxy.util.common.HrmConstants.USERTABLE;

/**
 * userDAO,用户对数据库的操作，
 * @author Alice
 *
 */
public interface UserDao {
		// 根据登录名和密码查询员工
		@Select("select * from "+USERTABLE+" where loginname = #{loginname} and password = #{password}")
		public User selectByLoginnameAndPassword(@Param("loginname") String loginname,@Param("password") String password);
		
		// 根据id查询用户
		@Select("select * from "+USERTABLE+" where ID = #{id}")
		public User selectById(Integer id);
		
		// 根据id删除用户
		@Delete(" delete from "+USERTABLE+" where id = #{id} ")
		public void deleteById(Integer id);
			
		// 动态修改用户
		@SelectProvider(type=UserDynaSqlProvider.class,method="updateUser")
		public void update(User user);
			
		// 动态查询
		@SelectProvider(type=UserDynaSqlProvider.class,method="selectWhitParam")
		public List<User> selectByPage(Map<String, Object> params);
		
		// 根据参数查询用户总数
		@SelectProvider(type=UserDynaSqlProvider.class,method="count")
		public Integer count(Map<String, Object> params);
		
		// 动态插入用户
		@SelectProvider(type=UserDynaSqlProvider.class,method="insertUser")
		public void save(User user);
}
