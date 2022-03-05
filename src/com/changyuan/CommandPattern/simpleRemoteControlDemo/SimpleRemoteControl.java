package com.changyuan.CommandPattern.simpleRemoteControlDemo;

public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl() {};

    public void setCommand(Command cmd) {
        slot = cmd;
    }

    public void buttonPressed() {
        slot.execute();
    }
}
