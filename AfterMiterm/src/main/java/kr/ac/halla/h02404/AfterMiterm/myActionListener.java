package kr.ac.halla.h02404.AfterMiterm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import static kr.ac.halla.h02404.AfterMiterm.eventProcessing.count;
public class myActionListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		// 버튼이 눌렸을 때 실행디ㅗ는 메소드
		System.out.println("Naver Open!");
		Runtime runtime=Runtime.getRuntime();
		try {
			count++;
			System.out.println(count);
			runtime.exec("explorer.exe http://www.naver.com/");
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
	}

}
