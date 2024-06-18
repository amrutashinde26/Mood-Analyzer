package org.example;


public class MoodAnalyzerException extends Exception{

    public enum ExceptionType{
        NULL,EMPTY;
    }
    public ExceptionType type;
    public MoodAnalyzerException(ExceptionType type,String msg){
        super(msg);
        this.type = type;
    }
}


