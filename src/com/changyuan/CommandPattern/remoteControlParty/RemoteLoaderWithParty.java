package com.changyuan.CommandPattern.remoteControlParty;

import com.changyuan.CommandPattern.remoteControlParty.CommandPackages.*;
import com.changyuan.CommandPattern.remoteControlParty.devices.TV;
import com.changyuan.CommandPattern.remoteControlParty.devices.Light;
import com.changyuan.CommandPattern.remoteControlParty.devices.Stereo;


public class RemoteLoaderWithParty {
    public static void main(String[] args) {
        RemoteControlWithParty remoteControl = new RemoteControlWithParty();

        // 将所有的装置放到合适的位置上
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo();
        TV tv = new TV("tv");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        StereOnWithCDCommand stereOnWithCDComand = new StereOnWithCDCommand(stereo);
        TVOnCommand tvOnCommand = new TVOnCommand(tv);

        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        StereOffWithCDCommand stereOffWithCDComand = new StereOffWithCDCommand(stereo);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);

        Command[] partyOn = {livingRoomLightOn, kitchenLightOn, tvOnCommand, stereOnWithCDComand};
        Command[] partyOff = {livingRoomLightOff, kitchenLightOff, tvOffCommand, stereOffWithCDComand};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);


        System.out.println(remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
    }
}
