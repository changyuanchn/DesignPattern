package com.changyuan.compositePattern;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
//        simulator.simulate();
    }
    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = new QuackCount(new GooseAdaptor(new Goose()));

        Flock flocks = new Flock();
        flocks.add(mallardDuck);
        flocks.add(redheadDuck);
        flocks.add(duckCall);
        flocks.add(rubberDuck);
        flocks.add(goose);

        Flock flockOfMallard = new Flock();
        Quackable mallardduckOne = duckFactory.createMallardDuck();
        Quackable mallardduckTwo = duckFactory.createMallardDuck();
        Quackable mallardduckThree = duckFactory.createMallardDuck();
        Quackable mallardduckFour = duckFactory.createMallardDuck();
        flockOfMallard.add(mallardduckOne);
        flockOfMallard.add(mallardduckTwo);
        flockOfMallard.add(mallardduckThree);
        flockOfMallard.add(mallardduckFour);
        flocks.add(flockOfMallard);

        System.out.println("\nDuck Simlulator");
        Quackologist quackologist = new Quackologist();
//        flocks.registerObserver(quackologist);
        simulate(flocks);

        System.out.println("\nMallardDuck Simlulator");
        flockOfMallard.registerObserver(quackologist);
        simulate(flockOfMallard);

        System.out.println("\nThe ducks quacked " + QuackCount.getNumOfQuacks() + " times.");
    }

    void simulate() {
        Quackable mallardDuck = new QuackCount(new MallardDuck());
        Quackable redheadDuck = new QuackCount(new RedheadDuck());
        Quackable duckCall = new QuackCount(new DuckCall());
        Quackable rubberDuck = new RubberDuck();
        Quackable goose = new QuackCount(new GooseAdaptor(new Goose()));

        System.out.println("\nDuck Simlulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);

        System.out.println("\nThe ducks quacked " + QuackCount.getNumOfQuacks() + " times.");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
