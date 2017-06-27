package Daotest;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.party.zxy.dao.JobDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JobTest {
	@Test
	public void test1(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		JobDao mapper = ctx.getBean(JobDao.class);
		Map<String, Object> map = new HashMap<String, Object>();
		int a = mapper.count(map);
		System.out.println(a);
	}

}
