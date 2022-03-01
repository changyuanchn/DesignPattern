package com.changyuan.remoteControlParty.CommandPackages;

import com.changyuan.remoteControlParty.devices.Stereo;

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

