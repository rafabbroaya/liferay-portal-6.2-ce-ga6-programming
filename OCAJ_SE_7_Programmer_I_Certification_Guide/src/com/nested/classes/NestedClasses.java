package com.nested.classes;
import java.util.Vector;

import com.non_access.Abstract;
import com.non_access.Interface;

public class NestedClasses extends Abstract implements Interface{
	
	@Override
	public void abstractClassMethod() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void printInterface() {
		// TODO Auto-generated method stub
		
	}
	
	public class InnerClass1 implements InnerClass2{

		@Override
		public void print(Vector<String> vectorStrings) {
			// TODO Auto-generated method stub
			
		}
		
		public void print() {
			
		}
		
	}
	
	protected interface InnerClass2 {
		void print(Vector<String> vectorStrings);
	}

}

class NestedClasses1 {
	//private String name;
	Vector<String> vectorStrings = new Vector<String>();
}

interface NestedInterfaz1 {
	
}

class NestedClasses2 {
	public static void main(String[] args) {
		//NestedClasses1 nestedClasses1 = new NestedClasses1();
		//nestedClasses1.name = "";
	}
}