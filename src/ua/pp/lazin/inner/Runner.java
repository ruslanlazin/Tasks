package ua.pp.lazin.inner;

public class Runner {

    public static void main(String[] args) {
        Airplane bbj = new Airplane();
        Airplane.AirplaneEngine leftEngine = bbj. new AirplaneEngine();
        Airplane.AirplaneEngine rightEngine = bbj. new AirplaneEngine();

        bbj.leftEngine = leftEngine;

        leftEngine.getFullPower();
        rightEngine.getFullPower();

        System.out.println("taking off");

    }
}
