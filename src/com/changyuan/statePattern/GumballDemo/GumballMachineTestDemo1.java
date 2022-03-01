package com.changyuan.statePattern.GumballDemo;

public class GumballMachineTestDemo1 {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println("--------------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("--------------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }
}
