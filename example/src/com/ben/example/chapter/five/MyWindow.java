package com.ben.example.chapter.five;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MyWindow extends JFrame{
	public MyWindow(int w, int h){
		setTitle("滚动面板实例");
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(6, 6));
		for(int i = 0; i < 6; i++){
			p.add(new JLabel());
			for(int j = 1; j <=2; j++){
				JButton but = new JButton("按钮" + (2*i+j));
				but.setSize(100, 100);
				p.add(but);
				p.add(new JLabel("标签" + (2*i +j)));
			}
			p.add(new JLabel());
		}
		p.setBackground(Color.blue);
		p.setPreferredSize(new Dimension(w , h ));
		ScrollPane ScrollPane = new ScrollPane(p);
		ScrollPane.setPreferredSize(new Dimension(w, h));
		add(ScrollPane, BorderLayout.CENTER);
		setVisible(true);
		pack();
	}
}
