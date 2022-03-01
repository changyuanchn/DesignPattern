package com.changyuan.naiveRemoteControlDemo;

import com.changyuan.simpleRemoteControlDemo.Command;

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
