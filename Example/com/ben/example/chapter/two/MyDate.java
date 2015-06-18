package com.ben.example.chapter.two;

import java.util.Date;

public class MyDate extends Date{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Date x;
	MyDate(){
		x = new Date();
	}
	@SuppressWarnings("deprecation")
	MyDate(int year, int month, int date1){
		x = new Date(year - 1900, month, date1);
	}
	@SuppressWarnings("deprecation")
	void addDate(){
		x.setDate(x.getDate() + 1);
	}
	@SuppressWarnings("deprecation")
	void addMonth(){
		x.setMonth(x.getMonth() + 1);
	}
	@SuppressWarnings("deprecation")
	void addYear(){
		x.setYear(x.getYear() + 1);
	}
}
