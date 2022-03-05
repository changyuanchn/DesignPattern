package com.changyuan.CommandPattern.remoteControlAddUndoDemo.CommandPackages;

public interface Command {
    public void execute();
    public void undo();
}
