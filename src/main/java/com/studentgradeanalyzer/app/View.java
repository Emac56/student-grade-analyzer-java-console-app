package com.studentgradeanalyzer.app;
import java.util.Scanner;
public class View {
    
    private Student student;
    private StudentController studentController;
    private Util util;
    
    public View(
    Student student,
    StudentController studentController,
    Util util
    ) {
        
        this.student = student;
        this.studentController = studentController;
        this.util = util;
    }
    
    public void start() {
        
        boolean run = true;
        while (run) {
            
            String studentName = util.inputString("Student name : ");
            int quizScore = util.inputInt("Quiz Score : ");
            int midtermScore = util.inputInt("Midterm Score : ");
            int finalScore = util.inputInt("Final Score : ");
            
            System.out.println();
            String msg = studentController.createStudent(
            studentName,
            quizScore,
            midtermScore,
            finalScore
            );
            
            System.out.println(msg);
            System.out.println();
            
            showInfo();
            System.out.println();
            continue;
        }
    }
    
    public void showInfo() {
        
        System.out.println("==== STUDENT REPORT ====");
        System.out.println("Student : " + student.getStudentName());
        System.out.println("Id      : " + student.getId());
        System.out.println();
        System.out.println("Quiz    : " + student.getQuizScore());
        System.out.println("Midterm : " + student.getMidtermScore());
        System.out.println("Final   : " + student.getFinalScore());
        System.out.println();
        System.out.println("Average : " + student.getAverage());
        System.out.println();
        System.out.println("Status  : " + student.getStatus());
        return;
    }
}

//Integer quizScore = Util.inputInt("Quiz Score : ");
            //Integer midtermScore = Util.inputInt("Midterm score : ");
          //  Integer finalScore = Util.inputInt("Final Score : ");