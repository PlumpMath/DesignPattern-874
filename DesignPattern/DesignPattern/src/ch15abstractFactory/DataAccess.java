package ch15abstractFactory;


public class DataAccess {
	
	private static final String db = AppConfig.getDB_type();
	
	public static IUser CreateUser() throws InstantiationException, IllegalAccessException {
		String className = "ch15abstractFactory." + db + "User";
		IUser result = null;
		try {
			result = (IUser)Class.forName(className).newInstance();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static IDepartment CreateDepartment() throws InstantiationException, IllegalAccessException {
		String className = "ch15abstractFactory." + db + "Department";
		IDepartment result = null;
		try {
			result = (IDepartment)Class.forName(className).newInstance();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return result;
		
	}

}
