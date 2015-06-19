package com.ben.example.chapter.five;

import java.awt.Component;

import javax.swing.JScrollPane;

public class ScrollPane extends JScrollPane{
	public ScrollPane(Component p){
		super(p);
		setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	}
}
