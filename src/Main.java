public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка!На ноль делить нельзя.");
        }
    }
}
/* Программа не работает из-за того что b=0,в математике на ноль делить нельзя,если
 b!=0 то программа будет работать.А решить эту ошибку можно способом который предупредит что
  b=0.С помощью ловли ошибок Exception.Как выше реализовано,если b=0,он сообщает об ошибке,иначе
  выполняет действие.
 */








