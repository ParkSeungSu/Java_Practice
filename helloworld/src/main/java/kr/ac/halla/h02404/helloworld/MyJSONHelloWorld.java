package kr.ac.halla.h02404.helloworld;

import org.json.JSONObject;

public class MyJSONHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject jsonHello=new JSONObject();
		jsonHello.put("message","My JSON Hello World!");
		System.out.println(jsonHello);
	}

}
