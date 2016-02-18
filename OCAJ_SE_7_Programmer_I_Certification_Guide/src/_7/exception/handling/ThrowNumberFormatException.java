package _7.exception.handling;

public class ThrowNumberFormatException {
	public static int convertToNum(String val) {
		int num = 0;
		try {
			num = Integer.parseInt(val, 16);
		} catch (NumberFormatException e) {
			throw new NumberFormatException(val
					+ " cannot be converted to hexadecimal number");
		}
		return num;
	}

	public static void main(String args[]) {
		System.out.println(convertToNum("16b"));
		System.out.println(convertToNum("65v"));
	}
}
