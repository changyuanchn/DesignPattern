package com.changyuan.remoteControlAddUndoDemo.CommandPackages;

import com.changyuan.remoteControlAddUndoDemo.devices.Light;

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
