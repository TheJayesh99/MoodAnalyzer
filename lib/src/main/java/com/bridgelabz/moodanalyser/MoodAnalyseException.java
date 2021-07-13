package com.bridgelabz.moodanalyser;

public class MoodAnalyseException extends RuntimeException
{
	enum ExceptionType
	{
		ENTERED_NULL,ENTERED_EMPTY
	}
	
	public static ExceptionType type;
	public MoodAnalyseException(ExceptionType type, String message)
	{
		super(message);
		this.type = type;
	}
	
}
