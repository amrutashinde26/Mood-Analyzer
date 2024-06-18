
import org.example.MoodAnalyzerOne;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class MoodAnalyzerTest {
    @Test
    public void analyzemood()
    {
        MoodAnalyzerOne MoodAnalyzer = new MoodAnalyzerOne();
        String result = MoodAnalyzer.mood("i am in any mood".toLowerCase());
        Assert.assertEquals(result, "Happy");
    }

}

