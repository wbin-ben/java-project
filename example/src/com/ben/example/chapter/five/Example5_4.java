package com.ben.example.chapter.five;

import java.applet.Applet;

import javax.swing.JButton;

public class Example5_4 extends Applet{
	MyPanel panel1, panel2;
	JButton Button;
	public void init(){
		panel1 = new MyPanel("确定", "取消", "标签，我们在面板1中");
		panel2 = new MyPanel("确定", "取消", "标签，我们在面板2中");
		Button = new JButton("我是不在面板中的按钮");
		add(panel1);
		add(panel2);
		add(Button);
		setSize(300, 200);
	}
}
