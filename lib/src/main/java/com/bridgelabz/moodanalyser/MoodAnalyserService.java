package com.bridgelabz.moodanalyser;

public class MoodAnalyserService
{
	public String analyseMood(String message) 
	{
		if(message.contains("sad"))
		{
			return "sad";
		}
		else
		{
			return "happy";
		}
	}
}
