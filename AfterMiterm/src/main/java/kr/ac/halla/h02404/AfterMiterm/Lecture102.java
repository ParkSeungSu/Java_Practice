package kr.ac.halla.h02404.AfterMiterm;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Lecture102 extends JFrame{
	private JTextField input;
	private JList<String> output;
	private JComboBox<String> output2;
	private JLabel selected;
	private Vector<String> list;
	private JSlider slider;

	public Lecture102() {
		setTitle("JList 예제");
		setSize(500, 800);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		list = new Vector<String>();
		input = new JTextField(30);
		output = new JList<String>();
		output2 = new JComboBox<String>();
		slider=new JSlider(0,100,70);
		selected = new JLabel("아직선택안됨");
		c.add(input);
		c.add(output);
		c.add(output2);
		c.add(slider);
		c.add(selected);
		input.addActionListener(new ActionListener() {	
			
			public void actionPerformed(ActionEvent e) {
				String text = input.getText();
				// Vector에 text를 넣는다.
				list.add(text);
				// vector (list)를 setListData
				output.setListData(list);
				output2.addItem(text);
				input.setText("");
			}
		});
		output.addListSelectionListener(new ListSelectionListener() {
			
			public void valueChanged(ListSelectionEvent e) {
				selected.setText(output.getSelectedValue());
				
			}
		});
		slider.addChangeListener(new ChangeListener() {
			
			public void stateChanged(ChangeEvent e) {
			
				selected.setText(String.valueOf(slider.getValue()));
				list.add(String.valueOf(slider.getValue()));
				output.setListData(list);
			}
		});
		
		setVisible(true);

		
	}
	public static void main(String[] args) {
		new Lecture102();

	}

}
