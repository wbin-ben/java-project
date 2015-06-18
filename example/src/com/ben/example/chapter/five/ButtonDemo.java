package com.ben.example.chapter.five;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonDemo extends JFrame implements ActionListener{
	
	public static final int WIDTH = 250;
	public static final int HEIGHT = 200;
	
	ButtonDemo(){
		setSize(WIDTH, HEIGHT);
		Container conPane = getContentPane();
		conPane.setBackground(Color.BLUE);
		conPane.setLayout(new FlowLayout());
		JButton redBut = new JButton("Red");
		redBut.addActionListener(this);
		conPane.add(redBut);
		JButton greenBut = new JButton("Green");
		greenBut.addActionListener(this);
		conPane.add(greenBut);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Container conPane = getContentPane();
		if(e.getActionCommand().equals("Red"))
			conPane.setBackground(Color.RED);
		else if(e.getActionCommand().equals("Green"))
			conPane.setBackground(Color.GREEN);
		else{}
	}

}
