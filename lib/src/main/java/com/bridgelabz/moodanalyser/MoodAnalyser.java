package com.bridgelabz.moodanalyser;

public class MoodAnalyser 
{
	public static void main(String[] args) 
	{		
		MoodAnalyserService moodAnalyser = new MoodAnalyserService();
		String message = "Today i am very sad";
		System.out.println(moodAnalyser.analyseMood(message));  
	}
}
