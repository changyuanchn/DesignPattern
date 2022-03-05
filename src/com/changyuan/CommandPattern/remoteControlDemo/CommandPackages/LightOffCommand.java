package com.changyuan.CommandPattern.remoteControlDemo.CommandPackages;

import com.changyuan.CommandPattern.remoteControlDemo.devices.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
