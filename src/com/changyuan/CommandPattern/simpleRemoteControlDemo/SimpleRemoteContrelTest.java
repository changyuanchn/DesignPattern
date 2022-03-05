package com.changyuan.CommandPattern.simpleRemoteControlDemo;

public class SimpleRemoteContrelTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCmd lightOn = new LightOnCmd(light);
        remote.setCommand(lightOn);
        remote.buttonPressed();
    }
}
