package com.itstep.homework.task;

import com.itstep.homework.breakfast.*;
import com.itstep.homework.breakfast.operation.Operation;
import com.itstep.homework.classes.*;
import com.itstep.homework.game_person.GamePerson;
import com.itstep.homework.teapot.Teapot;

import java.util.Arrays;

/**
 * homework 03
 *
 * @author kaa
 * @version 1.0
 * @see "https://vertex-academy.com/tutorials/ru/cikly-v-java/"
 * @see "https://vertex-academy.com/tutorials/ru/operator-break-java/"
 * @see "https://vertex-academy.com/tutorials/ru/operator-perexoda-continue-java/"
 * @see "https://vertex-academy.com/tutorials/ru/cikl-for-each/"
 * @see "https://vertex-academy.com/tutorials/ru/massivy-v-java/"
 * @see "https://vertex-academy.com/tutorials/ru/sortirovka-puzyrkom-v-java/"
 */
public class Homework {

    /**
     * создай кота, таким каким ты его представляешь, создай обьект кота
     */
    public void task1() {
        // твой код: start

        Cat cat = new Cat("Murza", 15);
        System.out.println(cat);

        // твой код: end
    }

    /**
     * создай машину, такой какой ты ее представляешь, создай обьект машины
     */
    public void task2() {
        // твой код: start
        Car car = new Car("Toyota", "Silver", 2022);
        System.out.println(car);
        // твой код: end
    }

    /**
     * создай человека, таким каким ты его представляешь, создай обьект человека
     */
    public void task3() {
        // твой код: start
        Person person = new Person("Alexander", "Sadovnikov", 42, 175, 75);
        System.out.println(person);
        // твой код: end
    }

    /**
     * попробуйте сложить свой утренний завтрак из нескольких блюд
     * каждое блюдо - отдельный обьект (пример: чай)
     * каждый ингридиент - отдельный обьект (пример: мед, лимон, вода, листья чая)
     */
    public void task4() {
        // твой код: start
        Breakfast breakfast = new Breakfast();
        System.out.println(breakfast);
        // твой код: end
    }

    /**
     * попробуй создать чайник, в который ты отправляешь воду, листья чая, мед, лимон и получаешь чай
     */
    public void task5() {
        // твой код: start
        System.out.println(Teapot.cookTea());
        // твой код: end
    }

    /**
     * тебе нужно создать пользователя системы со списком его телефонов
     */
    public void task6() {
        // твой код: start
        UserSystem userSystem = new UserSystem("Alexander", "SadovNick");
        userSystem.addNumber("+375445919125");
        userSystem.addNumber("+375447563011");
        System.out.println(userSystem);
        //userSystem.printPhones();

        // твой код: end
    }

    /**
     * тебе нужно создать менеджера системы со списком его контактных данных<br>
     * 3 телефона, два email, skype, адрес<br>
     * в идеальном решении будет наличие сортировки контактов в представленном порядке
     */
    public void task7() {
        // твой код: start
        UserManager userManager = new UserManager("Alexander", "SadovNick", "г.Гомель, " +
                "ул. Маневича 18-81");
        userManager.addPhoneNumber("6543123");
        userManager.addPhoneNumber("87965465");
        userManager.addPhoneNumber("1212132");
        userManager.addEmail("kgh@khk");
        userManager.addEmail("897987@khk");
        userManager.addSkype("dssdff@ssdfsdfdsf");
        userManager.printUser();
        // твой код: end
    }

    /**
     * создайте Еву, создайте Адама<br>
     * свяжите обьекты по принципу: у мужа есть жена, у жены есть муж<br>
     * попробуйте вывести их на экран
     */
    public void task8() {
        // твой код: start
        Eva eva = new Eva();
        Adam adam = new Adam(eva);
        System.out.println(adam);
        // твой код: end
    }

    /**
     * создайте класс женщины таким образом, чтобы при инициализации полей ее пол всегда был женским<br>
     * защитите это поле от влияния
     */
    public void task9() {
        // твой код: start
        Woman eva = new Woman("Eva");
        System.out.println(eva);
        // твой код: end
    }

