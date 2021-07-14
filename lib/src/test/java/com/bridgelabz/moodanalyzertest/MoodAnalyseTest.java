package com.bridgelabz.moodanalyzertest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.moodanalyser.MoodAnalyseException;
import com.bridgelabz.moodanalyser.MoodAnalyseException.ExceptionType;
import com.bridgelabz.moodanalyser.MoodAnalyserService;

public class MoodAnalyseTest 
{
	//check for sad mood
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() 
	{
		MoodAnalyserService moodService = new MoodAnalyserService();
		assertEquals("sad",moodService.analyseMood("i am in sad mood"));
	}

	//check for happy mood
	@Test
	public void givenMessage_WhenNoMoodSpecified_ShouldReturnhappy() 
	{
		MoodAnalyserService moodService = new MoodAnalyserService();
		assertEquals("happy",moodService.analyseMood("i am in any mood"));
	}

	//check for sad mood and message passed through constructor
	@Test
	public void givenMessageInConstructor_WhenSad_ShouldReturnSad()
	{
		MoodAnalyserService moodAnalyse = new MoodAnalyserService("i am in sad mood");		
		assertEquals("sad",moodAnalyse.analyseMood());
	}

	//check for happy mood and message passed through constructor
	@Test
	public void givenMessageInConstructor_WhenHappy_ShouldReturnHappy()
	{
		MoodAnalyserService moodAnalyse = new MoodAnalyserService("i am in happy mood");		
		assertEquals("happy",moodAnalyse.analyseMood());
	}

	//check for null message passed through constructor
	@Test
	public void givenMessageInConstructor_WhenNull_ShouldReturnHappy()
	{
		try 
		{
			MoodAnalyserService moodAnalyse = new MoodAnalyserService(null);		
			assertEquals("happy",moodAnalyse.analyseMood());			
		} 
		catch (MoodAnalyseException e) 
		{
			assertEquals("message cannot be null", e.getMessage());
		}
	}

	//check for empty message passed through constructors
	@Test
	public void givenMessageInConstructor_WhenEmptyString_ShouldReturnHappy()
	{
		try 
		{
			MoodAnalyserService moodAnalyse = new MoodAnalyserService("");		
			assertEquals("happy",moodAnalyse.analyseMood());			
		} 
		catch (MoodAnalyseException e) 
		{
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
}
