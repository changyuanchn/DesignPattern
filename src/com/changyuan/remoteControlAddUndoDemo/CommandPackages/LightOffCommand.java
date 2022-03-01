package com.changyuan.remoteControlAddUndoDemo.CommandPackages;

import com.changyuan.remoteControlAddUndoDemo.devices.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() { light.on(); }
}
