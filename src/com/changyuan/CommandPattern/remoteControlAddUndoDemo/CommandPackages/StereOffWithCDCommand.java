package com.changyuan.CommandPattern.remoteControlAddUndoDemo.CommandPackages;

import com.changyuan.CommandPattern.remoteControlAddUndoDemo.devices.Stereo;

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

