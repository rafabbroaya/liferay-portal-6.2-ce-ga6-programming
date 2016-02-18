package _8.mock.exam;

public class Cast extends Printer{
int pagesPerMin = 30;
	public static void main(String[] args) {
		Printer printer = new Cast();
		System.out.println(((Cast)printer).pagesPerMin);
	}
}

class Printer {
	int inkLevel;
}
