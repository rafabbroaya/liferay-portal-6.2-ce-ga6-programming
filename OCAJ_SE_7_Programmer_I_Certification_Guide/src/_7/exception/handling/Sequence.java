package _7.exception.handling;

public class Sequence extends SequenceExtends{
	Sequence() {
		System.out.println("Constructor Children");
	}

	{
		System.out.println("Initializer Children");
	}

	public static void main(String[] args) {
		{System.out.println("circle");}
		new Sequence().go();
		
	}

	void go() {
		System.out.println("Method Go ");
	}

	static {
		System.out.println("Static Initializer Children");
	}
	
	public void readFile() throws StackOverflowError{
		
	}
}
