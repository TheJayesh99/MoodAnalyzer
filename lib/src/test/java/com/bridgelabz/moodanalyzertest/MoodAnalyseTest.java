package com.bridgelabz.moodanalyzertest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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

	@Test
	public void givenMessageInConstructor_WhenHappy_ShouldReturnHappy()
	{
		MoodAnalyserService moodAnalyse = new MoodAnalyserService("i am in happy mood");		
		assertEquals("happy",moodAnalyse.analyseMood());
	}
}
