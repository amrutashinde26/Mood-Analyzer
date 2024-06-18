package org.example;

public class MoodAnalyzerOne {

        public String mood(String message){
            if(message.contains("sad"))
            {
                return "Sad";
            }
            else{
                return  "Happy";
            }
        }
    }



