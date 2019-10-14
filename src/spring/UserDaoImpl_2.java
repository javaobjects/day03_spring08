package spring;

public class UserDaoImpl_2 implements IUserDao {

	public UserDaoImpl_2()
	{
		System.out.println("new UserDaoImpl_2() 实例化");
	}
	
	@Override
	public void selectUser() {
		System.out.println("UserDaoImpl_2.selectUser..........玉艺2222");
	}
}
