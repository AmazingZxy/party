package org.party.zxy.dao.provider;

import static org.party.zxy.util.common.HrmConstants.TYPETABLE;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;
import org.party.zxy.domain.Type;

public class TypeDynaSqlProvider {
	
	// 分页动态查询
		public String selectWhitParam(final Map<String, Object> params){
			String sql =  new SQL(){
				{
					SELECT("*");
					FROM(TYPETABLE);
					if(params.get("type") != null){
						Type dept = (Type) params.get("type");
						if(dept.getName() != null && !dept.getName().equals("")){
							WHERE("  name LIKE CONCAT ('%',#{type.name},'%') ");
						}
					}
				}
			}.toString();
			
			if(params.get("pageModel") != null){
				sql += " limit #{pageModel.firstLimitParam} , #{pageModel.pageSize}  ";
			}
			
			return sql;
		}	
		// 动态查询总数量
		public String count(final Map<String, Object> params){
			return new SQL(){
				{
					SELECT("count(*)");
					FROM(TYPETABLE);
					if(params.get("type") != null){
						Type dept = (Type) params.get("type");
						if(dept.getName() != null && !dept.getName().equals("")){
							WHERE("  name LIKE CONCAT ('%',#{type.name},'%') ");
						}
					}
				}
			}.toString();
		}	
		// 动态插入
		public String insertDept(final Type type){
			
			return new SQL(){
				{
					INSERT_INTO(TYPETABLE);
					if(type.getName() != null && !type.getName().equals("")){
						VALUES("name", "#{name}");
					}
					if(type.getRemark() != null && !type.getRemark().equals("")){
						VALUES("remark", "#{remark}");
					}
				}
			}.toString();
		}
		// 动态更新
		public String updateDept(final Type type){
			
			return new SQL(){
				{
					UPDATE(TYPETABLE);
					if(type.getName() != null){
						SET(" name = #{name} ");
					}
					if(type.getRemark() != null){
						SET(" remark = #{remark} ");
					}
					WHERE(" id = #{id} ");
				}
			}.toString();
		}
}
