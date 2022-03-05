package com.changyuan.CommandPattern.remoteControlDemo.CommandPackages;

import com.changyuan.CommandPattern.remoteControlDemo.devices.Stereo;

public class StereOffWithCDCommand implements Command {
    Stereo stereo;

    public StereOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }
}

