package com.changyuan.adapterDemo;

import com.changyuan.adapterDemo.animals.Duck;
import com.changyuan.adapterDemo.animals.MallardDuck;
import com.changyuan.adapterDemo.animals.WildTurkey;

public class adapterTest {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdaptor = new TurkeyAdapter(wildTurkey);

        System.out.println("Turkey says:");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("MallardDuck says:");
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("A new Duck says:");
        turkeyAdaptor.quack();
        turkeyAdaptor.fly();
    }
}
