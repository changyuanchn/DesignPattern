package com.changyuan.simpleRemoteControlDemo;

public class LightOnCmd implements Command {
    Light light;

    public LightOnCmd(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
