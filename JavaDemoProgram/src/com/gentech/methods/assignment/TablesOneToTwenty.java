package com.gentech.methods.assignment;

class Tables {
    void Tables1(int st, int stp) {
        for (int i = st; i <= stp; i++) {
            for (int k = 1; k <= 10; k++) {
                System.out.println(i + " * " + k + " = " + (i * k));
            }
            System.out.println();
        }
    }
}

public class TablesOneToTwenty {
    public static void main(String[] args) {
        int st = 1;
        int stp = 20;
        Tables ob = new Tables();
        ob.Tables1(st, stp);
    }
}
