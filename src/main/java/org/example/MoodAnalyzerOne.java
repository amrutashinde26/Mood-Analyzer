package org.example;

public class MoodAnalyzerOne {
private String message ;

public  MoodAnalyzerOne()
{

}

public MoodAnalyzerOne(String message)
{
    this.message=message;
}
        public String mood() {
            try {
                if (message.contains("sad")) {
                    return "Sad";
                } else {
                    return "Happy";
                }
            } catch (NullPointerException e)
            {
                return  "Happy"; 
            }
        }
    }



