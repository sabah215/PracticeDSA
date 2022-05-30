package com.ooppractice.absolutejava.chap4DefiningClassesOne.problem2;
import java.time.LocalDate;

public class CalAge {
	
	private int day;
	private int month;
	private int year;
	
	private LocalDate today;
	
	
	
	public CalAge(int day, int month, int year) {
		setDay(day);
		this.month = month;
		setYear(year);
		this.today = LocalDate.now();
	}
	
	public CalAge(int day, String month, int year) {
//		
		setDay(day);
		setMonthInt(month);
		setYear(year);
		this.today = LocalDate.now();
	}
	
	private void setDay(int day) {
		this.day = day;
	}
	
	public int getDay() {
		return this.day;
	}

	private void setMonthInt(String month) {
		// TODO Auto-generated method stub
		
		String monthString = month.toLowerCase();
		
		switch (monthString) {
			
			case "january":
				this.month = 1;
				break;
			case "february":
				this.month = 2;
				break;
			case "march":
				this.month = 3;
				break;
			case "april":
				this.month = 4;
				break;
			case "may":
				this.month = 5;
				break;
			case "june":
				this.month = 6;
				break;
			case "july":
				this.month = 7;
				break;
			case "august":
				this.month = 8;
				break;	
			case "september":
				this.month = 9;
				break;	
			case "october":
				this.month = 10;
				break;
			case "november":
				this.month = 11;
				break;	
			case "december":
				this.month = 12;
				break;
		}	
			
	}
	
	
	
	public int getMonth() {
		return this.month;
	}
	
	private void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public LocalDate getToday() {
		return this.today;
	}
}
