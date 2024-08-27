package com.gentech.stringmethods;

public class patternString {
    public static void main(String[] args) {
        String str = "PROGRAM";
        
       
        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(str.charAt(j) + " ");
            }
            System.out.println();
        }
        
        
        for (int i = str.length() - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(str.charAt(j) + " ");
            }
            System.out.println();  
        }
    }
}
