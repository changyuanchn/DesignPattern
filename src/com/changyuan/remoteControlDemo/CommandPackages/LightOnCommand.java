package com.changyuan.remoteControlDemo.CommandPackages;

import com.changyuan.remoteControlDemo.devices.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
