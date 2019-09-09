package kr.ac.halla.h02404.printer;

public class StringPrinter implements Printer{
	private String message;
	
	public StringPrinter(String message) {
		this.message=message;
	}
	
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(message);
		
	}

}
