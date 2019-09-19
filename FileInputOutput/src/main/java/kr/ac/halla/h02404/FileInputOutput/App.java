package kr.ac.halla.h02404.FileInputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException {

		// 파일을 읽기 위해서 FileReader 클래스를 사용한다.
		// 파일을 읽는다. 단일 문자를 integer값으로 가져온다.
		BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\cldkr\\OneDrive\\문서\\GitHub\\Java_Practice\\FileInputOutput\\Email-EuAll.txt"));
		// 버퍼기능이 생긴 리더가 생긴것이다~
		BufferedWriter bw = new BufferedWriter(new FileWriter(
				"C:\\Users\\cldkr\\OneDrive\\문서\\GitHub\\Java_Practice\\FileInputOutput\\Email-.txt"));
		while (true) {
			String Line=br.readLine();
			if (Line == null) {
				break;
			//#으로 시작하면 무시
			if(Line.startsWith("#"))
					continue;
			// \t
			String[] arr1=Line.split("\t");
			System.out.println(Line);
		}
		bw.write("Park Seung Su");
		
		br.close();
		bw.close();
	}
}
