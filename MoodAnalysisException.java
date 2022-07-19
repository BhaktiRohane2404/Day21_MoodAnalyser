package com.moo.mood_analyser;

public class MoodAnalysisException extends Throwable {
    enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY
    };

    ExceptionType type;

    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
