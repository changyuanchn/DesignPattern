package com.changyuan.CommandPattern.remoteControlDemo.CommandPackages;

public class NoCommand implements Command {
    public void execute()
    {
        System.out.println("No Command");
    }
}
