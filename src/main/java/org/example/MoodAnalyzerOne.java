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
        public String mood(){
            if(message.contains("sad"))
            {
                return "Sad";
            }
            else{
                return  "Happy";
            }
        }
    }



