package com.changyuan.remoteControlAddUndoDemo.CommandPackages;

public interface Command {
    public void execute();
    public void undo();
}
