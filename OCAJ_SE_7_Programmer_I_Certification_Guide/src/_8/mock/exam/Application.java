package _8.mock.exam;

public class Application {
	public static void main(String... args) {
		double price = 10;
		String model;
		if (price > 10)
			model = "Smartphone";
		else if (price <= 10)
			model = "landline";
		else
			model = "Test";

		System.out.println(model);
	}
}