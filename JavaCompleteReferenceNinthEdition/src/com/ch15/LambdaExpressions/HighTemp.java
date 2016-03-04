package com.ch15.LambdaExpressions;

public class HighTemp {

	private int hTemp;

	public HighTemp(int hTemp) {
		super();
		this.hTemp = hTemp;
	}
	
	boolean sameTemp(HighTemp t2) {
		return hTemp == t2.hTemp;
	}
	
	boolean lessThanTemp(HighTemp t2) {
		return hTemp < t2.hTemp;
	}
	
}
