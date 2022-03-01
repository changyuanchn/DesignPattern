package com.changyuan.remoteControlAddUndoDemo;

import com.changyuan.remoteControlAddUndoDemo.CommandPackages.*;
import com.changyuan.remoteControlAddUndoDemo.devices.CeilingFan;
import com.changyuan.remoteControlAddUndoDemo.devices.Light;
import com.changyuan.remoteControlAddUndoDemo.devices.Stereo;

public class RemoteLoaderWithUndo {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        // 将所有的装置放到合适的位置上
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo();
        CeilingFan ceilingFan = new CeilingFan("Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        StereOnWithCDCommand stereOnWithCDComand = new StereOnWithCDCommand(stereo);
        StereOffWithCDCommand stereOffWithCDComand = new StereOffWithCDCommand(stereo);

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand CeilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereOnWithCDComand, stereOffWithCDComand);
        remoteControl.setCommand(3, ceilingFanHighCommand, CeilingFanOffCommand);
        remoteControl.setCommand(4, ceilingFanMediumCommand, CeilingFanOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.undoButtonPressed();

        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.undoButtonPressed();

        remoteControl.onButtonWasPressed(2);
        remoteControl.undoButtonPressed();

        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);
        remoteControl.undoButtonPressed();

        remoteControl.onButtonWasPressed(4);
        remoteControl.undoButtonPressed();

    }
}