    /**
     * при создании системы, мы хотели помочь пользователю и сделать систему более отзывчивой<br>
     * с этой целью мы создали класс-конвертер<br>
     * он получает строку набранную в английской раскладке и преобразует ее в текст на кирилице<br>
     * согласно расположению букв на клавиатуре<br>
     * если символ не найден, то вернуть тот, который пришел (для примера: !@#$%^&*()_+)
     */
    public void task10() {
        // твой код: start
        System.out.println(Converter.convert("лрплаghjkgigig++++"));
        // твой код: end
    }

    /**
     * попробуй решить предыдущее задание, но с учетом одного условия<br>
     * если количество русских букв преобладает, то вернуть строку в пришедшем виде
     */
    public void task11() {
        // твой код: start
        System.out.println(Converter.checkLetter("khgjhgkjhg7878-//ljklззззззззззззззззззззззззззззз"));
        // твой код: end
    }

    /**
     * у игрового персонажа есть экипировка, дополнительные предметы и сумка<br>
     * так же он может управлять ездовым животным, их может быть два и более
     */
    public void task12() {
        // твой код: start
        GamePerson alex = new GamePerson("SadovNick", 1, 1);
        alex.addMount("Cow", 0);
        alex.addMount("Lama", 1);
        alex.setHealth(100);
        System.out.println(alex);
        // твой код: end
    }

    /**
     * у тебя есть класс Operation
     * с методом который будет искать в строке скобки '(' и ')'
     * нужно подсчитать их количество, сообщить, что их количество равно
     */
    public void task13() {
        // твой код: start
        String str = " ()99(((dfgdfg)))sfs";
        int coutBrackets = Operation.bracketCount(str);
        System.out.println(coutBrackets);
        // твой код: end
    }

    /**
     * у тебя есть класс Operation
     * с методом который будет возвращать подстроку между символами '(' и ')'
     */
    public void task14() {
        // твой код: start
        String str = "hhh(ALEXANDER)n,n,";
        str = Operation.retBetweenBrackets(str);
        System.out.println(str);
        // твой код: end
    }

    /**
     * у тебя есть класс Operation
     * с методом который будет возвращать из строки "1.23+4.56"
     * первое число
     */
    public void task15() {
        // твой код: start
        String str = "1.23+4.56";
        double result = Operation.RetFirstNumber();
        System.out.println(result);
        // твой код: end
    }

    /**
     * тоже самое, только со вторым числом
     */
    public void task16() {
        // твой код: start
        String str = "1.23+4.56";
        double result = Operation.RetSecondNumber();
        System.out.println(result);
        // твой код: end
    }

    /**
     * воспользоваться операциями предыдущих заданий
     * и сложить два числа
     */
    public void task17() {
        String result = "" + Operation.addRetNumbers(); // запиши сюда результат вычислений
        // твой код: start
        // твой код: end
        System.out.println("5.79".equalsIgnoreCase(result) ? "решение правильное" : "решение неправильное");
    }

    /**
     * у тебя есть класс Operation<br>
     * с методом который удаляет все дубликаты символов в строке<br>
     * но порядок не затрагивает
     */
    public void task18() {
        // твой код: start
        String duplicates = Operation.removeDuplicates("saaaa999dddd888ff11gghhdrtyuy");
        System.out.println(duplicates);
        // твой код: end
    }

    /**
     * у тебя есть класс Operation<br>
     * с методом который удаляет из строки все лишние символы кроме чисел
     */
    public void task19() {
        // твой код: start
        String removeDigit = Operation.removeDigit("sdfsdf8989sdfsdf");
        System.out.println(Operation.removeDigit(removeDigit));
        // твой код: end
    }

    /**
     * у тебя есть класс Operation<br>
     * с методом который проверяет, является ли содержимое строки числом
     */
    public void task20() {
        // твой код: start
        boolean checkNumber = Operation.isCheckNumber("-9879879.789");
        System.out.println(checkNumber);
        // твой код: end
    }

    /**
     * у тебя есть класс Operation<br>
     * с методом который проверяет:<br>
     * чтобы строка не начиналась на закрывающую скобку ')'<br>
     * чтобы строка не заканчивалась на открывающую скобку '('
     */
    public void task21() {
        // твой код: start
        boolean isBracketCorrect = Operation.isBracketsCorrect(" )SadovNick)");
        System.out.println(isBracketCorrect);
        // твой код: end
    }

