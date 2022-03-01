package com.changyuan.remoteControlParty.CommandPackages;

import com.changyuan.remoteControlParty.devices.Stereo;

public class StereOnWithCDCommand implements Command {
    Stereo stereo;

    public StereOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(1024);
    }

    public void undo() {
        stereo.off();
    }
}
