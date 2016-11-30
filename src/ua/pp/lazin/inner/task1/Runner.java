package ua.pp.lazin.inner.task1;

public class Runner {

    public static void main(String[] args) {
        Airplane bbj = new Airplane();
        Airplane.AirplaneEngine leftEngine = bbj. new AirplaneEngine();
        Airplane.AirplaneEngine rightEngine = bbj. new AirplaneEngine();

        bbj.leftEngine = leftEngine;

        leftEngine.getFullPower();
        rightEngine.getFullPower();

        Airplane.AirplaneEngine.Engine spareEngine = new Airplane().new AirplaneEngine().new Engine();

        System.out.println("taking off");

    }
}
