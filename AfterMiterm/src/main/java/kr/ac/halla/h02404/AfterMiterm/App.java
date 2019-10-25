package kr.ac.halla.h02404.AfterMiterm;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.MenuBar;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * Hello world!
 *
 */
//1.create class extends JFrame
@SuppressWarnings("serial")
public class App extends JFrame {
	// JFrame을 꾸며준다.
	// 2.Describe how it looks like in its constructor
	public App() {
		setTitle("400 x 400 Blank Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container contextPane = getContentPane();
		contextPane.setBackground(new Color(0, 71, 87));
		contextPane.setLayout(new GridLayout(4, 2, 5, 5));

		contextPane.add(new JButton("1"));
		contextPane.add(new JButton("2"));
		contextPane.add(new JButton("3"));
		contextPane.add(new JButton("4"));
		contextPane.add(new JButton("5"));
		contextPane.add(new JButton("6"));
		contextPane.add(new JButton("7"));
		contextPane.add(new JButton("8"));
		contextPane.add(new JButton("9"));
		contextPane.add(new JButton("*"));
		contextPane.add(new JButton("0"));
		contextPane.add(new JButton("="));
		
		setSize(400, 400);
		setVisible(true);
	}

	// 3.create the frame in the main method
	// 인스턴트화 한다.
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		App frame = new App();
	}
}
