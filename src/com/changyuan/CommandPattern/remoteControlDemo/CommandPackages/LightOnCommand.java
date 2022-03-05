package com.changyuan.CommandPattern.remoteControlDemo.CommandPackages;

import com.changyuan.CommandPattern.remoteControlDemo.devices.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
