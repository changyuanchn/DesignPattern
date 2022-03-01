package com.changyuan.remoteControlDemo;

import com.changyuan.remoteControlDemo.CommandPackages.Command;
import com.changyuan.remoteControlDemo.CommandPackages.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n----------Remote Control------\n");
        for (int i = 0; i < 7; i++) {
            stringBuffer.append("[slot " + i + "]" + onCommands[i].getClass().getName() + "   "
                    + offCommands.getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
