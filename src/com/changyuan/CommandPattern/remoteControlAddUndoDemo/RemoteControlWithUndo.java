package com.changyuan.CommandPattern.remoteControlAddUndoDemo;

import com.changyuan.CommandPattern.remoteControlAddUndoDemo.CommandPackages.Command;
import com.changyuan.CommandPattern.remoteControlAddUndoDemo.CommandPackages.NoCommand;

public class RemoteControlWithUndo{
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo() {
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
