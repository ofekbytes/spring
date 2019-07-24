package com.learn.springexample;

public class MyApp {

	public static void main(String[] args) {
		

		// BaseballCoach theCoach = new BaseballCoach(); //
		// change variable type from "BaseballCoach" to interface name "coach". //
		Coach theCoach = new BaseballCoach();
		
		// use the object //
		System.out.println(theCoach.getDailyWrokout());
	}

}
