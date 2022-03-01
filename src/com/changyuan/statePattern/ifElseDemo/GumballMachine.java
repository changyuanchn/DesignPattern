package com.changyuan.statePattern.ifElseDemo;

public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            this.state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("Already has a quarter, you cannot insert another quarter!");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("Insert a quarter!");
        } else if (state == SOLD_OUT) {
            System.out.println("The gumball is sold out!");
        } else if (state == SOLD) { // 这个状态不应该走到
            System.out.println("Please wait, we already giving you a gumball!");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("Quarter returned!");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("You had not insert a quarter!");
        } else if (state == SOLD_OUT) {
            System.out.println("You cannot eject because you have not insert a quarter!");
        } else if (state == SOLD) {
            System.out.println("Sorry we already given you a gumball, you cannot eject quarter!");
        }
    }

    public void turnCrank() {
        if (state == HAS_QUARTER) {
            System.out.println("You turning....");
            state = SOLD;
            dispense();
        } else if (state == NO_QUARTER) {
            System.out.println("Please insert a quarter!");
        } else if (state == SOLD_OUT) {
            System.out.println("You cannot turn the crank, the gumball is already sold out");
        } else if (state == SOLD) {
            System.out.println("Sorry we already given you a gumball, you cannot turn crank again!");
        }
    }

    public void dispense() {
        if (state == HAS_QUARTER) {
            System.out.println("No gumball dispensed");
        } else if (state == NO_QUARTER) {
            System.out.println("You need to pay first!");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        } else if (state == SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            count--;
            if (count == 0) {
                System.out.println("Oops, out of gumballs!");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        }
    }
}
