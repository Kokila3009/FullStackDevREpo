package com.gentech.callbyvalue.value;
class CallByregerence {
    int x;
    int y;

    void calc(CallByregerence ob) {
        ob.x *= 5;
        ob.y *= 2;
        System.out.println(ob.x + " within method");
        System.out.println(ob.y + " within method");
    }
}

public class CallByReferences {
    public static void main(String[] args) {
        CallByregerence ob = new CallByregerence();
        ob.x = 20;
        ob.y = 30;
        ob.calc(ob);
        System.out.println(ob.x + " " + ob.y);
    }
}
