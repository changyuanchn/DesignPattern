package com.changyuan.remoteControlParty.CommandPackages;

public interface Command {
    public void execute();
    public void undo();
}
