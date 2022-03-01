package com.changyuan.statePattern.GumballDemo;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Sorry, the gumball is sold out!");
    }

    public void ejectQuarter() {
        System.out.println("You cannont eject eht quarter because you have not insert a quarter!");
    }

    public void turnCrank() {
        System.out.println("Sorry, the gumball is sold out, you cannot turn crank!");
    }

    public void dispense() {
        System.out.println("No gumball dispensed!");
    }
}
