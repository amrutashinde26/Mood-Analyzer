
import org.example.MoodAnalyzerOne;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class MoodAnalyzerTest {
    @Test
    public void result()
    {
        MoodAnalyzerOne MoodAnalyzer = new MoodAnalyzerOne();
        String result = MoodAnalyzer.mood("i am Sad".toLowerCase());
        Assert.assertEquals(result, "Sad");
    } 

}

