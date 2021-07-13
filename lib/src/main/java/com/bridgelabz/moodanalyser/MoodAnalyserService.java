package com.bridgelabz.moodanalyser;

import com.bridgelabz.moodanalyser.MoodAnalyseException.ExceptionType;

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

	public Object analyseMood(String message) throws MoodAnalyseException
	{
		try
		{
			if (message.length() == 0)
			{				
				throw new MoodAnalyseException(ExceptionType.ENTERED_EMPTY, "message cannot be empty");
			}
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
			throw new MoodAnalyseException(ExceptionType.ENTERED_NULL, "message cannot be null");
		}
	}

}
