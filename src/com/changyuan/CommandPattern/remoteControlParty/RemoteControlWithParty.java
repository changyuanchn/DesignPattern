package com.changyuan.CommandPattern.remoteControlParty;

import com.changyuan.CommandPattern.remoteControlParty.CommandPackages.Command;
import com.changyuan.CommandPattern.remoteControlParty.CommandPackages.NoCommand;

public class RemoteControlWithParty{
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithParty() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonPressed() {
        undoCommand.undo();
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
