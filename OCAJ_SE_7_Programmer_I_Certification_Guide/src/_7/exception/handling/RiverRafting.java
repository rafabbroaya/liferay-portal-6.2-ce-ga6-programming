package _7.exception.handling;

public class RiverRafting {
	
	void crossRapid(int degree) throws FallInRiverException {
		System.out.println("CrossRapid");
		if(degree>10)throw new FallInRiverException();
	}
	
	void rowRaft(String state) throws DropOarException {
		System.out.println("Row Raft");
		if("nervous".equals(state))throw new DropOarException();
	}

}
