
import org.example.MoodAnalyzerOne;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void result()
    {
        MoodAnalyzerOne MoodAnalyzer = new MoodAnalyzerOne();
        String result = MoodAnalyzer.mood("i am sad");
        Assert.assertEquals("sad" , result);
    }
    @Test
    public void result2()
    {
        MoodAnalyzerOne MoodAnalyser2 = new MoodAnalyzerOne();
        String result = MoodAnalyser2.mood("i am happy");
        Assert.assertEquals("happy" , result);
    }
}

