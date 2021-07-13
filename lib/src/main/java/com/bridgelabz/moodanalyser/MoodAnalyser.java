package com.bridgelabz.moodanalyser;

public class MoodAnalyser 
{
	public static void main(String[] args) 
	{		
		String message = "Today i am very sad";
		MoodAnalyserService moodAnalyser = new MoodAnalyserService(message);
		System.out.println(moodAnalyser.analyseMood(message));  
	}
}
