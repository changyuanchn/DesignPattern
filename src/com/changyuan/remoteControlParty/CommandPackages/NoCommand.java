package com.changyuan.remoteControlParty.CommandPackages;

public class NoCommand implements Command {
    public void execute()
    {
        System.out.println("No Command");
    }
    public void undo() {}
}
