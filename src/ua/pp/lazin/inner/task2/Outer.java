package ua.pp.lazin.inner.task2;

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

    private int field = 1;

    public ua.pp.lazin.inner.task3.SomeInterface create() {
        return new Inner();
    }

    private class Inner implements ua.pp.lazin.inner.task3.SomeInterface {

        @Override
        public void someMethod() {
            System.out.println("in interface impl");
            System.out.println("NonStatic value of Outer" + field);
        }
    }
}
