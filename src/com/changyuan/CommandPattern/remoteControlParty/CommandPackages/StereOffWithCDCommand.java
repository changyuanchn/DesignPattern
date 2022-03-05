package com.changyuan.CommandPattern.remoteControlParty.CommandPackages;

import com.changyuan.CommandPattern.remoteControlParty.devices.Stereo;

public class StereOffWithCDCommand implements Command {
    Stereo stereo;

    public StereOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }

    public void undo() {
        stereo.on();
    }
}

