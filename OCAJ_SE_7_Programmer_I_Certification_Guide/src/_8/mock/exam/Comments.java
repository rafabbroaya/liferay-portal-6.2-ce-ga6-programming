//hola
package _8.mock.exam;

//hola

//hola
public class Comments {

	public static void main(String[] args) {
		int a = 0;
		while (a == a++) {
			a++;
			System.out.println(a);
			if (a == 10)
				break;
		}
		System.out.println(args[0] + ":" + args[2]);

		Person person = new Person();
		System.out.println(person.toString());
	}

}

class Person {
	String name;
	float height;
	boolean result;
	int age;

	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", result="
				+ result + ", age=" + age + "]";
	}

}
