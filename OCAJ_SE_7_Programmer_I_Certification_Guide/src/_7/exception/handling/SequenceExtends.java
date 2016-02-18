package _7.exception.handling;

public class SequenceExtends {

	static {
		System.out.println("Static Initializer Father");
	}

	public SequenceExtends() {
		System.out.println("Constructor Father");
	}

	{
		System.out.println("Initializer Father");
	}

	void readFile() {
		System.out.println("Read File");
	}
}
