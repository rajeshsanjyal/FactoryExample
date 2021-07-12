package com.asterisk.factory;


public class WinFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WinButton();
    }
}
