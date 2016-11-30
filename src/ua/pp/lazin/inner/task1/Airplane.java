package ua.pp.lazin.inner.task1;

/**Можно ли реализовать класс AirplaneEngine (двигатель) как

 внутренний класс для класса Airplane (самолет)? В каком случае

 внутренний класс имеет смысл объявлять открытым/защищенным?

 Определите сласс Engine внутри класса AirplaneEngine. Вынесите в

 отдельный интерфейс IEngine методы класса AirplaneEngine и

 реализуйте их в классе AirplaneEngine. Определите класс Airplane,

 имеющий несколько двигателей.
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
