package com.studentgradeanalyzer.app;
import java.util.Scanner;

public class Util {
    
    private Scanner scanner;
    
    public Util(Scanner scanner) {
        
        this.scanner = scanner;
    }
    public String inputString(String msg) {
        
        System.out.print(msg);
        String val = scanner.nextLine();
        return val;
    }
    
    public int inputInt(String msg) {
        
        System.out.print(msg);
        String val = scanner.nextLine();
        return Integer.parseInt(val);
    }
}