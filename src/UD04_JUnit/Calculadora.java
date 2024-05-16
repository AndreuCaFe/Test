package UD04_JUnit;

public class Calculadora {
	private int num;
	private int num2;
	
	public Calculadora(int n, int n2) {
		this.num=n;
		this.num2=n2;
	}
	
	public int suma() {
		int res = num + num2;
		return res;
	}

	public int resta() {
		int res = num - num2;
		return res;
	}

	public int multiplica() {
		int res = num * num2;
		return res;
	}

	public int divide() {
		int res = num / num2;
		return res;
	}

}
