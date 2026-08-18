package com.studentgradeanalyzer.app;

public class StudentController {
    
    private StudentService studentService;
    
    public StudentController(StudentService studentService) {
        
        this.studentService = studentService;
    }
    
    public String createStudent(
    String studentName,
    int quizScore,
    int midtermScore,
    int finalScore) {
        
        String msg = studentService.createStudent(
        studentName,quizScore,midtermScore,finalScore
        );
        
        return msg;
    }
}