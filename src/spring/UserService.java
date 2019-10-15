package spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * 
* <p>Title: UserService</p>  
* <p>
*	Description: 
* 	构造函数注入
*   
* </p> 
* @author xianxian 
* @date 2019年10月14日
 */
public class UserService {

	//@Autowired @Qualifier("userDao2")  //默认根据属性的类型进行匹配,如果对应的类型出现多个子类，再根据属性的名称进行匹配
	
	@Resource(name="userDao") //默认根据名称进行匹配
	private IUserDao userDao;
	
	@Autowired  //默认根据属性的类型进行匹配
	private String username;
	
	//无参构造函数
	/*public UserService()
	{
		System.out.println("new UserService() 实例化");
	}*/
	
	//带参构造函数
	/*public UserService(IUserDao userDao,String username)
	{
		this.userDao = userDao;
		this.username = username;
		
		System.out.println("new UserService("+userDao+","+username+") 实例化");
	}*/
	
	//userDao的set方法
	/*public void setUserDao(IUserDao userDao)
	{
		this.userDao = userDao;
		System.out.println("UserService_2.setUserDao("+userDao+")");
	}*/
	
	//username的set方法
	/*public void setUsername(String username)
	{
		this.username = username;
		System.out.println("UserService_2.setUsername("+username+")");
	}*/
	
	public void findUsers()
	{
		System.out.println("username:" + username);
	    userDao.selectUser();
	}
}
