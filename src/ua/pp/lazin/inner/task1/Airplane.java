package ua.pp.lazin.inner.task1;

/**
 * Created by Ruslan on 11/9/2016.
 */
public class Airplane {
    AirplaneEngine leftEngine;
    AirplaneEngine rightEngine;


    public class AirplaneEngine implements IEngine {
        @Override
        public void getFullPower() {
            Engine engine = new Engine();
            engine.turnOn();
            System.out.println("U-U-UUU");
        }

        public class Engine {
            void turnOn(){
                System.out.println("turnedOn");
                leftEngine = new AirplaneEngine();
            }
        }

    }

    public AirplaneEngine getLeftEngine() {
        return leftEngine;
    }

    public void setLeftEngine(AirplaneEngine leftEngine) {
        this.leftEngine = leftEngine;
    }

    public AirplaneEngine getRightEngine() {
        return rightEngine;
    }

    public void setRightEngine(AirplaneEngine rightEngine) {
        this.rightEngine = rightEngine;
    }
}
