package org.example;

public class MoodAnalyzer {

    private String msg;


    public MoodAnalyzer(){

    }
    public MoodAnalyzer(String msg) throws MoodAnalyzerException{
        this.msg = msg;
    }

    public void analyzeMood(String msg) throws MoodAnalyzerException{
        this.msg = msg;
        analyzeMood();
    }

    public String analyzeMood() throws MoodAnalyzerException {
        try {
            if (msg.isEmpty()) {
                throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.EMPTY, "Enter Input");
            }

            if (msg.contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.NULL, "Enter a valid Input");
        }
    }
}


