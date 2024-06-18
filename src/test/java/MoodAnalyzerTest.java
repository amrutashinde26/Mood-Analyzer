
import org.example.MoodAnalyzer;
import org.example.MoodAnalyzerException;
/*import org.example.MoodAnalyzerOne;*/
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class MoodAnalyzerTest {
    @Test
    public void analyzeMood() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer1 = new MoodAnalyzer("I am in Sad mood".toLowerCase());
        String mood = moodAnalyzer1.analyzeMood();
        Assert.assertEquals(mood,"SAD");
    }

    @Test
    public void analyzeHappyMood() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer2 = new MoodAnalyzer("I am in Any mood".toLowerCase());
        String mood = moodAnalyzer2.analyzeMood();
        Assert.assertEquals(mood,"HAPPY");
    }


    @Test
    public void analyzeNullMood() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer3 = new MoodAnalyzer(null);

        try {
            moodAnalyzer3.analyzeMood(null);
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals("Enter a valid Input",e.getMessage());
        }
    }


}

