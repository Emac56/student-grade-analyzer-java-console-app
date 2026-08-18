package com.studentgradeanalyzer.app;

public class Student {
    
    private static long id = 0;
    private String studentName;
    private int quizScore;
    private int midtermScore;
    private int finalScore;
    private int average;
    private String status;
    
    public Student() {
        id++;
    }
    
    public long getId() { return id; }
    public String getStudentName() { return studentName; }
    public int getQuizScore() { return quizScore; }
    public int getMidtermScore() { return midtermScore; }
    public int getFinalScore() { return finalScore; }
    public String getStatus() { return status; }
    public int getAverage() { return average; }
    
    public void setAverage(int average) {
        
        this.average = average;
    }
    public void setStatus(String status) {
        
        this.status = status;
    }
    public void setStudentName(String studentName) {
        
        this.studentName = studentName;
    }
    
    public void setQuizScore(int quizScore) {
        
        this.quizScore = quizScore;
    }
    
    public void setMidtermScore(int midtermScore) {
        
        this.midtermScore = midtermScore;
    }
    
    public void setFinalScore(int finalScore) {
        
        this.finalScore = finalScore;
    }
}