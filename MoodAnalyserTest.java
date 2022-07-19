package com.moo.mood_analyser;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import junit.framework.Assert;

public class MoodAnalyserTest {

    @Test
    public void whenGivenInput_AsSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood;
        try {
            mood = moodAnalyser.analyseMood("This is a sad message");
            assertThat(" ", mood, CoreMatchers.is("SAD"));
        } catch (MoodAnalysisException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Test
    public void whenGivenInput_AsHappy_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood;
        try {
            mood = moodAnalyser.analyseMood("This is a happy message");
            assertThat(" ", mood, CoreMatchers.is("HAPPY"));
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void whenGivenInput_AsSad_UsingConstructor_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a sad message");
        String mood = moodAnalyser.analyseMood();
        assertThat(" ", mood, CoreMatchers.is("SAD"));
    }

    @Test
    public void whenGivenInput_AsHappy_UsingConstructor_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a happy message");
        String mood = moodAnalyser.analyseMood();
        assertThat(" ", mood, CoreMatchers.is("HAPPY"));
    }

    @Test
    public void whenGivenInput_AsNull_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            moodAnalyser.analyseMood(null);
        } catch (MoodAnalysisException e) {
            Assert.assertEquals("Please enter valid mood", e.getMessage());
            e.printStackTrace();
        }
    }

    @Test
    public void whenGivenInput_AsEmpty_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            moodAnalyser.analyseMood(" ");
        } catch (MoodAnalysisException e) {
            Assert.assertEquals("Please enter valid mood", e.getMessage());
            e.printStackTrace();
        }
    }
}
