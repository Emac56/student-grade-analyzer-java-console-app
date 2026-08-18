package com.studentgradeanalyzer.app;
import java.util.Scanner;

public class App {
    
    private Scanner scanner;
    private Util util;
    private Student student;
    private StudentService studentService;
    private StudentController studentController;
    private View view;
    
    public static void main(String[] args) {
        
        try {
            
            var obj = new App();
            obj.run(args);
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
    
    public void run(String[] args) throws Exception {
        
        scanner = new Scanner(System.in);
        util = new Util(scanner);
        student = new Student();
        studentService = new StudentService(student);
        studentController = new StudentController(studentService);
        view = new View(student,studentController,util);
        
        view.start();
    }
}