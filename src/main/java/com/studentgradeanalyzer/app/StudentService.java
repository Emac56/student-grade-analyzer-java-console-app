package com.studentgradeanalyzer.app;

public class StudentService {
    
    private Student student;
    
    public StudentService(Student student) {
        
        this.student = student;
    }
    
    public String createStudent(
    String studentName,
    int quizScore,
    int midtermScore,
    int finalScore
    ) {
        
        int average = calculateFinalAverage(quizScore,midtermScore,finalScore);
        
        String status = calculateClassification(average);
        
        student.setStudentName(studentName);
        student.setQuizScore(quizScore);
        student.setMidtermScore(midtermScore);
        student.setFinalScore(finalScore);
        student.setAverage(average);
        student.setStatus(status);
        
        return "Student Successfully created.";
    }
    
    public String calculateClassification(int average) {
        
        if (average >= 90 && average <= 100) {
            
            return "Excellent";
        }
        if (average >= 80 && average <= 89) {
            
            return "Very Good";
        }
        
        if (average >= 75 && average <= 79) {
            
            return "Good";
        }
        
        if (average <= 75) {
            
            return "Failed";
        }
        
        return " ";
    }
    public int calculateFinalAverage(
    int quizScore,
    int midtermScore,
    int finalScore
    ) {
        
        return (quizScore + midtermScore + finalScore) / 3;
    }
}