package Lesson_5;

import java.time.Year;

public class MyTime extends MyDate {
	private int hour;
	private int minute;
	private int seconds;

	public MyTime() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyTime(int hour, int minute, int seconds) {
		super();

		if (validhour(hour) && (validminute(minute)) && (validseconds(seconds))) {
			this.hour = hour;
			this.minute = minute;
			this.seconds = seconds;
		}
		this.hour = 1;
		this.minute = 00;
		this.seconds = 00;

	}

	@Override
	public String getDate(char tav) {
		return super.getDate(tav) + "" + "|" + hour + tav + minute + tav + seconds;
	}
	
	public String getDate(char tav, char tav2) {
		return super.getDate(tav2) + "" + "|" + hour + tav2 + minute + tav2 + seconds;
	}
	

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;

	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public boolean validhour(int hour) {

		if (hour < 0 || hour > 12)
			return false;
		return true;
	}

	public boolean validminute(int minute) {

		if (minute < 0 || minute > 59)
			return false;
		return true;
	}

	public boolean validseconds(int seconds) {

		if (seconds < 0 || seconds > 59)
			return false;
		return true;
	}

}
