package com.changyuan.CommandPattern.remoteControlDemo;

import com.changyuan.CommandPattern.remoteControlDemo.CommandPackages.LightOffCommand;
import com.changyuan.CommandPattern.remoteControlDemo.CommandPackages.LightOnCommand;
import com.changyuan.CommandPattern.remoteControlDemo.CommandPackages.StereOffWithCDCommand;
import com.changyuan.CommandPattern.remoteControlDemo.CommandPackages.StereOnWithCDCommand;
import com.changyuan.CommandPattern.remoteControlDemo.devices.Light;
import com.changyuan.CommandPattern.remoteControlDemo.devices.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // 将所有的装置放到合适的位置上
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        StereOnWithCDCommand stereOnWithCDComand = new StereOnWithCDCommand(stereo);
        StereOffWithCDCommand stereOffWithCDComand = new StereOffWithCDCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereOnWithCDComand, stereOffWithCDComand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);

        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);

        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
    }
}
