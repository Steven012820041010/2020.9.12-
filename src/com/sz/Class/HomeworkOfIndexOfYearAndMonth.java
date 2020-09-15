package com.sz.Class;

import java.util.Scanner;

public class HomeworkOfIndexOfYearAndMonth {
	public static String readMonths (Scanner sc) {
		String month = sc.next();
		return month;
	}
	public static int readDays (Scanner sc) {
		String strDay = sc.next();
		int day = Integer.parseInt(strDay);
		return day;
	}
	public static int readYears (Scanner sc) {
		String strYear = sc.next();
		int year = Integer.parseInt(strYear);
		return year;
	}
	public static int dayIndex(String month, int dayOfMonth, int years) {
		int num = 0;

		if ("Jan".equals(month)) {
			num += 0;
		}
		if ("Feb".equals(month)) {
			num += 31;
		}
		if ("Mar".equals(month)) {
			num += 59;
			if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0) {
				num++;
			}
		}
		if ("Apr".equals(month)) {
			num += 90;
		}
		if ("May".equals(month)) {
			num += 120;
		}
		if ("Jun".equals(month)) {
			num += 151;
		}
		if ("Jul".equals(month)) {
			num += 181;
		}
		if ("Aug".equals(month)) {
			num += 212;
		}
		if ("Sept".equals(month)) {
			num += 243;
		}
		if ("Oct".equals(month)) {
			num += 273;
		}
		if ("Nov".equals(month)) {
			num += 304;
		}
		if ("Dec".equals(month)) {
			num += 334;
		}
		num += dayOfMonth;

		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String month = readMonths(sc);
		int dayOfMonth = readDays(sc);
		int years = readYears(sc);
		int dayIndex = dayIndex(month, dayOfMonth, years);
		int remainder = dayIndex/7;
		System.out.println(dayIndex);
	}

}
