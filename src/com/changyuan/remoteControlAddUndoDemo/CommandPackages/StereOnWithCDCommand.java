package com.changyuan.remoteControlAddUndoDemo.CommandPackages;

import com.changyuan.remoteControlAddUndoDemo.devices.Stereo;

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
