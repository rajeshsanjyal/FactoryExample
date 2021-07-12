package com.asterisk.factory;

public class OSXButton implements Button {
    @Override
    public void paint(){
        System.out.println("Render a button in a osx style");
    }

}
