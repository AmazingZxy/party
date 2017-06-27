package Daotest;

import org.junit.Test;
import org.party.zxy.dao.EmployeeDao;
import org.party.zxy.dao.UserDao;
import org.party.zxy.domain.Employee;
import org.party.zxy.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





public class EmployeeTest {
	@Test
	public void test1() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao mapper = ctx.getBean(EmployeeDao.class);
		Employee user = mapper.selectById(1);
		if(user != null) {
			System.out.println(user);
		}else {
			System.out.println("查无此人");
		}
	}
	
	
}
