package com.asterisk.factory;

public class Application {
    public static void main(String[] args) {

        GUIFactory button=new WinFactory();
        Button result = button.createButton();
        result.paint();
//        System.out.println(result);
    }
}
