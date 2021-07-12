package com.asterisk.factory;

public class WinButton implements Button {

    @Override
    public void paint() {

        System.out.println("Render a button in a windows style");
    }
}
