package ua.pp.lazin.inner.task2a;

/**
 * @author Ruslan Lazin
 *          2. Создайте открытый интерфейс, содержащий хотя бы один метод.
 *         Реализуйте его в закрытом внутреннем классе. Дополните внешний
 *         класс порождающим методом, который возвращает ссылку на
 *         созданный объект внутреннего класса. Какой вид классов
 *         предпочтительнее при этом использовать: внутренний или
 *         вложенный?
 */
public class Outer {

    private static int staticField = 1;
    public int getInnerField(){
        return new Inner().innerField;
    }

    public SomeInterface create() {
        return new Inner();
    }

    private static class Inner implements SomeInterface {
        int innerField = 6;

        @Override
        public void someMethod() {
            System.out.println("in interface impl");
            System.out.println("NonStatic value of Outer" + staticField);
        }
    }
}
