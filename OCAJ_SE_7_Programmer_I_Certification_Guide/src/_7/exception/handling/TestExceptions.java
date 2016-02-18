package _7.exception.handling;

import java.util.ArrayList;

public class TestExceptions {

	static ArrayList<String> lista;
	
	public TestExceptions() {
		lista = new ArrayList<String>();
	}
	
	static void test() {
		//lista = new ArrayList<String>();
	}

	public static void main(String[] args) {
		RiverRafting riverRafting = new RiverRafting();
		try {
			riverRafting.crossRapid(10);
			riverRafting.rowRaft("nervous");
		} catch (FallInRiverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DropOarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("FIN");
		}
	}
}
