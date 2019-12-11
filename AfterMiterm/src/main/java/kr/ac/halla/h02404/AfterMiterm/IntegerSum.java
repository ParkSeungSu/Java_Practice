package kr.ac.halla.h02404.AfterMiterm;

public class IntegerSum implements MyFunction {

	@Override
	public int calc(int x, int y) {
		return x+y;
	}

	public static void main(String[] args) {
		IntegerSum is=new IntegerSum();
		System.out.println(is.calc(25, 24));
	}

}
