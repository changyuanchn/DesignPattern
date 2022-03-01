package com.changyuan.remoteControlDemo.CommandPackages;

import com.changyuan.remoteControlDemo.devices.Stereo;

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
}
