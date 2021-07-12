package com.asterisk.factory;

public class OSXFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new OSXButton();
    }
}
