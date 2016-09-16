package com.faruzzy.deitel.chapt3;

/**
 * @author Roland
 */
public class Exercise_3_15_Date {
    private int month;
    private int day;
    private int year;

    public Exercise_3_15_Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setMonth(int month) { this.month = month; }

    public int getMonth() { return month; }

    public void setDay(int day) { this.day = day; }

    public int getDay() { return day; }

    public void setYear(int year) { this.year = year; }

    public int getYear() { return year; }

    public void displayDate() {
        System.out.println(getMonth() + "/" + getDay() + "/" + getYear());
    }

    public static void main(String[] args) {
        Exercise_3_15_Date date = new Exercise_3_15_Date(4, 3, 1998);
        date.setMonth(3);
        date.setDay(3);
        date.setYear(1999);

        date.displayDate();
    }

}

