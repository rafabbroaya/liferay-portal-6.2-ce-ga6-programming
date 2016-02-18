package _7.exception.handling;

class Feline {
	{System.out.print("{}Feline ");}
	
	public String type = "f ";

	public Feline() {
		System.out.print("felineConstructor ");
	}

	static {
		System.out.print("StaticFeline ");
	}
}

public class Cougar extends Feline {
	{System.out.print("{}Coigar ");}
	public Cougar() {
		System.out.print("cougarConstructor ");
	}

	public static void main(String[] args) {
		new Cougar().go();
	}

	void go() {
		type = "c ";
		System.out.print(this.type + super.type);
	}
	
	static{System.out.print("StaticCougar ");}
}