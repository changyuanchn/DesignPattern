package com.changyuan.CommandPattern.remoteControlAddUndoDemo.CommandPackages;

import com.changyuan.CommandPattern.remoteControlAddUndoDemo.devices.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {light.off();}
}
