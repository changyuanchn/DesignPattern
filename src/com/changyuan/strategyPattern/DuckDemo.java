package com.changyuan.strategyPattern;

abstract class Duck{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){
    }
    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }
    public void performFly() {
        flyBehavior.fly();
    }
    public void swim() {
        System.out.println("Swimming!");
    }
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}

class ModelDuck extends Duck{
    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }
    public void display(){
        System.out.println("I am ModelDuck");
    }
}

class MallarDuck extends Duck{
    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("I am MallarDuck");
    }
}

public class DuckDemo {
    public static void main(String[] args) {
        Duck mallarDuck = new MallarDuck();
        mallarDuck.display();
        mallarDuck.performQuack();
        mallarDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPower());
        modelDuck.performFly();
    }
}



