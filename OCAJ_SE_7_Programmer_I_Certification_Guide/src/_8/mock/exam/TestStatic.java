package _8.mock.exam;

public class TestStatic {
	{
		name = "nuevo";
	}
	
	static String name;
	static final int constante=0;

	void riverRafting() {
		String name = "m1";
		if (8 > 2) {
			name = "m3";
		}
		System.out.println(this.name);
	}

	public static void main(String[] args) {
		new TestStatic().riverRafting();
	}
}
