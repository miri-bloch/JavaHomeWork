package Lesson_5;

import java.time.zone.ZoneOffsetTransitionRule;

public class MyDate {

	private int year;

	private int month;

	private int day;

	int[] arr = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	private int c;

	public int getYear() {

		return year;

	}

	public void setYear(int year) {

		this.year = year;

	}

	public int getMonth() {

		return month;

	}

	public void setMonth(int month) {

		this.month = month;

	}

	public int getDay() {
		return day;
	}

	public String getDate(char tav) {
		tav = '-';

		return "" +year + tav +month + tav + day;
	}

	public void setDay(int day) {

		this.day = day;

	}

	public MyDate(int year, int month, int day) {

		super();
		if (validMonth(month) && validDay(day, month)) {
			this.year = year;
			this.month = month;
			this.day = day;
		} else {
			this.year = 1;

			this.month = 1;
			this.day = 1;
		}

	}

	public MyDate() {
		if (validMonth(month) && validDay(day, month)) {
			this.year = 1;

			this.month = 1;
			this.day = 1;
		}
	}

	public boolean validMonth(int month) {

		if (month < 0 || month > 12)
			return false;
		return true;
	}

	public boolean validDay(int day, int month) {

		if (arr[month] >= day || day < 1)
			return false;
		return true;
	}



}
