package com.changyuan.CommandPattern.remoteControlParty.CommandPackages;

import com.changyuan.CommandPattern.remoteControlParty.devices.TV;

public class TVOnCommand implements Command {
    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.on();
    }

    public void undo() {tv.off();}

}
