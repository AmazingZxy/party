package Daotest;

import org.junit.Test;
import org.party.zxy.dao.RetroactionDao;
import org.party.zxy.dao.UserDao;
import org.party.zxy.domain.Retroaction;
import org.party.zxy.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





public class UserTest {
	@Test
	public void test1() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao mapper = ctx.getBean(UserDao.class);
		User user = mapper.selectByLoginnameAndPassword("admin", "123456");
		if(user != null) {
			System.out.println(user);
		}else {
			System.out.println("查无此人");
		}
	}
	
	@Test
	public void test2(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao mapper = ctx.getBean(UserDao.class);
		User user =  mapper.selectById(1);
		if(user != null) {
			System.out.println(user);
		}else {
			System.out.println("查无此人");
		}
		
		
	}
	
	@Test
	public void deleteByID(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao mapper = ctx.getBean(UserDao.class);
		mapper.deleteById(2);
		User user =  mapper.selectById(2);
		if(user != null) {
			System.out.println(user);
		}else {
			System.out.println("查无此人");
		}
		
	}
	@Test
	public void saveTest(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao mapper = ctx.getBean(UserDao.class);
		User user = new User();
		user.setLoginname("zx");
		user.setPassword("123");
		user.setUsername("zxx");
		user.setStatus(1);
		mapper.save(user);
		System.out.println("ok");
		
	}
	@Test
	public void saveR(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		RetroactionDao mapper = ctx.getBean(RetroactionDao.class);
		 Retroaction retroaction = new Retroaction();
	        retroaction.setContent("测试dao");
	        retroaction.setEmail("zxygodmini@163.com");
	        retroaction.setTitle("测试dao");
	        
		mapper.save(retroaction);
		System.out.println("ok");
		
	}
}
