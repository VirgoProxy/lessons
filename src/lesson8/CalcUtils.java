package lesson8;
//оператор final - если используем для класса, то мы запрещаем наследоваться от этого класса

public final class CalcUtils {
    //свойства final - должны быть определены сразу же(то есть мы сразу обязаны присвоить ему значение), либо в конструкторе, в последствие значение изменить нельзя(константа)
    //принято писать название в верхнем регистре, каждое последующее слово пишется после нижнего подчеркивания
    final double PI_VAR;

    public CalcUtils() {
        PI_VAR = 3.14;
    }

    //final методы нельзя переопределять в дочерних классах

    public final void someVoid(final int num, final SomeClass sc, final int[] arr) {
        System.out.println(num);
        //final аргументы в методе доступны только для чтения
        //  num = 90;
        System.out.println(sc);
        System.out.println(sc.name);
        sc.name = "Новое имя";
        //sc = new SomeClass(); - так нельзя
        arr[4] = 34; // массив менять не можем, можем менять объекты внутри него
    }
    class SomeClass {
        String name;
    }
    //оператор static
    //static свойства и методы не принадлежат к объектам, они пренадлежат к классам
    //static принадлежит к классу
    //static методы используются как вспомогательные(часто для расчетов и различных вычеслений)
    public static int summ(int a, int b) {
        return a + b;
    }
    static final double PI;//обычно константы описываются так
    //статический блок, закгружается в память один раз, соответственно выполняется один раз
    //в статических методах мы не можем обращаться к нестатическим свойствам и методам
    static {
        PI = 3.14;
    }
}