package UD04_JUnit;

public class EuroDollar {
	
	public double dollar2Euro(double dollar) {
		double euro;
		euro =Math.round((dollar * 0.92218796)*100.0)/100.0 ;
		return euro;	
	}
	
	public double euro2Dollar(double euro) {
		double dollar;
		dollar =Math.round((euro *1.0843945)*100.0)/100.0;
		return dollar;	
	}

}
