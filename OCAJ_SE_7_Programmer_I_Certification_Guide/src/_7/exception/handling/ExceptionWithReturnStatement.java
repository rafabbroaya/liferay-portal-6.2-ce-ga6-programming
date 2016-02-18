package _7.exception.handling;

public class ExceptionWithReturnStatement {

	static StringBuilder returnDay(int degrees) {
		StringBuilder returnFail = new StringBuilder(); 
		try {
			crossRapid(degrees);
			returnFail.append("Adventure OK");
			return returnFail;
		} catch (FallInRiverException e) {
			//System.exit(0);
			returnFail.delete(0, returnFail.length());
			returnFail.append("The person Falled in river");
			return returnFail;
		} finally {
			System.out.println("End of Adventure");
			returnFail.append(" Finally...");
		}
	}

	static void crossRapid(int degrees) throws FallInRiverException {
		System.out.println("Cross Rapids");
		if (degrees > 10)
			throw new FallInRiverException();
	}

	public static void main(String a[]) {

		System.out.println(returnDay(11));
		String test = new String();
	}
}
