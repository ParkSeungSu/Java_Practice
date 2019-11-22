package kr.ac.halla.h02404.AfterMiterm;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Lecture102 extends JFrame{
	private JTextField input;
	private JList<String> output;
	private JLabel selected;
	private Vector<String> list;

	public Lecture102() {
		setTitle("JList 예제");
		setSize(500, 800);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		list = new Vector<String>();
		input = new JTextField(30);
		output = new JList<String>();
		selected = new JLabel("아직선택안됨");
		c.add(input);
		c.add(output);
		c.add(selected);
		input.addActionListener(new ActionListener() {	
			
			public void actionPerformed(ActionEvent e) {
				String text = input.getText();
				// Vector에 text를 넣는다.
				list.add(text);
				// vector (list)를 setListData
				output.setListData(list);
				input.setText("");
			}
		});
		output.addListSelectionListener(new ListSelectionListener() {
			
			public void valueChanged(ListSelectionEvent e) {
				selected.setText(output.getSelectedValue());
				
			}
		});
		
		setVisible(true);

		
	}
	public static void main(String[] args) {
		new Lecture102();

	}

}
