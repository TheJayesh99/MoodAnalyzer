package com.bridgelabz.moodanalyser;

public class MoodAnalyserService
{
	public String message;
	
	public MoodAnalyserService() 
	{
		super();
	}

	public MoodAnalyserService(String message) 
	{
		super();
		this.message = message;
	}
	
	public String analyseMood(String masssage) 
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
