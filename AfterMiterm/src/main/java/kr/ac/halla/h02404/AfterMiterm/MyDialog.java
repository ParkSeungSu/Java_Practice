package kr.ac.halla.h02404.AfterMiterm;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyDialog extends JDialog {
	private JTextArea textArea;
	private JButton button;

	public MyDialog(JFrame jframe) {
		super(jframe, true);
		setTitle("텍스트를 입력하세요");
		setLayout(new FlowLayout());
		setSize(400, 400);
		button = new JButton("summit");
		final Component[] cs=jframe.getContentPane().getComponents();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textArea.getText();
				for (Component component :cs ) {
					if (component instanceof JTextArea) {
						((JTextArea) component).setText(text);
					}
				}
				dispose();

			}
		});
		textArea = new JTextArea(20, 20);
		this.add(button);

		this.add(textArea);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
