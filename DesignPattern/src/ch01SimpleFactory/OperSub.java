package ch01SimpleFactory;

public class OperSub extends Operation{
	
	public int GetResult()
	{
		int result = 0;
		//result = numA - numB;
		result = super.getNumA() + super.getNumB();
		return result;
	}
}
