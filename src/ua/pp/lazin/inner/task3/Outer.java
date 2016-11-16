package ua.pp.lazin.inner.task3;

/**
 * @author Ruslan Lazin
 *         <p>
 *         2. Создайте открытый интерфейс, содержащий хотя бы один метод.
 *         Реализуйте его в закрытом внутреннем классе. Дополните внешний
 *         класс порождающим методом, который возвращает ссылку на
 *         созданный объект внутреннего класса. Какой вид классов
 *         предпочтительнее при этом использовать: внутренний или
 *         вложенный?
 *         3. Повторите предыдущее задание, определив внутренний класс
 *         внутри порождающего метода.
 *         <p>
 *         4. Повторите предыдущее задание, определив вместо локального
 *         <p>
 *         внутреннего класса анонимный.
 */
public class Outer {

    private int field = 1;

    public SomeInterface create() {

        class Inner implements SomeInterface {

            @Override
            public void someMethod() {
                System.out.println("in interface impl( local class )");
                System.out.println(field);
            }
        }
        return new Inner();
    }
}