    /**
     * у тебя есть класс Operation<br>
     * а в нем есть два метода которые проверяют строку на скобки '(' и ')'<br>
     * попробуй создать метод, который будет принимать строку и возвращать результат работы двух этих методов
     */
    public void task22() {
        // твой код: start
        String str = "Sadov(Nick)";
        boolean result = Operation.isHasBrackets(str);
        System.out.println(result);
        // твой код: end
    }

    /**
     * тоже самое, только с инвертированным ответом
     */
    public void task23() {
        // твой код: start
        String str = "Sadov(Nick)";
        boolean result = Operation.isHasBracketsInvert(str);
        System.out.println(result);
        // твой код: end
    }

    /**
     * у тебя есть класс Operation<br>
     * в нем есть метод, который заменит в строке "1+2*3+4" "2*3" на 5
     */
    public void task24() {
        // твой код: start
        String str = "1+2*3+4";
        System.out.println(Operation.replaceStrUniv(str));
        // твой код: end
    }

    /**
     * тоже самое, но решение должно быть универсальным, подходящим для строк:<br>
     * "1+2*3+4"<br>
     * "12+3*4+5"<br>
     * "12+3*4+56"<br>
     * "12+34*5+67"<br>
     * "12+3*45+67"<br>
     * "12+34*56+78"<br>
     * "1.2+3.4*5.6+7.8"<br>
     * скорее всего, тут надо передать следующие параметры:<br>
     * - цельная строка<br>
     * - координаты врезки<br>
     * - результат умножения
     */
    public void task25() {
        // твой код: start
        String str = "1.2+3.4*5.6+7.8";
        System.out.println(Operation.replaceStrUniv(str));
        // твой код: end
    }

    /**
     * у тебя есть класс Operation с методом<br>
     * попробуй найти в строке скобки и решить уравнение внутри них<br>
     * 1+(2+3)+4
     */
    public void task26() {
        // твой код: start
        String str = Operation.equationInsideBrackets("1+(269-3)+4)");
        System.out.println(str);
        // твой код: end
    }

    /**
     * у тебя есть класс Operation с методом<br>
     * попробуй найти в строке первое число в строке левее математического символа, чья координата тебе известна
     * "1+2"
     */
    public void task27() {
        // твой код: start
        String str = "711/2333";
        System.out.println(Operation.numLeftSymbol(str));
        // твой код: end
    }

    /**
     * у тебя есть класс Operation с методом<br>
     * попробуй найти в строке первое число в строке левее математического символа, чья координата тебе известна
     * "1.2+3"
     */
    public void task28() {
        // твой код: start
        String str = "-7.2002202*2333";
        System.out.println(Operation.numLeftSymbol(str));
        // твой код: end
    }

    /**
     * у тебя есть класс Operation с методом<br>
     * попробуй найти в строке первое число в строке правее математического символа, чья координата тебе известна
     * "1.2+3.4"
     */
    public void task29() {
        // твой код: start
        String str = "7.11*23.335";
        System.out.println(Operation.numRightSymbol(str));
        // твой код: end
    }

    /**
     * у тебя есть класс Operation с методом<br>
     * попробуй доказать, что эти строки содержат (или нет) число
     * "0" (да)
     * "1" (да)
     * "1-" (нет)
     * "-1" (да)
     * "-1.2" (да)
     * "-1.2." (нет)
     * ".1.2." (нет)
     * ".-1.2." (нет)
     * "+123" (нет)
     */
    public void task30() {
        // твой код: start
        System.out.println(Operation.isCheckNumber("0"));
        System.out.println(Operation.isCheckNumber("1"));
        System.out.println(Operation.isCheckNumber("1-"));
        System.out.println(Operation.isCheckNumber("-1"));
        System.out.println(Operation.isCheckNumber("-1.2"));
        System.out.println(Operation.isCheckNumber("-1.2."));
        System.out.println(Operation.isCheckNumber(".1.2."));
        System.out.println(Operation.isCheckNumber(".-1.2."));
        System.out.println(Operation.isCheckNumber("+123"));
        // твой код: end
    }
}
