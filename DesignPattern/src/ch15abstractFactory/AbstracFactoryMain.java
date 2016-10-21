package ch15abstractFactory;

import java.lang.reflect.InvocationTargetException;

public class AbstracFactoryMain {

	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws NoSuchMethodException 
	 * @throws IllegalArgumentException 
	 * @throws SecurityException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		User user = new User();
		Department department = new Department();

		IUser iu = DataAccess.CreateUser();
		IDepartment idep = DataAccess.CreateDepartment();
		
		iu.Insert(user);
		iu.GetUser(1);
		idep.Insert(department);

	}

}
