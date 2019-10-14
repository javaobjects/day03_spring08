package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args){

		//1.加载并且解析applicationContext.xml
		//积极加载，在加载与解析xml的同时，即完成所有bean的实例化
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("----------IOC容器加载完成--------------------");
		
		//2.获取工厂中的UserServicw对象了
		UserService userService = (UserService)factory.getBean("userService"); 
		
		//3.调用方法
		userService.findUsers();
	}

}
