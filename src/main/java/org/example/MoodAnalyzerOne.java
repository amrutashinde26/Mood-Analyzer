package org.example;

public class MoodAnalyzerOne {

        public String mood(String message){
            if(message.contains("sad"))
            {
                return "sad";
            } else if (message.contains("happy")) {
                return "happy" ;
            }
            else{
                return  "";
            }
        }
    }



