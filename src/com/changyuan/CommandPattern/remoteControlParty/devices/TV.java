package com.changyuan.CommandPattern.remoteControlParty.devices;

public class TV {
    String name;

    public TV () {};

    public TV(String name) {
        this.name = name;
    }

    public void on () {
        System.out.println(this.name + " TV on!");
    }

    public void off () {
        System.out.println(this.name + " TV off!");
    }

}
