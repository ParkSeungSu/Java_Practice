package kr.ac.halla.h02404.helloworld;

import org.json.JSONObject;

public class MyJSONHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject jsonHello=new JSONObject();
		JSONObject jsonYallo=new JSONObject();
		jsonHello.put("message","My JSON Hello World!");
		jsonYallo.put("number",12412);
		System.out.println(jsonHello);
		System.out.println(jsonYallo);
	}

}
