package com.changyuan.statePattern.ifElseDemo;

public class GumballMachineTestDemo {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println("--------------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("--------------------");
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        System.out.println("--------------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.turnCrank();

        System.out.println("--------------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        System.out.println("--------------------");
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();

        System.out.println("--------------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

    }
}
