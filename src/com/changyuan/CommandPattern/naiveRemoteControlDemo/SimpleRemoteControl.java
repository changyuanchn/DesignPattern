package com.changyuan.CommandPattern.naiveRemoteControlDemo;

public class SimpleRemoteControl {
    Light light;
    TV tv;
    public SimpleRemoteControl() {
        light = new Light();
        tv = new TV();
    };

    public void buttonPressed() {
        light.on();
        tv.on();
    }
}
