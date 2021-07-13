package com.bridgelabz.moodanalyzertest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.moodanalyser.MoodAnalyserService;

public class MoodAnalyseTest 
{
	MoodAnalyserService moodService = new MoodAnalyserService();
	//check for sad mood
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() 
	{
		assertEquals("sad",moodService.analyseMood("i am in sad mood"));
	}
	
	//check for happy mood
	@Test
	public void givenMessage_WhenNoMoodSpecified_ShouldReturnhappy() 
	{
		assertEquals("happy",moodService.analyseMood("i am in any mood"));
	}
}
