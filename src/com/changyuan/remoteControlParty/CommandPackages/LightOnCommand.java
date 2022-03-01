package com.changyuan.remoteControlParty.CommandPackages;

import com.changyuan.remoteControlParty.devices.Light;

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
