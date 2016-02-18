package _8.mock.exam;

import java.sql.SQLException;

import javax.sql.rowset.serial.SerialException;

public class TestAbstractInterface extends TestAbstract {

	@Override
	protected void methodAbstractClassAbstract() {

	}

	@Override
	public void methodInterface1() {

	}

	@Override
	public void methodInterface2() {

	}
	
	@Override
	protected void methodWithException() throws SerialException{
		
	}

}

abstract class TestAbstract implements TestInterface1 {
	private int instanceVariable = 0;
	protected abstract void methodAbstractClassAbstract();
	abstract void methodWithException()throws SQLException; 
}

interface TestInterface1 extends TestInterface2 {
	abstract public void methodInterface1();
}

interface TestInterface2 {
	void methodInterface2();
}
