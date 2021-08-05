import org.junit.Test;
import org.junit.Assert;

/**
 *Ability to analyse and respond Happy or Sad Mood
 * @author Chaitra NS
 * @since 05-08-2021
 */

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String mood = null;
        try {
            mood = moodAnalyzer.analyzeMood();
        }catch (MoodAnalysisException e){
            System.out.println(e);
        }
        Assert.assertEquals("Sad",mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        String mood = null;
        try{
            mood = moodAnalyzer.analyzeMood();
            Assert.assertEquals("Happy",mood);
        }catch (MoodAnalysisException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenNullMood_ShouldReturnHappy(){
        String mood = null;
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try{
             mood = moodAnalyzer.analyzeMood();
            Assert.assertEquals("Happy",mood);
        }catch (MoodAnalysisException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenEmptyMood_ShouldReturnHappy(){
        String mood = null;
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        try{
            mood = moodAnalyzer.analyzeMood();
            Assert.assertEquals("Happy",mood);
        }catch (MoodAnalysisException e){
            System.out.println(e);
        }
    }
}













