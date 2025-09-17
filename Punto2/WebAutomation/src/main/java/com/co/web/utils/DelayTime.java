package com.co.web.utils;

public enum DelayTime {

    INTERFACE_OBJECT(40),
    SHORT_WAIT(10);


    private int second;

    DelayTime(int second) {
        this.second = second;
    }

    public int getSecond() {
        return second;
    }
}
