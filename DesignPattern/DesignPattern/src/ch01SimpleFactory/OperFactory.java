package ch01SimpleFactory;

public class OperFactory {
	
	public static Operation createOperate(char operate)
	{
		Operation oper = null;
		switch(operate)
		{
		case '+':
			oper = new OperAdd();
			break;
		case '-':
			oper = new OperSub();
			break;
		case '*':
			oper = new OperMul();
			break;
		case '/':
			oper = new OperDiv();
			break;
		}
		return oper;
	}

}
