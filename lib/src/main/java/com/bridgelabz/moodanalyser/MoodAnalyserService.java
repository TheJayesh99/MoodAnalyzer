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

	public Object analyseMood()
	{
		return analyseMood(message);
	}

	public Object analyseMood(String message)
	{
		try
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
		catch (NullPointerException e) 
		{
			return "happy";
		}
	}

}
