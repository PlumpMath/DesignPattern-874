package ch01SimpleFactory;

public class OperDiv extends Operation{
	
	public int GetResult()
	{
		int result = 0;
		if(super.getNumB() == 0)
			try {
				throw new Exception("0!!!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//result = numA / numB;
		result = super.getNumA() / super.getNumB();
		return result;
	}
}
