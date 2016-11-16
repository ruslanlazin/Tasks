package ua.pp.lazin.inner.task4;

/**
 * @author Ruslan Lazin
 *         2. Создайте открытый интерфейс, содержащий хотя бы один метод.
 *         Реализуйте его в закрытом внутреннем классе. Дополните внешний
 *         класс порождающим методом, который возвращает ссылку на
 *         созданный объект внутреннего класса. Какой вид классов
 *         предпочтительнее при этом использовать: внутренний или
 *         вложенный?
 *         3. Повторите предыдущее задание, определив внутренний класс
 *         внутри порождающего метода.
 *         4. Повторите предыдущее задание, определив вместо локального
 *         внутреннего класса анонимный.
 */
public class Outer {

    private int field = 1;

    public SomeInterface create() {

        return new SomeInterface() {
            @Override
            public void someMethod() {
                System.out.println("in interface impl( anonymous class )");
                System.out.println(field);
            }
        };

    }
}
