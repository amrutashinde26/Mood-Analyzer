
import org.example.MoodAnalyzerOne;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class MoodAnalyzerTest {
    @Test
    public void analyzemood()
    {
        MoodAnalyzerOne MoodAnalyzer = new MoodAnalyzerOne("i am in any mood".toLowerCase());
        String result = MoodAnalyzer.mood();
        Assert.assertEquals(result, "Happy");
    }

    @Test
    public void analyzem() 
    {
        MoodAnalyzerOne MoodAnalyzer = new MoodAnalyzerOne("i am in sad mood".toLowerCase());
        String result = MoodAnalyzer.mood();
        Assert.assertEquals(result, "Sad");
    }

    @Test
    public  void checkmood()
    {
        MoodAnalyzerOne MoodAnalyzer2 = new MoodAnalyzerOne(null);
        String result = MoodAnalyzer2.mood();
        Assert.assertEquals(result, "INVALID");
    }

}

